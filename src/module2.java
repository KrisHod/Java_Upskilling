import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class module2 {
	public static void main(String[] args) {
	String [] friends = {"Boris", "Katya", "Yorik", "Bobik", "Gosha"};
	
	System.out.println(friends.length);
	
	System.out.println(friends[0]);
	System.out.println(friends[1]);
	System.out.println(friends[2]);
	System.out.println(friends[3]);
	System.out.println(friends[4]);
	
	friends[4] = "Ben";
	
	Arrays.sort(friends);
	
	System.out.println(friends[0]);
	System.out.println(friends[friends.length-1]);
	friends[1] = null;
	System.out.println(friends.length);
	
	System.out.println("****************************");
	
	String[] pokerHand = new String[5];
	pokerHand[0] = "Queen of hearts";
	pokerHand[1] = "3 of spades";
	pokerHand[2] = "3 of diamonds";
	pokerHand[3] = "9 of hearts";
	pokerHand[4] = "6 of clubs";
	System.out.println(Arrays.toString(pokerHand));
	System.out.println("****************************");
	
	ArrayList<String> shoppingBasket = new ArrayList<String>();
	shoppingBasket.add("milk");
	shoppingBasket.add("cereals");
	shoppingBasket.add("apples");
	shoppingBasket.add("oranges");
	shoppingBasket.add("bread");
	
	System.out.println(shoppingBasket.size());
	System.out.println(shoppingBasket.get(0));
	System.out.println(shoppingBasket.get(4));
	shoppingBasket.remove("bread");
	System.out.println(shoppingBasket.size());
	
	shoppingBasket.remove(2);		
	System.out.println(shoppingBasket.toString());
	
	shoppingBasket.add("potatoes");
	shoppingBasket.add("olive oil");
	shoppingBasket.add("chicken");
	
	Collections.sort(shoppingBasket);				
	System.out.println(shoppingBasket.get(0));
	System.out.println(shoppingBasket.get(shoppingBasket.size()-1));
	
	System.out.println("****************************");
	ArrayList<Integer> salaries = new ArrayList<Integer>();
	salaries.add(75000);
	salaries.add(25000);
	salaries.add(42000);
	salaries.add(30000);
	salaries.add(55000);
	salaries.add(42000);
	salaries.add(39000);
	
	System.out.println(Collections.max(salaries));
	System.out.println(Collections.min(salaries));
	System.out.println(Collections.frequency(salaries, 42000));
	
	Collections.sort(salaries);
	System.out.println(salaries.get(3));
	
	Collections.reverse(salaries);		
	System.out.println(salaries.get(0));
	System.out.println(salaries.get(salaries.size()-1));



	
	

	
	

	





	}
}
	
