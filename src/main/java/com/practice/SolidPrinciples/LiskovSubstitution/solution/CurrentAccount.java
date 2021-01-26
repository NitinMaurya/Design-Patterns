package com.practice.SolidPrinciples.LiskovSubstitution.solution;

public class CurrentAccount implements WithdrawalAccount {
	@Override
	public void deposit(Double amount) {
		System.out.printf("Depositing %s rupees in Current Account%n", amount);
	}

	@Override
	public void withdraw(Double amount) {
		System.out.printf("Withdrawing %s rupees from Current Account%n", amount);
	}
}
