package com.quake.app;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quake.beans.Features;
import com.quake.service.QuakeDataService;

@RestController
@RequestMapping("/quake/nc")
public class QuakeDataController {

	@Autowired
	private QuakeDataService service;

	public QuakeDataController() {
		super();
		Date dt = new Date();
		System.out.println(dt);
	}
	@RequestMapping(value="/hi")
	public ResponseEntity hi(){
		return new ResponseEntity("hi", new HttpHeaders(), HttpStatus.OK);
	}

	@RequestMapping( value = "/mageq/{mag}")
	public List<Features> getAllOfMag(@PathVariable double mag) {
		return service.getAllOfMag( mag );
	}
	
	@RequestMapping(value = "/mag/{mag}")
	public List<Features> getAllHigherThan(@PathVariable double mag) {
		return service.getAllHigherThan(mag);
	}
	
	@RequestMapping(value = "/placenames/{mag}")
	public List<String> getAllNamesHigherThan(@PathVariable double mag) {
		return service.getAllNamesHigherThan(mag);
	}
	
	@RequestMapping(value = "/place/{place}")
	public List<Features> getAllWithPlace(@PathVariable String place) {
		return service.getAllWithPlace( place );
	}
	
	@RequestMapping(value = "/id/{id}")
	public List<Features> getById(@PathVariable String id) {
		return service.getAllById( id );
	}
	@RequestMapping("/")
	public List<Features> getAllQuakes() {
		return service.getAllQuakes();
	}
}