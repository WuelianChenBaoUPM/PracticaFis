

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:01
 */
public interface IAccesoBDCliente {

	/**
	 * 
	 * @param cliente
	 */
	public actualizar(Cliente cliente);

	/**
	 * 
	 * @param cliente
	 */
	public borrar(Cliente cliente);

	/**
	 * 
	 * @param cliente
	 */
	public insertar(Cliente cliente);

	/**
	 * 
	 * @param cliente
	 */
	public seleccionar(Cliente cliente);

}