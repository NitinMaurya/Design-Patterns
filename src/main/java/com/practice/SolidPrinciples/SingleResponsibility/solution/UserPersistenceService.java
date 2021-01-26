package com.practice.SolidPrinciples.SingleResponsibility.solution;

//A separate class for handling persistence 
public class UserPersistenceService {

	private Store store = new Store();
	
	public void saveUser(User user) {
		store.store(user);
	}
}
