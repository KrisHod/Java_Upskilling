package com.fdmgroup.comparisonsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Learn Java", 45678, 19.99, 500, 4.3));
        books.add(new Book("Learn UNIX", 65432, 17.5, 650, 3.9));
        books.add(new Book("Learn SQL", 87956, 9.75, 220, 4.4));
        books.add(new Book("Learn Agile", 35367, 25.5, 500, 4.4));
        books.add(new Book("Learn React", 55676, 28.75, 490, 4.8));
        books.add(new Book("Learn JavaScript", 34343, 14.99, 300, 4.4));
        books.add(new Book("Learn Python", 65767, 27.25, 500, 4.1));

        // 1. Comparator for sorting by number of pages in ascending order
        Comparator<Book> pagesComparator = Comparator.comparingInt(Book::getNumberOfPages);
        Collections.sort(books, pagesComparator);
        System.out.println("Sorted by pages (ascending):");
        for (Book book : books) {
            System.out.println(book);
        }
        
        // 2. Comparator for sorting by name in ascending order
        Comparator<Book> nameComparator = Comparator.comparing(Book::getTitle);
        Collections.sort(books, nameComparator);
        System.out.println("\nSorted by name (ascending):");
        for (Book book : books) {
            System.out.println(book);
        }

        // 3. Comparator for sorting by price in descending order
        Comparator<Book> priceComparator = Comparator.comparingDouble(Book::getPrice).reversed();
        Collections.sort(books, priceComparator);
        System.out.println("\nSorted by price (descending):");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
