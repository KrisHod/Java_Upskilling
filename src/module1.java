
public class module1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		String name = "Kris";
		System.out.println(name);
		
		String concat = "Hi, " + name;
		System.out.println(concat);
		
		String substring = concat.substring(6);
		System.out.println(substring);
		
		//Wrapper//
		
		Integer b = new Integer (10);
		
		//Exercise//
		String firstName = "Kristina";
		String secondName = "Hodomska";
		String fullName = firstName + " " + secondName;
		
		System.out.println(fullName);
		System.out.println(firstName.length());
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.charAt(0));
		System.out.println(firstName.charAt(firstName.length()-1));
		
		String s1 = "this is a sentence";
		System.out.println(s1.indexOf(' '));
		System.out.println(s1.lastIndexOf(' '));
		System.out.println(s1.lastIndexOf(' '));
		System.out.println(s1.indexOf('x'));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.substring(10));
		System.out.println(s1.substring(5,9));
		System.out.println(s1.contains("a"));
		System.out.println(s1.contains("x"));
		
		s1 = "is "+s1+"?";
		System.out.println(s1);
		
		s1 = s1.replaceFirst("t", "T");		
		System.out.println(s1);
		
		int favNum = 3;
		System.out.println("My favourite number is " + favNum);
		
		int n1 = 5;
		int n2 = 3;		
		System.out.println(n1 + n2);
		
		int counter = 0;
		counter++;
		counter +=5;
		counter --;
		counter -=2;
		counter *=2;
		System.out.println(counter);

		
		




		
		
		

	}

}
