package com.quake.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.quake.beans.EarthDataRoot;
import com.quake.beans.Features;

@Service
public class QuakeDataServiceImpl implements QuakeDataService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Features> getAllHigherThan(double magnitude) {
		EarthDataRoot dataRoot = restTemplate.getForObject(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);

		List<Features> features = new ArrayList<Features>();
		// EarthQuakeDatabase quakeDatabase = (EarthQuakeDatabase)
		// appContext.getBean("quakeDatabase");
		if (dataRoot != null) {
			// System.out.println("@@@@@@@@" + dataRoot + "@@@@@@@@@@@");
			features.addAll(dataRoot.getFeatures().stream().filter(e -> e.getProperties().getMag() >= magnitude)
					.collect(Collectors.toList()));

		}
		return features;
	}

	@Override
	public List<Features> getAllOfMag(double magnitude) {
		EarthDataRoot dataRoot  = restTemplate.getForObject(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);
		List<Features> features = new ArrayList<Features>();
		if (dataRoot != null) {
			features.addAll(dataRoot.getFeatures().stream().filter(e -> e.getProperties().getMag() == magnitude)
					.collect(Collectors.toList()));
		}
		return features;
	}
	public List<Features> getAllWithPlace(String place) {
		List<Features> features = new ArrayList<Features>();
		EarthDataRoot dataRoot  = restTemplate.getForObject(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);
		if (dataRoot != null) {
			System.out.println("@@@@@@@@" + dataRoot + "@@@@@@@@@@@");
			features.addAll(dataRoot.getFeatures().stream()
					.filter(e -> e.getProperties().getPlace().indexOf(place) != -1).collect(Collectors.toList()));
		}
		return features;
	}

	@Override
	public List<Features> getAllQuakes() {
		List<Features> features = new ArrayList<Features>();
		EarthDataRoot dataRoot  = restTemplate.getForObject(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);
		if (dataRoot != null) {
				features.addAll(dataRoot.getFeatures());
			}

		return features;
	}
	
	public List<Features> getAllById(String id) {
		List<Features> features = new ArrayList<Features>();
		EarthDataRoot dataRoot  = restTemplate.getForObject(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);
		if (dataRoot != null) {
			System.out.println("@@@@@@@@" + dataRoot + "@@@@@@@@@@@");
			features.addAll(dataRoot.getFeatures().stream()
					.filter(e -> e.getId().equals( id )).collect(Collectors.toList()));
		}
		return features;
	}

	@Override
	public List<String> getAllNamesHigherThan(double magnitude) {
		EarthDataRoot dataRoot  = restTemplate.getForObject(
				"https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson", EarthDataRoot.class);
		//List<String> features = null;
		if (dataRoot != null) {
			return dataRoot.getFeatures().stream().filter(e -> e.getProperties().getMag() >= magnitude).
					map(f->f.getProperties().getPlace()).collect(Collectors.toList());
		}
		return null;
	}
}
