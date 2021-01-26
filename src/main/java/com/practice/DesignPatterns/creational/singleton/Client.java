package com.practice.DesignPatterns.creational.singleton;

import com.practice.DesignPatterns.creational.singleton.impl3.LazyRegistryIODH;

public class Client {

	public static void main(String[] args) {
		LazyRegistryIODH singleton;
		
		
		singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		System.out.println(singleton == singleton2);
	}

}
