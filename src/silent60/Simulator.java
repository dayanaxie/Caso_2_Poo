package silent60;

import java.util.ArrayList;
import java.lang.Thread; 


public class Simulator extends Thread {
	private int startTime;
	private int endTime;
	private float chargePerSecond;
	private float consumptionPerSecond;
	private ArrayList<SolarPanel> listPanels;
	private ArrayList<Battery> listBatteries;
	
	
	public void config_solar_panel(float pChargePerSecond, float pSunPercentage, float pDuration){
		for(SolarPanel panel : listPanels){
			panel.setChargePerSecond(pChargePerSecond);
			panel.setSunPercentage(pSunPercentage);
			panel.setDuration(pDuration);
		}
	}
	public void config_battery(float pKnot, float pConsumptionPerSecond){
		for(Battery battery : listBatteries){
			battery.setKnot(pKnot);
			battery.setConsumptionPerSecond(pConsumptionPerSecond);
		}	
	}
	public void run() {
		float hoursDifference = this.endTime - this.startTime;
		float secondsPerHour = Constants.MAXIMUN_DURATION_SIMULATOR / hoursDifference;
		try {
			for(int second = 0; second <= Constants.MAXIMUN_DURATION_SIMULATOR; ++second) {
			System.out.println(second + " sec");  // se muestran los segundos
			if (second == Battery.consumptionPerSecond)
			if(second == secondsPerHour) {  // aumenta la hora
				Thread.sleep(1000);  
				this.startTime += 1;
				System.out.println("Hour: " + this.startTime); 
				
				Battery.use_energy_for_navegation();
				}
			}
		}
		catch (Exception expn) {
			System.out.println(expn);  
		}
		
	}

	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public void current_energy() {
		for(Battery battery : listBatteries) {
			System.out.println(battery.getName() + " " + battery.getEnergyPercentage() + "%"); 
		}
		
	}
	
}
