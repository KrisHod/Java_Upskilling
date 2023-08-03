package com.fdmgroup.castingExericses;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Toy toy = new Toy(5, 10, "Robot", 80.5);
		Laptop laptop = new Laptop(100, 68, 120, "Lenovo", 500);
		Snack snack1 = new Snack(6, 8, "Bar", 3, 320);
		Snack snack2 = new Snack(23, 26, "Chips", 15, 600);
		ReadyMeal readyMeal1 = new ReadyMeal("Fast food", "Hot-dog", 15, 520);
		ReadyMeal readyMeal2 = new ReadyMeal("breakfast", "eggs", 15, 100);
		Basket basket = new Basket();
		CalorieCounter calorieCounter = new CalorieCounter();

		// Call addItem() once for each of the 6 BasketItem objects.
		basket.addItem(toy);
		basket.addItem(laptop);
		basket.addItem(snack1);
		basket.addItem(snack2);
		basket.addItem(readyMeal1);
		basket.addItem(readyMeal2);

		// Call getAllItems() and loop through the ArrayList that it returns
		System.out.println("All items in the basket:");
		for (BasketItem item : basket.getAllItems()) {
			System.out.println(item.getName());
		}

		basket.removeItem(snack2);

		System.out.println("\nItems in the basket after removing one item:");
		for (BasketItem item : basket.getAllItems()) {
			System.out.println(item.getName());
		}

		calorieCounter.addLowCalorieFood(snack1);
		calorieCounter.addLowCalorieFood(snack2);
		calorieCounter.addLowCalorieFood(readyMeal1);
		calorieCounter.addLowCalorieFood(readyMeal2);

		// calorieCounter.addLowCalorieFood(toy);
		// calorieCounter.addLowCalorieFood(laptop);

		System.out.println("Low-calorie foods in the counter:");
		for (FoodItem item : calorieCounter.getAllLowCalorieFoods()) {
			System.out.println("Calories: " + item.getCalories());
		}

		// Step 1: Call getAllLowCalorieFoods() and store the results in an
		// ArrayList<FoodItem> reference called lowCalorieFoods
		ArrayList<FoodItem> lowCalorieFoods = calorieCounter.getAllLowCalorieFoods();

		// Step 2: Loop through the lowCalorieFoods ArrayList and print the details of
		// each item
		for (FoodItem foodItem : lowCalorieFoods) {
			if (foodItem instanceof ReadyMeal) {
				// Cast to ReadyMeal and print details
				ReadyMeal readyMeal = (ReadyMeal) foodItem;
				System.out.println("ReadyMeal: " + readyMeal.getName() + " | Price: " + readyMeal.getPrice()
						+ " | Cuisine Type: " + readyMeal.getCuisineType());
			} else if (foodItem instanceof Snack) {
				// Cast to Snack and print details
				Snack snack = (Snack) foodItem;
				System.out.println("Snack: " + snack.getName() + " | Price: " + snack.getPrice() + " | Fat Content: "
						+ snack.getFatContent() + " | Sugar Content: " + snack.getSugarContent());
			}
		}
		
		// Step 3: Call removeHighCalorieFoodsFromBasket() method, 
		//passing in Basket object and max calories (500)
		calorieCounter.removeHighCalorieFoodsFromBasket(basket, 500);
		
		// Step 4: Call the basket's getAllItems() method and loop through the ArrayList
		for (BasketItem basketItem : basket.getAllItems()) {
            System.out.println(basketItem.getName());
        }
	}
}
