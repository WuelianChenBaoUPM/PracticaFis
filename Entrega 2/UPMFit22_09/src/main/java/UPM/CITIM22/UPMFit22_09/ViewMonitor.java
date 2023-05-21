package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:12
 */
public class ViewMonitor {

	public ViewMonitor(){

	}

	public void finalize() throws Throwable {

	}
	 

	public void renderListaMonitores(List<InterfazMonitor> monitores){
		for(InterfazMonitor m : monitores) {
			renderMonitor(m);	
		}
	}

	public void renderMonitor(InterfazMonitor monitor){
		System.out.println();
		System.out.println("Nombre : "+ monitor.getNombre() +"\nNombre de Usuario : "+monitor.getNombreUsuario()+"\nDNI : "+monitor.getDni());
	}
}//end ViewMonitor