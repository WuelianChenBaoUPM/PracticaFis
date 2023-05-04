package clases;


/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:11
 */
public interface InterfazSesion {

	public TActividad getActividad();

	public int getAforo();

	public int getHoraFin();

	public int getHoraInicio();

	/**
	 * 
	 * @param actividad
	 */
	public void setActividad(String actividad);

	/**
	 * 
	 * @param aforo
	 */
	public void setAforo(int aforo);

	/**
	 * 
	 * @param hora
	 */
	public void setHorafFin(String hora);

	/**
	 * 
	 * @param hora
	 */
	public void setHoraInicio(String hora);

	public void setActividad();

	public void setAforo();

	public void setHoraFin();

	public void setHoraInicio();

}