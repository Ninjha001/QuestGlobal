package com.travelbooking.www;

public class Bus extends Travel {
	private static final double baseRate = 20.0;
	
	public double getBaseFarePerKm() {
		return baseRate;
	}
}
