package com.fdmgroup.inheritanceExercises;

public abstract class UserAccount {

	private String username;
	private String password;
	private String fullNAme;

	public UserAccount(String username, String password, String fullNAme) {
		super();
		this.username = username;
		this.password = password;
		this.fullNAme = fullNAme;
	}

	public boolean changePassword(String newPass, String confirmPass) {
		if (newPass.equals(confirmPass)) {
			password = newPass;
			return true;
		} else {
			return false;
		}

	}

	public abstract void accessWebsite();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public String getFullNAme() {
		return fullNAme;
	}

	public void setFullNAme(String fullNAme) {
		this.fullNAme = fullNAme;
	}

}
