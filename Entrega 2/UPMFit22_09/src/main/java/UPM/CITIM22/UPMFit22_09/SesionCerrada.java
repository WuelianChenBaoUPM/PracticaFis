package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:53
 */
public class SesionCerrada extends Sesion implements InterfazSesion {

	public Monitor Monitor;

	public SesionCerrada(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

	}

	public TActividad getActividad(){
		return null;
	}

	public int getAforo(){
		return 0;
	}

	public String getHoraFin(){
		return "";
	}

	public String getHoraInicio(){
		return "";
	}

	/**
	 * 
	 * @param actividad
	 * @param aforo
	 * @param horaFin
	 * @param horaIncio
	 */
	public SesionCerrada(TActividad actividad, int aforo, int horaFin, int horaIncio){

	}

	public void setActividad(){

	}

	public void setAforo(){

	}

	public void setHoraFin(){

	}

	public void setHoraInicio(){

	}
}//end SesionCerrada