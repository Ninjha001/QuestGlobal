package com.travelbooking.www;

public class Flight extends Travel {
	private static final double baseRate = 60;
	public double getBaseFarePerKm() {
		return baseRate;
	}
}
