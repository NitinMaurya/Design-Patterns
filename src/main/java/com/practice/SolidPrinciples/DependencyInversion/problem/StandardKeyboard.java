package com.practice.SolidPrinciples.DependencyInversion.problem;

public class StandardKeyboard implements Keyboard {

	@Override
	public void write(String content) {
		System.out.println(content);
	}
}
