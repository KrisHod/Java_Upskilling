package com.fdmgroup.inheritanceExercises;

public class AdminUser extends UserAccount{
	
	public AdminUser(String username, String password, String fullNAme) {
		super(username, password, fullNAme);
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website with admin rights");
	}

}
