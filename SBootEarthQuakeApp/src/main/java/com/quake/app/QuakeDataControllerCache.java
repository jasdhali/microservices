package com.quake.app;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quake.beans.Features;
import com.quake.service.QuakeService;

@RestController
@RequestMapping("/quake")
public class QuakeDataControllerCache {

	@Autowired
	private QuakeService service;

	public QuakeDataControllerCache() {
		super();
		Date dt = new Date();
		System.out.println(dt);
	}

	
	@RequestMapping(value = "/mag/{mag}")
	public List<Features> getAllHigherThan(@PathVariable double mag) {
		return service.getAllHigherThan(mag);
	}
	
	@RequestMapping(value = "/place/{place}")
	public List<Features> getAllWithPlace(@PathVariable String place) {
		return service.getAllWithPlace( place );
	}
	
	@RequestMapping("/")
	public List<Features> getAllQuakes() {
		return service.getAllQuakes();
	}


}
