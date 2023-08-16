package com.fdmgroup.solidExercises;

public class FlyingVehicle implements Vehicle {
	private boolean abilityToFly;
	private double currentSpeedInNauticalMilesPerHour;

	public FlyingVehicle(boolean abilityToFly, double currentSpeedInNauticalMilesPerHour) {
		super();
		this.abilityToFly = abilityToFly;
		this.currentSpeedInNauticalMilesPerHour = currentSpeedInNauticalMilesPerHour;
	}

	public boolean isAbilityToFly() {
		return abilityToFly;
	}

	public void setAbilityToFly(boolean abilityToFly) {
		this.abilityToFly = abilityToFly;
	}

	public double getCurrentSpeedInNauticalMilesPerHour() {
		return currentSpeedInNauticalMilesPerHour;
	}

	public void setCurrentSpeedInNauticalMilesPerHour(double currentSpeedInNauticalMilesPerHour) {
		this.currentSpeedInNauticalMilesPerHour = currentSpeedInNauticalMilesPerHour;
	}

	@Override
	public double getCurrentSpeed() {
		return currentSpeedInNauticalMilesPerHour;
	}

	@Override
	public boolean canFly() {
		return abilityToFly;
	}
}
