package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:07
 */
public interface IAccesoBDSesionCerrada {

	/**
	 * 
	 * @param sesionCerrada
	 */
	public void actualizar(SesionCerrada sesionCerrada);

	/**
	 * 
	 * @param sesionCerrada
	 */
	public void borrar(SesionCerrada sesionCerrada);

	/**
	 * 
	 * @param sesionCerrada
	 */
	public void insertar(SesionCerrada sesionCerrada);

	/**
	 * 
	 * @param sesionCerrada
	 */
	public void seleccionar(SesionCerrada sesionCerrada);

}