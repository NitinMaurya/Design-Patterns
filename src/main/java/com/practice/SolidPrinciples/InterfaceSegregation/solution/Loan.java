package com.practice.SolidPrinciples.InterfaceSegregation.solution;

public interface Loan extends Payment {
	void initiateLoanSettlement();
	void initiateLoanRepayment();
}
