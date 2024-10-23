package com.travelbooking.www;

public class Train extends Travel {
	private static final double baseRate = 40;
	public double getBaseFarePerKm() {
		return baseRate;
	}
}
