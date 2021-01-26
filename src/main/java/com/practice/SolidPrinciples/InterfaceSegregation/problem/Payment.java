package com.practice.SolidPrinciples.InterfaceSegregation.problem;

import java.util.List;

public interface Payment {
	void initiatePayment();
	String status();
	List<Object> getPaymentList();

	// New methods added for Loan Payment
	void initiateLoanSettlement();
	void initiateLoanRepayment();
}
