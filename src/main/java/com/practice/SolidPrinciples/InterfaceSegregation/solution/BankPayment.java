package com.practice.SolidPrinciples.InterfaceSegregation.solution;

import java.util.Arrays;
import java.util.List;

public class BankPayment implements Bank {
	@Override
	public void initiatePayment() {
		System.out.println("Initiating payment");
	}

	@Override
	public String status() {
		return "ACTIVE";
	}

	@Override
	public List<Object> getPaymentList() {
		return Arrays.asList("Payment 1", "Payment 2");
	}
}
