package com.practice.SolidPrinciples.DependencyInversion.solution;

public class StandardKeyboard implements Keyboard {

	@Override
	public void write(String content) {
		System.out.println(content);
	}
}
