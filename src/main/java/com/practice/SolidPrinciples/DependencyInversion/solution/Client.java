package com.practice.SolidPrinciples.DependencyInversion.solution;

public class Client {
	public static void main(String[] args) {
		Windows windows = new Windows(new StandardKeyboard(), new StandardMonitor());
		Windows windows1 = new Windows(new AdvanceKeyboard(), new StandardMonitor());
		Windows windows2 = new Windows(new StandardKeyboard(), new AdvanceMonitor());
		Windows windows3 = new Windows(new AdvanceKeyboard(), new AdvanceMonitor());
	}
}
