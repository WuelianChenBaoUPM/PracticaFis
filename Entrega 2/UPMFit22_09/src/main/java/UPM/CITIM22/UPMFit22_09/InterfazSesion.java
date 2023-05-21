package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:11
 */
public interface InterfazSesion {

	public TActividad getActividad();

	public int getAforo();

	public String getHoraFin();

	public String getHoraInicio();

	/**
	 * 
	 * @param actividad
	 */
	public void setActividad(TActividad actividad);

	/**
	 * 
	 * @param aforo
	 */
	public void setAforo(int aforo);

	/**
	 * 
	 * @param hora
	 */
	public void setHoraFin(String hora);

	/**
	 * 
	 * @param hora
	 */
	public void setHoraInicio(String hora);
	
	public int getId();
	public Monitor getMonitor();
	
}