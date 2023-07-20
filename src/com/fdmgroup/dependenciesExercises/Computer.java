package com.fdmgroup.dependenciesExercises;

public class Computer {

	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private Processor PROCESSOR;

	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
		MODEL = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		PROCESSOR = processor;
	}

	public void turnOn() {
		System.out.println("It was turned on");
	}

	public void turnOff() {
		System.out.println("It was turned off");
	}

	public void getPower(PowerSource powerSource) {
		
		System.out.println(powerSource.getWatts() + " watts received from power source");
	}
	
	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Processor getPROCESSOR() {
		return PROCESSOR;
	}

	public void setPROCESSOR(Processor pROCESSOR) {
		PROCESSOR = pROCESSOR;
	}

	public String getMODEL() {
		return MODEL;
	}

}
