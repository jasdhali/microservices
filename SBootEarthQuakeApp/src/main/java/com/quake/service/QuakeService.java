package com.quake.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.quake.beans.Features;

public interface QuakeService {
	
	public List<Features> getAllQuakes();
	public List<Features> getAllHigherThan(double magnitude);
	public List<Features> getAllWithPlace(String plcae);

}
