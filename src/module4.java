import java.util.ArrayList;

public class module4 {

	public static void main(String[] args) {
		String[] courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
		
		//for each loop
		for (String course : courses){
			System.out.println("I love learning "+course);
		}

//		ArrayList<String> courseList = new ArrayList<String>();
//		
//		for (String course : courses){
//			courseList.add(course);
//		}
//
//		for (String course : courseList){
//			System.out.println(course);
//		}
//		System.out.println("****************************");
//		
//		ArrayList<Double> prices = new ArrayList<Double>();
//		
//		prices.add(4.50);
//		prices.add(1.99);
//		prices.add(9.75);
//		prices.add(3.15);
//		prices.add(10.25);
//						
//		double total = 0.0;
//						
//		for (double price : prices){
//			total += price;
//		}
//						
//		System.out.println(total);
//		
//		System.out.println("****************************");
//
//		double[] priceArray = new double[5];
//		
//		int index = 0;
//						
//		for (double price : prices){
//			priceArray[index] = price;
//			index ++;
//		}
//
//		System.out.println("****************************");
//		
//		String string = "10,7,25,3,8";
//		
//		String[] numbers = string.split(",");
//						
//		int total1 = 0;
//						
//		for (String number : numbers){
//			total1 += Integer.parseInt(number);
//		}
//		System.out.println(total1);
//		System.out.println("****************************");
//		
//		// for loop 
//		/*for (int x = 1; x <= 1000000; x++){
//			System.out.println(x);
//		}
//
//		long total2 = 0;
//		
//		for (int x = 1; x <= 1000000; x++){
//			total2 += x;
//		}
//						
//		System.out.println(total2);
//		
//		for (int x = 1; x <= 20; x+=2){
//			System.out.println(x);
//		}*/
//
//		//Three times table
//		for (int x = 1; x<= 12; x++){
//			System.out.println(x+" x 3 = "+(x*3));
//		}
//
//		System.out.println("****************************");
//		//While Loops
//		int count = 1;
//		
//		while (count <= 1000000){
//			System.out.println(count);
//			count ++;
//		}
//		
//		char letter = 'a';
//		
//		while (letter <= 'z'){
//			System.out.println(letter);
//			letter++;
//		}
//
//		//loop with an if statement
//		String[] cities = { "Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle" };
//
//		for (String city : cities) {
//			if (city.charAt(0) == 'B') {
//				System.out.println(city + " -  match");
//				break;
//			} else {
//				System.out.println(city + " - doesn't match");
//			}
//		}

	}

}
