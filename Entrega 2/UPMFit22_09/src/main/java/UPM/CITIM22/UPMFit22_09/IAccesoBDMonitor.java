package UPM.CITIM22.UPMFit22_09;

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
	public void  actualizar(Monitor monitor);

	/**
	 * 
	 * @param monitor
	 */
	public void  borrar(Monitor monitor);

	/**
	 * 
	 * @param monitor
	 */
	public void  insertar(Monitor monitor);

	/**
	 * 
	 * @param monitor
	 */
	public void  seleccionar(Monitor monitor);

}