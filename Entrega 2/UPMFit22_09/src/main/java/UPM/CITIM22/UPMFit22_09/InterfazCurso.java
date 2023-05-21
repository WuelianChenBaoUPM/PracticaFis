package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:10
 */
public interface InterfazCurso {

	public String getFechaFin();

	public String getFechaInicio();

	public String getHorario();

	public String getNombre();

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaFin(String fecha);

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaInicio(String fecha);

	/**
	 * 
	 * @param horario
	 */
	public void setHorario(String horario);

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre);

	public List<InterfazSesion> getListaSesiones();
	
}