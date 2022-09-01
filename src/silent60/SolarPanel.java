package silent60;
import java.util.List;
import java.lang.Thread; 


public class SolarPanel extends Thread{
	private String modelo;
	private float chargePerSecond;  //porcentaje
	private float sunPercentage;
	private float duration;  // en segundos
	private Simulator simulator;

	
	public void changeSunPercentage() {
		if((simulator.getStartTime() >= Constants.MORNING) & (simulator.getStartTime() < Constants.AFTERNOON)) {
			this.sunPercentage += 5.0f;
		}
		else if(simulator.getStartTime() < Constants.AFTERNOON) {
			this.sunPercentage -= 1.5f;
		}
		else if((simulator.getStartTime() >= Constants.AFTERNOON) && (simulator.getStartTime() < Constants.NIGHT)) {
			this.sunPercentage -= 3.0f;
		}
		else((simulator.getStartTime() >= Constants.AFTERNOON) && (simulator.getStartTime() < Constants.NIGHT)) {
			this.sunPercentage -= 3.0f;
		}
	}
	
	public void charge_battery (List<Battery> pBatteryList) {
		boolean state = false;
		for(Battery battery : pBatteryList) {
			if(battery.getEnergyPercentage() < 100.0f) {
				state = true;
				int second = 0;
				while(second <= Constants.MAXIMUN_DURATION_SIMULATOR) {
					if(second == duration) {
						battery.setEnergyPercentage(sunPercentage += chargePerSecond);
					}
			}
		}
		if(state == false) {
			System.out.println("Las baterías están totalmente cargadas"); 
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getChargePerSecond() {
		return chargePerSecond;
	}

	public void setChargePerSecond(float chargePerSecond) {
		this.chargePerSecond = chargePerSecond;
	}

	public float getSunPercentage() {
		return sunPercentage;
	}

	public void setSunPercentage(float sunPercentage) {
		this.sunPercentage = sunPercentage;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

}
