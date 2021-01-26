package com.practice.SolidPrinciples.DependencyInversion.problem;

public class AdvanceMonitor implements Monitor {
	@Override
	public void display(String content) {
		System.out.println(content);
	}
}
