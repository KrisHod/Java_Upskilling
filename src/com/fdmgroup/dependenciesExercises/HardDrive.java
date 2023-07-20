package com.fdmgroup.dependenciesExercises;

public class HardDrive {

	private final String MODEL;
	private final double CAPACITY;
	private double UsedSpace;
	
	public HardDrive(String model, double capacity) {
		MODEL = model;
		CAPACITY = capacity;
	}

	public String readData(String file) {
		return "data from " + file;
	}

	public void writeData(String data, String file) {
		System.out.println("writeData " + data + file);
	}

	public double getUsedSpace() {
		return UsedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		UsedSpace = usedSpace;
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getCAPACITY() {
		return CAPACITY;
	}

	}
	

