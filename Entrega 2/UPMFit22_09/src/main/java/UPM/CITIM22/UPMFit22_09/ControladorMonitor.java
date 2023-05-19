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
	public Monitor crearMonitor(double numeroDeCuenta, String dni, String contrasena, String correoElectronico, 
			String nombre, String nombreUsuario){
		
		Monitor monitor = new Monitor(numeroDeCuenta, dni, contrasena, correoElectronico, nombre, nombreUsuario);
		
		return monitor;
	}

	public String listaMonitores(){
		return "";
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