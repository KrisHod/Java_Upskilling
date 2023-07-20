package com.fdmgroup.inheritanceExercises;

public class Customer extends UserAccount{

	public Customer(String username, String password, String fullNAme) {
		super(username, password, fullNAme);		
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website as customer");
	}

}
