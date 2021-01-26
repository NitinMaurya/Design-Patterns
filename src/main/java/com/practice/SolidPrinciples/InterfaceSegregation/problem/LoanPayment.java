package com.practice.SolidPrinciples.InterfaceSegregation.problem;

import java.util.Arrays;
import java.util.List;

public class LoanPayment implements Payment {
	@Override
	public void initiatePayment() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String status() {
		return "ACTIVE";
	}

	@Override
	public List<Object> getPaymentList() {
		return Arrays.asList("Payment 3", "Payment 4");
	}

	@Override
	public void initiateLoanSettlement() {
		System.out.println("Initiating Loan Settlement");
	}

	@Override
	public void initiateLoanRepayment() {
		System.out.println("Initiating Loan repayment");
	}
}
