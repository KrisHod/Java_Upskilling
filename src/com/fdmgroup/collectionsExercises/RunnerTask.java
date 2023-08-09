package com.fdmgroup.collectionsExercises;

import java.util.PriorityQueue;
import java.util.Queue;

public class RunnerTask {
	
	    public static void main(String[] args) {
	        Queue<Task> taskQueue = new PriorityQueue<>();

	        taskQueue.add(new Task("Write report", 2));
	        taskQueue.add(new Task("Fix bugs", 1));
	        taskQueue.add(new Task("Test feature", 3));
	        taskQueue.add(new Task("Refactor code", 2));

	        System.out.println("Tasks in priority order:");

	        while (!taskQueue.isEmpty()) {
	            System.out.println(taskQueue.poll());
	        }
	    }
	}

