package com.carrental.api;

import java.util.HashMap;

public class Trip {
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	int distance = 0 ;
	String destination;
	String source; 
	
	
	
	public Double getDistance(String source, String destination) {
		HashMap<String, Double> citiMatcher = new HashMap<String, Double>();
		citiMatcher.put("Pune", 1.1);
		citiMatcher.put("Mumbai", 2.11);
		citiMatcher.put("Bangalore", 3.13);
		citiMatcher.put("Chennai", 4.15);
		citiMatcher.put("Delhi", 5.17);
		
		HashMap<Double, Double> distanceMapper = new HashMap<Double, Double>();
		distanceMapper.put(3.21, 200.0);
		distanceMapper.put(4.23, 1000.0);
		distanceMapper.put(7.28, 2050.0);
		distanceMapper.put(6.26, 1234.5);
		
		if(null!=citiMatcher.get(source) && null!=citiMatcher.get(destination)) {
			return distanceMapper.get(citiMatcher.get(source)+citiMatcher.get(destination));
		}else {
			return 0.0;
		}
		
		
	}
	

}
