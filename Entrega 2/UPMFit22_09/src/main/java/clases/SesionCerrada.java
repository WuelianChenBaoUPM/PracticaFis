

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
	public destroy(){

	}

	public TActividad getActividad(){
		return null;
	}

	public int getAforo(){
		return 0;
	}

	public int getHoraFin(){
		return 0;
	}

	public int getHoraInicio(){
		return 0;
	}

	/**
	 * 
	 * @param actividad
	 * @param aforo
	 * @param horaFin
	 * @param horaIncio
	 */
	public new(TActividad actividad, int aforo, int horaFin, int horaIncio){

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