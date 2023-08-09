package com.fdmgroup.exceptionsExercises;

public class ExceptionsExamples {

	public static void main(String[] args) {
		String str = "Java";
		try {
			int ind = str.indexOf("X");
			if (ind >= 0) {
				System.out.println(str.substring(ind));
			} else {
				System.out.println("Substring not found");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
