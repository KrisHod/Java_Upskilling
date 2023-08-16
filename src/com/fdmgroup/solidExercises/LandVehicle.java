package com.fdmgroup.solidExercises;

public class LandVehicle implements Vehicle {
    private int engineSize;
    private boolean manualAssistance;
    private boolean waterPowered;
    private double currentSpeedInLandMilesPerHour;
    private int numberOfAxles;
    
    public LandVehicle(int engineSize, boolean manualAssistance, boolean waterPowered,
			double currentSpeedInLandMilesPerHour, int numberOfAxles) {
		super();
		this.engineSize = engineSize;
		this.manualAssistance = manualAssistance;
		this.waterPowered = waterPowered;
		this.currentSpeedInLandMilesPerHour = currentSpeedInLandMilesPerHour;
		this.numberOfAxles = numberOfAxles;
	}
    
	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public boolean isManualAssistance() {
		return manualAssistance;
	}


	public void setManualAssistance(boolean manualAssistance) {
		this.manualAssistance = manualAssistance;
	}


	public boolean isWaterPowered() {
		return waterPowered;
	}


	public void setWaterPowered(boolean waterPowered) {
		this.waterPowered = waterPowered;
	}


	public double getCurrentSpeedInLandMilesPerHour() {
		return currentSpeedInLandMilesPerHour;
	}


	public void setCurrentSpeedInLandMilesPerHour(double currentSpeedInLandMilesPerHour) {
		this.currentSpeedInLandMilesPerHour = currentSpeedInLandMilesPerHour;
	}


	public int getNumberOfAxles() {
		return numberOfAxles;
	}


	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	@Override
    public double getCurrentSpeed() {
        return currentSpeedInLandMilesPerHour;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}






