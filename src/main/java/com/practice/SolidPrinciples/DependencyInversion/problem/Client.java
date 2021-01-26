package com.practice.SolidPrinciples.DependencyInversion.problem;

public class Client {
	public static void main(String[] args) {
		Windows windows = new Windows(new StandardKeyboard(), new StandardMonitor());
		// Windows windows2 = new Windows(new AdvanceKeyboard(), new AdvanceMonitor());  // cannot plug advance keyboard or advance montior
	}
}
