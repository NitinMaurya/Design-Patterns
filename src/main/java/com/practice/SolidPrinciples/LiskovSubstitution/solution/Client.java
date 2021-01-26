package com.practice.SolidPrinciples.LiskovSubstitution.solution;

public class Client {
	public static void main(String[] args) {
		WithdrawalAccount currentAccount = new CurrentAccount();
		WithdrawalAccount savingsAccount = new SavingsAccount();
		Account fixedDepositAccount = new FixedDepositAccount();
		Double amount = 500d;

		deposit(currentAccount, amount);
		deposit(savingsAccount, amount);
		deposit(fixedDepositAccount, amount);

		withdraw(currentAccount, amount);
		withdraw(savingsAccount, amount);
	}

	public static void withdraw(WithdrawalAccount account, Double amount) {
		account.withdraw(amount);
	}

	public static void deposit(Account account, Double amount) {
		account.deposit(amount);
	}
}
