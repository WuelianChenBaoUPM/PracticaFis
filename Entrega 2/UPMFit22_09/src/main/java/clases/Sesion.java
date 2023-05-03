

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:52
 */
public class Sesion implements InterfazSesion {

	private TActividad actividad;
	private int aforo;
	private int horaFin;
	private int horaInicio;

	public Sesion(){

	}

	public void finalize() throws Throwable {

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
	 * @param horaInicio
	 */
	public new(int actividad, int aforo, int horaFin, int horaInicio){

	}

	public void setActividad(){

	}

	public void setAforo(){

	}

	public void setHoraFin(){

	}

	public void setHoraInicio(){

	}

	/**
	 * 
	 * @param actividad
	 */
	public void setActividad(String actividad){

	}

	/**
	 * 
	 * @param aforo
	 */
	public void setAforo(int aforo){

	}

	/**
	 * 
	 * @param hora
	 */
	public void setHorafFin(String hora){

	}

	/**
	 * 
	 * @param hora
	 */
	public void setHoraInicio(String hora){

	}
}//end Sesion