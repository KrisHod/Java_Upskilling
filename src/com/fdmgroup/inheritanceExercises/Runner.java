package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {
		
		AdminUser adminUser1 = new AdminUser ("John", "123", "John Rock");
		AdminUser adminUser2 = new AdminUser ("Bill", "1234", "Bill Rey");
		
		Customer customer1 = new Customer("Alex", "qwe", "Alexander Noc");
		Customer customer2 = new Customer("Bar", "qwe", "Barac Obama");
		
		System.out.println(adminUser1.changePassword("888", "888"));
		System.out.println(adminUser2.changePassword("88", "888"));
		
		adminUser1.accessWebsite();
		customer1.accessWebsite();
	}

}
