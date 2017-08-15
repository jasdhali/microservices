package com.quake.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.quake.beans.Features;

public interface QuakeDataService {
	
	public List<Features> getAllQuakes();
	public List<Features> getAllHigherThan(double magnitude);
	public List<String> getAllNamesHigherThan(double magnitude);
	public List<Features> getAllOfMag(double magnitude);
	public List<Features> getAllWithPlace(String plcae);
	public List<Features> getAllById(String id);

}
