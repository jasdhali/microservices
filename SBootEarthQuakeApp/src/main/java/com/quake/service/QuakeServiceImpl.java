package com.quake.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.quake.beans.Features;

@Service
public class QuakeServiceImpl implements QuakeService {

	@Autowired
	private ApplicationContext appContext;


	@Override
	public List<Features> getAllHigherThan(double magnitude) {
		List<Features> features = new ArrayList<Features>();
		EarthQuakeDatabase quakeDatabase = (EarthQuakeDatabase) appContext.getBean("quakeDatabase");
		if (quakeDatabase != null) {
			if (quakeDatabase.getDataRoot() != null) {
				System.out.println("@@@@@@@@" + quakeDatabase.toString() + "@@@@@@@@@@@");
				features.addAll(quakeDatabase.getDataRoot().getFeatures().stream()
						.filter(e -> e.getProperties().getMag() >= magnitude).collect(Collectors.toList()));
			}
		}
		return features;
	}
	
	public List<Features> getAllWithPlace(String place) {
		List<Features> features = new ArrayList<Features>();
		EarthQuakeDatabase quakeDatabase = (EarthQuakeDatabase) appContext.getBean("quakeDatabase");
		if (quakeDatabase != null) {
			if (quakeDatabase.getDataRoot() != null) {
				System.out.println("@@@@@@@@" + quakeDatabase.toString() + "@@@@@@@@@@@");
				features.addAll(quakeDatabase.getDataRoot().getFeatures().stream()
						.filter(e -> e.getProperties().getPlace().indexOf( place) !=-1 ).collect(Collectors.toList()));
			}
		}
		return features;
	}
	
	@Override
	public List<Features> getAllQuakes() {
		List<Features> features = new ArrayList<Features>();
		EarthQuakeDatabase quakeDatabase = (EarthQuakeDatabase) appContext.getBean("quakeDatabase");
		if (quakeDatabase != null) {
			if (quakeDatabase.getDataRoot() != null) {
				System.out.println("@@@@@@@@" + quakeDatabase.toString() + "@@@@@@@@@@@");
				features.addAll(quakeDatabase.getDataRoot().getFeatures());
			}

		}
		return features;
	}
	
	;
}
