package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:15
 */
public class ControladorMonitor {
	
	private List<Monitor> monitores;

	public ViewMonitor m_ViewMonitor;
	public InterfazMonitor m_InterfazMonitor;

	public ControladorMonitor(){
		this.monitores = new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}

	public void crearMonitor(String datos){
	
		String [] info = datos.split(",");
		Monitor monitor = new Monitor(Double.parseDouble(info[0]), info[1], info[2], info[3], info[4], info[5]);
		monitores.add(monitor);
		monitor.setId(monitores.size());
		//view de que ha quedado creado
	}
	
	
	public Monitor obtenerMonitorPorId(int id){
		Monitor monitor = new Monitor();
			for (Monitor m : monitores) {
				if (m.getId() == id )	
					monitor = m;
				}
		return monitor;
	}
	//metodos relacion con Monitor
	
		public void setMonitor(List<Monitor> monitores)  {
				this.monitores = monitores;
			}
			
		public List<Monitor> getMonitor(){
				return this.monitores;
			}
			
		public void addMonitor(Monitor monitor) {
				this.monitores.add(monitor);
			}
			
		public void removeMonitor (Monitor monitor) {
				this.monitores.remove(monitor);
			}
}//end ControladorMonitor