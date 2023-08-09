package com.fdmgroup.exceptionsExercises;

import java.util.Scanner;

public class Password {
	public static void createPassword() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a password of at least 8 and no more than 12 characters");
			String password = input.next();
			if (password.length() < 8 || password.length() > 12) {
			    try {
			        throw new IllegalArgumentException("Incorrect length of password");
			    } catch (IllegalArgumentException e) {
			        System.out.println(e.getMessage());
			        createPassword();
			    }
			} else {
			    System.out.println("Password accepted");
			}
		}
	}

	public static void main(String[] args) {
		createPassword();
	}
}
