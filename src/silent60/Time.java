package silent60;
import java.lang.Thread;
import java.util.ArrayList; 



public class Time extends Thread{
	private Simulator simulator;
	public static void use_energy_for_navegation(ArrayList<Battery> pListBatteries) {
		// no se ha usado ninguna bateria
		Boolean battery_used = false;
		for(Battery battery : pListBatteries) {
			if (battery_used == false) {
				// ya se esta usando una bateria
				battery_used = true;
				if(battery.getEnergyPercentage() > 0) {
					battery.setEnergyPercentage(battery.getEnergyPercentage() - battery.getConsumptionPerSecond());
					System.out.println("Batería: " + battery.getEnergyPercentage()); 
				}
			}
		}
		
		
	}
	public void run(ArrayList<SolarPanel>listPanels, ArrayList<Battery>listBatteries) {
		float hoursDifference = simulator.getEndTime() - simulator.getStartTime();
		float secondsPerHour = Constants.MAXIMUN_DURATION_SIMULATOR / hoursDifference;
		try {
			for(int second = 0; second <= Constants.MAXIMUN_DURATION_SIMULATOR; ++second) {
				for(SolarPanel panel : listPanels) {
					System.out.println(second + " sec");  // se muestran los segundos
					if (second == panel.getDuration()) {
						panel.changeSunPercentage();
						panel.charge_battery (listBatteries);
						use_energy_for_navegation(listBatteries);
					}
					if(second == secondsPerHour) {  // aumenta la hora
						Thread.sleep(1000);  
						simulator.setStartTime(simulator.getStartTime() + 1);
						System.out.println("Hour: " + simulator.getStartTime()); 
					}
				}
			
			}
		}
		catch (Exception expn) {
			System.out.println(expn);  
		}
		
	}

}
