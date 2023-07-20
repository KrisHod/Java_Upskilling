import java.util.Arrays;

public class module5 {
	
	public static int getPoints(String alienColour){
		if (alienColour.equals("green")){
			return 5;
		} 

		if (alienColour.equals("red")){
			return 10;
		} 
				
		if (alienColour.equals("yellow")){
			return 15;
		} 

		return 0;
	}
	
	public static long sumOfNumbersUpTo(int endNumber){
		long total = 0;
				
		for (int count = 1; count <= endNumber; count++){
			total += count;
		}
						
		return total;
	}
	
	
	public static void displayTimesTable(int table){
		for (int count = 1; count<= 12; count++){
			System.out.println(count+" x "+table+" = "+(count*table));
		}
	}
	
	public static boolean leapYear(int year) {
		if (year%4 != 0) {
			return false;
		}
				
		if (year%400 == 0) {
			return true;
		}
				
		if (year%100 == 0) {
			return false;
		}
				
		return true;
	}


	public static int maxNumber(int[] array) {
		Arrays.sort(array);
		int highestIndex = array.length-1;
		int maximum = array[highestIndex];
		return maximum;
	}


	public static void main(String[] args) {
		
		int points = getPoints("green");
		System.out.println("Your’ve scored " + points + "!");
		
		System.out.println("****************************");
		
		System.out.println(sumOfNumbersUpTo(5));
		System.out.println("****************************");
		
		displayTimesTable(2);
		System.out.println("****************************");
		
		System.out.println(leapYear(2000));
		System.out.println("****************************");
		
		int[] array = {1, 2, 3, 7};
		System.out.println(maxNumber(array));
	
	}
}
	


