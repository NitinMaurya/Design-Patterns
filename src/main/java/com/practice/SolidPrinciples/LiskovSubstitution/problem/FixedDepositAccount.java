package com.practice.SolidPrinciples.LiskovSubstitution.problem;

public class FixedDepositAccount implements Account {
	@Override
	public void deposit(Double amount) {
		System.out.printf("Depositing %s rupees in Fixed Deposit Account%n", amount);
	}

	@Override
	public void withdraw(Double amount) {
		throw new UnsupportedOperationException("Withdrawal not available for Fixed Deposit Account");
	}
}
