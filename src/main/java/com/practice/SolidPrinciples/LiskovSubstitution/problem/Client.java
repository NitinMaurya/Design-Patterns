package com.practice.SolidPrinciples.LiskovSubstitution.problem;


public class Client {
	public static void main(String[] args) {
		Account currentAccount = new CurrentAccount();
		Account savingsAccount = new SavingsAccount();
		Account fixedDepositAccount = new FixedDepositAccount();
		Double amount = 500d;

		deposit(currentAccount, amount);
		deposit(savingsAccount, amount);
		deposit(fixedDepositAccount, amount);

		withdraw(currentAccount, amount);
		withdraw(savingsAccount, amount);
		withdraw(fixedDepositAccount, amount);
	}

	public static void withdraw(Account account, Double amount) {
		account.withdraw(amount);
	}

	public static void deposit(Account account, Double amount) {
		account.deposit(amount);
	}
}
