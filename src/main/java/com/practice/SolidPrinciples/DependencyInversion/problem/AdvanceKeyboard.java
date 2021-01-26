package com.practice.SolidPrinciples.DependencyInversion.problem;

public class AdvanceKeyboard implements Keyboard {

	@Override
	public void write(String content) {
		System.out.println(content);
	}
}
