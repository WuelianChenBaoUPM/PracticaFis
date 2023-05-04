package clases;


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
	public void  actualizar(UsuarioGenerico usGenerico);

	/**
	 * 
	 * @param nombreUsuario
	 */
	public void   borrar(String nombreUsuario);

	/**
	 * 
	 * @param usGenerico
	 */
	public void  insertar(UsuarioGenerico usGenerico);

	/**
	 * 
	 * @param nombreUsuario
	 */
	public void  seleccionar(String nombreUsuario);

}