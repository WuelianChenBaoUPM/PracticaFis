

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:57
 */
public interface IAccesoBDUsuarioGenerico {

	/**
	 * 
	 * @param usGenerico
	 */
	public actualizar(UsuarioGenerico usGenerico);

	/**
	 * 
	 * @param nombreUsuario
	 */
	public borrar(String nombreUsuario);

	/**
	 * 
	 * @param usGenerico
	 */
	public insertar(UsuarioGenerico usGenerico);

	/**
	 * 
	 * @param nombreUsuario
	 */
	public seleccionar(String nombreUsuario);

}