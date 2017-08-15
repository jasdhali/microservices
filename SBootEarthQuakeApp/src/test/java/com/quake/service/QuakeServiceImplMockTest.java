package com.quake.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.quake.beans.Features;

@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuakeServiceImplMockTest {
	
    private QuakeDataService productServiceImpl;
    
    @Mock
    private Features feature;
    
    @Mock
	private RestTemplate restTemplate;

    
    @Before
    public void setupMock() {
        MockitoAnnotations.initMocks(this);
        productServiceImpl = new QuakeDataServiceImpl();
        restTemplate = new RestTemplate();
    }
    
	List<Features> listFeatures = new ArrayList<Features>();
	
    @Test
    public void getAllWithPlace_REQ_SUCCESS() throws Exception {
    	Mockito.when(productServiceImpl.getAllQuakes()).thenReturn(listFeatures);
        // Act    
        List<Features> retrievedFeatures = productServiceImpl.getAllQuakes();
        // Assert    
        assertNotNull(retrievedFeatures);
        //assertThat(retrievedProduct, is(equalTo(product)));
    }
    

}


