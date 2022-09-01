package silent60;

import java.util.ArrayList;

public class Battery {
	private String name;
	private float knot;
	private float consumptionPerSecond;
	private float energyPercentage = 100.0f;
	
	
	public void use_energy_for_others(Device device) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public float getKnot() {
		return knot;
	}

	public void setKnot(float knot) {
		this.knot = knot;
	}

	public float getConsumptionPerSecond() {
		return consumptionPerSecond;
	}

	public void setConsumptionPerSecond(float consumptionPerSecond) {
		this.consumptionPerSecond = consumptionPerSecond;
	}

	public float getEnergyPercentage() {
		return energyPercentage;
	}

	public void setEnergyPercentage(float energyPercentage) {
		this.energyPercentage = energyPercentage;
	}



}
