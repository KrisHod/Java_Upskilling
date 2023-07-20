
public class module3 {

	public static void main(String[] args) {
		String alienColour = "yellow";

		/*
		 * if (alienColour.equals("green")){
		 * System.out.println("you've just earned 5 points!"); }
		 * 
		 * if (alienColour.equals("red")){
		 * System.out.println("you've just earned 10 points!"); }
		 * 
		 * if (alienColour.equals("yellow")){
		 * System.out.println("you've just earned 15 points!"); }
		 */

		if (alienColour.equals("green")) {
			System.out.println("you've just earned 5 points!");
		} else if (alienColour.equals("red")) {
			System.out.println("you've just earned 10 points!");
		} else if (alienColour.equals("yellow")) {
			System.out.println("you've just earned 15 points!");
		} else {
			System.out.println("invalid colour");
		}

		System.out.println("****************************");

		int age = 4;
		if (age < 2) {
			System.out.println("You're a baby");
		} else if (age < 4) {
			System.out.println("You're a toddler");
		} else if (age < 13) {
			System.out.println("You're a child");
		} else if (age < 20) {
			System.out.println("You're a teenager");
		} else if (age < 65) {
			System.out.println("You're a working age adult");
		} else {
			System.out.println("You're a pensioner");
		}

		System.out.println("****************************");

		int salary = 450000;

		if (salary > 150000) {
			System.out.println("45%");
		} else if (salary > 50000) {
			System.out.println("40%");
		} else if (salary > 12500) {
			System.out.println("20%");
		} else {
			System.out.println("0%");
		}

	}

}
