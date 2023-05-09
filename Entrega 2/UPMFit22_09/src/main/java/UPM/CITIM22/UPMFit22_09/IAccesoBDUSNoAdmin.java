package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:59
 */
public interface IAccesoBDUSNoAdmin {

	/**
	 * 
	 * @param usNoAdmin
	 */
	public void  actualizar(UsuarioNoAdmin usNoAdmin);

	/**
	 * 
	 * @param dni
	 */
	public void  borrar(String dni);

	/**
	 * 
	 * @param usNoAdmin
	 */
	public void  insertar(UsuarioNoAdmin usNoAdmin);

	/**
	 * 
	 * @param dni
	 */
	public void  seleccionar(String dni);

}