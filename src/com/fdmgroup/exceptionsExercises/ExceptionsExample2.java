package com.fdmgroup.exceptionsExercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsExample2 {
	 public static void main(String[] args) {
	        try {
	            BufferedReader bufferedReader = new BufferedReader(new FileReader("Dog.class"));
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            e.getMessage();
	        } finally {
	            System.out.println("Keep calm");
	        }
	    }
}
