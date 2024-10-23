package com.onlinefooddelivery.www;

public class BillCalculator {
	public double calculateBill(double orderAmount) {
		return orderAmount;
	}
	
	public double calculateBill(double orderAmount, double discount) {
		return orderAmount - discount;
	}
	
	public double calculateBill(double orderAmount, double discount, Customer customerType) {
		double discountAmount = orderAmount * discount;
		return orderAmount - discountAmount;
	}
	
}
