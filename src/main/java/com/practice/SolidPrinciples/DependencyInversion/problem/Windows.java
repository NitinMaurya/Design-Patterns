package com.practice.SolidPrinciples.DependencyInversion.problem;

import lombok.Data;

@Data
public class Windows {
	private StandardKeyboard keyboard;	// tightly coupled with the concrete implementation of keyboard
	private StandardMonitor monitor;	// tightly coupled with the concrete implementation of monitor

	Windows(StandardKeyboard keyboard, StandardMonitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}
