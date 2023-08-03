package com.fdmgroup.castingExericses;

import java.util.ArrayList;

public class Basket {

	private ArrayList<BasketItem> basketItems = new ArrayList<>();

//	public Basket(ArrayList<BasketItem> basketItems) {
//		super();
//		this.basketItems = basketItems;
//	}

	public void addItem(BasketItem basketItem) {
		basketItems.add(basketItem);
	}

	public void removeItem(BasketItem basketItem) {
		basketItems.remove(basketItem);
	}

	public ArrayList<BasketItem> getAllItems() {
		return basketItems;

	}

	public ArrayList<BasketItem> getBasketItems() {
		return basketItems;
	}

	public void setBasketItems(ArrayList<BasketItem> basketItems) {
		this.basketItems = basketItems;
	}
	
	

}
