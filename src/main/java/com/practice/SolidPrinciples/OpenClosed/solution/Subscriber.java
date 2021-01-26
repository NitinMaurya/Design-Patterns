package com.practice.SolidPrinciples.OpenClosed.solution;

import lombok.Data;

@Data
//base class - closed for modification
public abstract class Subscriber {
	
	protected Long subscriberId;

	protected String address;

	protected Long phoneNumber;
	
	protected int baseRate;

	public abstract double calculateBill(); //this method is open for extension
    
}
