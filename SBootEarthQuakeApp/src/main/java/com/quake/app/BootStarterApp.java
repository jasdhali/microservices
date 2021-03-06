package com.quake.app;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

import com.quake.beans.EarthDataRoot;
import com.quake.service.EarthQuakeDatabase;


@SpringBootApplication(scanBasePackages={"com.quake"})
public class BootStarterApp {
	private  EarthDataRoot dataRoot;   
	
	private static final Logger log = LoggerFactory.getLogger(BootStarterApp.class);


    
    public static void main(String args[]) {
		ConfigurableApplicationContext context = SpringApplication.run(BootStarterApp.class);
	}
    
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
    
    
    @Bean(name="quakeDatabase")
    @Scope("singleton" )
    public EarthQuakeDatabase getQuakeData(){
    	return new EarthQuakeDatabase();
    }
    
    
    @Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			dataRoot = 
	        		restTemplate.getForObject("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);
	        if( dataRoot !=null ){
	        	//log.info( dataRoot.toString() );
	        	getQuakeData().setDataRoot(dataRoot);
	        }	
			
		};
	}
    
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                //System.out.println(beanName);
            }

        };
    }

	@Override
	public String toString() {
		return "EarthQuakeDatabase [dataRoot=" + dataRoot + "]";
	}
	
}