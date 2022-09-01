package silent60;
import java.util.ArrayList;

public class Yacht {
	
	public static void main() {
		Simulator simulator = new Simulator();
		//Constants constants;
		
		// creamos y agregamos las baterias
		Battery bateria1 = new Battery();
		Battery bateria2 = new Battery();
		ArrayList<Battery>listBatteries = new ArrayList<Battery>();
		listBatteries.add(bateria1);
		listBatteries.add(bateria2);
		
		//creamos y agregamos los paneles
		SolarPanel panel1 = new SolarPanel();
		SolarPanel panel2 = new SolarPanel();
		SolarPanel panel3 = new SolarPanel();
		ArrayList<SolarPanel>listPanels = new ArrayList<SolarPanel>();
		listPanels.add(panel1);
		listPanels.add(panel2);
		listPanels.add(panel3);
		
						// velocidad, porcentaje sol, duracion en segundos
		simulator.config_solar_panel(35.00f, 100.0f, 120.0f);
		
	}
	
	


}
