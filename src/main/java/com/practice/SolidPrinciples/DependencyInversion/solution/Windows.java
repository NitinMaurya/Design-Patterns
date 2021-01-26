package com.practice.SolidPrinciples.DependencyInversion.solution;

import lombok.Data;

@Data
public class Windows {
	private Keyboard keyboard;	// loosely coupled with the abstract implementation of keyboard
	private Monitor monitor;	// loosely coupled with the abstract implementation of monitor

	Windows(Keyboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}
