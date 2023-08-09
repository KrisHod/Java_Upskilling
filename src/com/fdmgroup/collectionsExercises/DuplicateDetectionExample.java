package com.fdmgroup.collectionsExercises;

import java.util.HashSet;
import java.util.Set;

//HashSet to efficiently find duplicate elements in a collection

public class DuplicateDetectionExample {
	public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "grape", "banana"};

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : words) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }

        System.out.println("Duplicate words: " + duplicateWords);
    }
}
