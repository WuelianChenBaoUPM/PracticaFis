package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:58
 */
public interface IAccesoBDAdmin {

	/**
	 * 
	 * @param admin
	 */
	public void  actualizar(Administrador admin);

	/**
	 * 
	 * @param num
	 */
	public void  borrar(int num);

	/**
	 * 
	 * @param admin
	 */
	public void  insertar(Administrador admin);

	/**
	 * 
	 * @param num
	 */
	public void  seleccionar(int num);

}