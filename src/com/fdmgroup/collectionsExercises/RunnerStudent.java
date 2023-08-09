package com.fdmgroup.collectionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerStudent {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 25));
		students.add(new Student("Bob", 30));
		students.add(new Student("Charlie", 28));

        //compareTo method is called implicitly
		Collections.sort(students);

		for (Student student : students) {
			System.out.println(student);
		}
	}
}
