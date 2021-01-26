package com.practice.SolidPrinciples.LiskovSubstitution.problem;

public class SavingsAccount implements Account {
	@Override
	public void deposit(Double amount) {
		System.out.printf("Depositing %s rupees in Savings Account%n", amount);
	}

	@Override
	public void withdraw(Double amount) {
		System.out.printf("Withdrawing %s rupees from Savings Account%n", amount);
	}
}
