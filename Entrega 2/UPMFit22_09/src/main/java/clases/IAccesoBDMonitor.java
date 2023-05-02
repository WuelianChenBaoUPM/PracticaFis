

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:06
 */
public interface IAccesoBDMonitor {

	/**
	 * 
	 * @param monitor
	 */
	public actualizar(Monitor monitor);

	/**
	 * 
	 * @param monitor
	 */
	public borrar(Monitor monitor);

	/**
	 * 
	 * @param monitor
	 */
	public insertar(Monitor monitor);

	/**
	 * 
	 * @param monitor
	 */
	public seleccionar(Monitor monitor);

}