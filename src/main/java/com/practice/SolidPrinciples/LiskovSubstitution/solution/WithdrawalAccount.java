package com.practice.SolidPrinciples.LiskovSubstitution.solution;

public interface WithdrawalAccount extends Account {
	void withdraw(Double amount);
}
