package com.practice.SolidPrinciples.DependencyInversion.solution;

public class StandardMonitor implements Monitor {
	@Override
	public void display(String content) {
		System.out.println(content);
	}
}
