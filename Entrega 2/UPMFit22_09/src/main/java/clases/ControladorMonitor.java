package clases;

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

	}

	public void finalize() throws Throwable {

	}
	public Monitor crearMonitor(){
		return null;
	}

	public String listaMonitores(){
		return "";
	}
	
	//metodos relacion con Monitor
	
		public void setMonitor(List<Monitor> monitores)  {
				
			}
			
		public List<Monitor> getMonitor(){
				return null;
			}
			
		public void addMonitor(Monitor monitor) {
		
			}
			
		public void removeMonitor (Monitor monitor) {
				
			}
}//end ControladorMonitor