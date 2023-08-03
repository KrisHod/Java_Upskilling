package com.fdmgroup.polymorphismExercises;

public class AdminUser extends UserAccount {

	private static int minAdminPasswordLength;

	public AdminUser(String username, String password, String fullNAme) {
		super(username, password, fullNAme);
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website with admin rights");
	}

	public static int getMinAdminPasswordLength() {
		return minAdminPasswordLength;
	}

	public static void setMinAdminPasswordLength(int minAdminPasswordLength) {
		AdminUser.minAdminPasswordLength = minAdminPasswordLength;
	}

	public boolean changePassword(String newPass, String confirmPass) {
	    if (newPass.equals(confirmPass) && newPass.length() >= minAdminPasswordLength) {
	        this.setPassword(newPass);
	        System.out.println("Password changed successfully.");
	        return true;
	    } else {
	        System.out.println("Password change failed. Make sure the passwords match and are at least " + minAdminPasswordLength + " characters long.");
	        return false;
	    }
	}

	public void changePassword(String newPass, String confirmPass, UserAccount account) {
		if (newPass.equals(confirmPass) && newPass.length() >= minAdminPasswordLength) {
			account.setPassword(newPass);
			System.out.println("Password changed successfully.");
		} else {
			System.out.println("Password change failed. Make sure the passwords match and are at least "
					+ minAdminPasswordLength + " characters long.");
		}
	}

}
