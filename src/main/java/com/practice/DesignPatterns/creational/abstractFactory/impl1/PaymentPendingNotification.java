package com.practice.DesignPatterns.creational.abstractFactory.impl1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentPendingNotification implements Notification {
	@Override
	public void send(String message) {
		log.info("your payment {} is pending for booking", message);
	}
}
