package com.fdmgroup.castingExericses;

import java.util.ArrayList;

public class CalorieCounter {

	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<>();

	public void addLowCalorieFood(FoodItem foodItem) {
		if (foodItem.getCalories() <= 500) {
			lowCalorieFoods.add(foodItem);
		}

	}

	public ArrayList<FoodItem> getAllLowCalorieFoods() {
		return lowCalorieFoods;

	}

	// Step 1 & Step 2: Create the removeHighCalorieFoodsFromBasket method
	public void removeHighCalorieFoodsFromBasket(Basket basket, int maxCalories) {
		ArrayList<BasketItem> itemsToRemove = new ArrayList<>();
		for (BasketItem basketItem : basket.getAllItems()) {
			if (basketItem instanceof FoodItem) {
				FoodItem foodItem = (FoodItem) basketItem;
				if (foodItem.getCalories() > maxCalories) {
					itemsToRemove.add(basketItem);
				}
			}
		}
		for (BasketItem itemToRemove : itemsToRemove) {
			basket.removeItem(itemToRemove);
		}
	}
}
