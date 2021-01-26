package com.practice.SolidPrinciples.DependencyInversion.problem;

public class StandardMonitor implements Monitor {
	@Override
	public void display(String content) {
		System.out.println(content);
	}
}
