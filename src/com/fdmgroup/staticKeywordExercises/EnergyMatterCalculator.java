package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {
	
	public static double SPEED_OF_LIGHT = 299792458;
	
	public static double matterToEnergy(double matter) {
		double energy = matter * Math.pow(SPEED_OF_LIGHT, 2);
		return energy;
	}
	
	public static double energyToMatter(double energy) {
		double matter = energy / Math.pow(SPEED_OF_LIGHT, 2);
		return matter;
	}

}
