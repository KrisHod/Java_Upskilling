package com.fdmgroup.classesAndObjectsExercises;

public class Processor {
	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;

	public Processor(String model, double speed, int numberOfCores) {
		MODEL = model;
		SPEED = speed;
		NUMBER_OF_CORES = numberOfCores;
	}

	public void processData(String data) {
		System.out.println("processData " + data);
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getSPEED() {
		return SPEED;
	}

	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}

}
