package com.fdmgroup.castingExericses;

public class Laptop implements BasketItem {

	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	private String name;
	private double price;

	public Laptop(double cpuSpeed, double memory, double hardDrive, String name, double price) {
		super();
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	public double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
	}
	
	

}
