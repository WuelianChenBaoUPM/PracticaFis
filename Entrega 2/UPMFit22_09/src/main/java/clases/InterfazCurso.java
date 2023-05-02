

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:10
 */
public interface InterfazCurso {

	public date getFechaFin();

	public date getFechaInicio();

	public time getHorario();

	public String getNombre();

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaFin(date fecha);

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaInicio(date fecha);

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

}