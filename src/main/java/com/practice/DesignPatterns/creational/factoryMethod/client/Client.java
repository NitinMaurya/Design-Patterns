package com.practice.DesignPatterns.creational.factoryMethod.client;


import com.practice.DesignPatterns.creational.factoryMethod.Logger;
import com.practice.DesignPatterns.creational.factoryMethod.LoggerFactory;
import com.practice.DesignPatterns.creational.factoryMethod.LoggerType;

public class Client {
	public static void main(String[] args) {
		Logger inMemoryLogger = LoggerFactory.getInstance(LoggerType.IN_MEMORY_LOGGER);
		inMemoryLogger.log("Hello");

		Logger fileLogger = LoggerFactory.getInstance(LoggerType.FILE_LOGGER);
		fileLogger.log("Hey! there");
	}
}
