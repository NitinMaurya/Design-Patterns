package com.practice.SolidPrinciples.LiskovSubstitution.solution;

public class FixedDepositAccount implements Account {
	@Override
	public void deposit(Double amount) {
		System.out.printf("Depositing %s rupees in Fixed Deposit Account%n", amount);
	}
}
