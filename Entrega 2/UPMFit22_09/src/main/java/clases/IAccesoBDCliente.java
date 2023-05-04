package clases;


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
	public void  actualizar(Cliente cliente);

	/**
	 * 
	 * @param cliente
	 */
	public void   borrar(Cliente cliente);

	/**
	 * 
	 * @param cliente
	 */
	public void  insertar(Cliente cliente);

	/**
	 * 
	 * @param cliente
	 */
	public void  seleccionar(Cliente cliente);

}