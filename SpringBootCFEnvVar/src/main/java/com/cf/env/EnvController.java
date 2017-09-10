package com.cf.env;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cf/env")
public class EnvController {
	@RequestMapping(value="/hi")
	public ResponseEntity env(){
		return new ResponseEntity("hi", new HttpHeaders(), HttpStatus.OK);
	}
	
	@RequestMapping("/env")
	public void env(HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.println("System Properties:");
		for (Map.Entry<Object, Object> property : System.getProperties().entrySet()) {
			out.println(property.getKey() + ": " + property.getValue());
		}
		out.println();
		out.println("System Environment:");
		for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
			out.println(envvar.getKey() + ": " + envvar.getValue());
		}
	}

}
