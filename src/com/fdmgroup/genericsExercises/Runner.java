package com.fdmgroup.genericsExercises;

public class Runner {
	public static void main(String[] args) {
		Catalog<CatalogItem> catalog = new Catalog<>();

		// Creating and adding books to the catalog
		Book book1 = new Book(1);
		Book book2 = new Book(2);
		catalog.addItem(book1);
		catalog.addItem(book2);

		// Creating and adding borrowers to the catalog
		Borrower borrower1 = new Borrower(101);
		Borrower borrower2 = new Borrower(102);
		catalog.addItem(borrower1);
		catalog.addItem(borrower2);

		// Finding items by their IDs
		CatalogItem foundBook = catalog.findItem(1);
		CatalogItem foundBorrower = catalog.findItem(102);

		if (foundBook != null) {
			System.out.println("Found book with ID " + foundBook.getId());
		} else {
			System.out.println("Book not found");
		}

		if (foundBorrower != null) {
			System.out.println("Found borrower with ID " + foundBorrower.getId());
		} else {
			System.out.println("Borrower not found");
		}
	}
}
