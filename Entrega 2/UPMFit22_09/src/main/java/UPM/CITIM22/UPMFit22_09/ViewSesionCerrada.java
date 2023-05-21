package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * 
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:15
 */
public class ViewSesionCerrada {

	public ViewSesionCerrada(){

	}

	public void finalize() throws Throwable {

	}
	

	public void renderLisatSesionesCerradas(List<SesionCerrada> sesiones){
		for (InterfazSesion sesion : sesiones) {
			renderSesionCerrada(sesion);
		}
	}

	public void renderSesionCerrada(InterfazSesion sesion){
		
		System.out.println("Actividad :"+ sesion.getActividad()+ "\nAforo : "+sesion.getAforo()+ "\nHora Inicio : "+ sesion.getHoraInicio()+ "\nHora Fin : "+ sesion.getHoraFin());
		
	}
}//end ViewSesionCerrada