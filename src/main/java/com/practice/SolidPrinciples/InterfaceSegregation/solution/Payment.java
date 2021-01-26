package com.practice.SolidPrinciples.InterfaceSegregation.solution;

import java.util.List;

public interface Payment {
	String status();
	List<Object> getPaymentList();
}
