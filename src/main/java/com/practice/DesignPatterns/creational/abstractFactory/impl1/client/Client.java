package com.practice.DesignPatterns.creational.abstractFactory.impl1.client;


import com.practice.DesignPatterns.creational.abstractFactory.impl1.Notification;
import com.practice.DesignPatterns.creational.abstractFactory.impl1.NotificationFactory;
import com.practice.DesignPatterns.creational.abstractFactory.impl1.NotificationType;

public class Client {
	public static void main(String[] args) {
		Notification notification1 = NotificationFactory.getInstance(NotificationType.TASK_COMPLETE);
		notification1.send("Task 1");

		Notification notification2 = NotificationFactory.getInstance(NotificationType.BOOKING_START);
		notification2.send("2");
	}
}
