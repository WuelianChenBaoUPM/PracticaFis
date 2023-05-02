

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
	public actualizar(Administrador admin);

	/**
	 * 
	 * @param num
	 */
	public borrar(int num);

	/**
	 * 
	 * @param admin
	 */
	public insertar(Administrador admin);

	/**
	 * 
	 * @param num
	 */
	public seleccionar(int num);

}