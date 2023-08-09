package com.fdmgroup.collectionsExercises;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap maintains the order of insertion of key-value pairs.

public class LinkedHashMapExample {
	public static void main(String[] args) {
        Map<String, Integer> ageMap = new LinkedHashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
