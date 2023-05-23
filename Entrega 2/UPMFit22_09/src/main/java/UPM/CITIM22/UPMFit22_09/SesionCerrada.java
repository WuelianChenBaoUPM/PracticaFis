package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:53
 */
public class SesionCerrada extends Sesion implements InterfazSesion {

	private  Monitor   monitor ;
	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	 

	public SesionCerrada(TActividad actividad, int aforo, String horaFin, String horaInicio,Monitor monitor ){
		
		super(actividad, aforo, horaFin, horaInicio); 
		this.monitor= monitor;
	}
	
	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

	}
	
	 
	
	 

}//end SesionCerrada