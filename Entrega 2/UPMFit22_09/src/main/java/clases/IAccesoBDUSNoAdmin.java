

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
	public actualizar(UsuarioNoAdmin usNoAdmin);

	/**
	 * 
	 * @param dni
	 */
	public borrar(String dni);

	/**
	 * 
	 * @param usNoAdmin
	 */
	public insertar(UsuarioNoAdmin usNoAdmin);

	/**
	 * 
	 * @param dni
	 */
	public seleccionar(String dni);

}