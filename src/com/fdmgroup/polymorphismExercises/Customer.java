package com.fdmgroup.polymorphismExercises;

public class Customer extends UserAccount {

	public Customer(String username, String password, String fullNAme) {
		super(username, password, fullNAme);
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website as customer");
	}

	@Override
	public boolean changePassword(String newPass, String confirmPass) {
		if (newPass.equals(confirmPass) && newPass.length() >= 7) { // Minimum password length of 7
			this.setPassword(newPass);
			System.out.println("Password changed successfully.");
			return true;
		} else {
			System.out.println(
					"Password change failed. Make sure the passwords match and are at least 7 characters long.");
			return false;
		}
	}
}
