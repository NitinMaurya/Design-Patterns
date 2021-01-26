package com.practice.SolidPrinciples.InterfaceSegregation.problem;

import java.util.Arrays;
import java.util.List;

public class BankPayment implements Payment {
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

	@Override
	public void initiateLoanSettlement() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void initiateLoanRepayment() {
		throw new UnsupportedOperationException();
	}
}
