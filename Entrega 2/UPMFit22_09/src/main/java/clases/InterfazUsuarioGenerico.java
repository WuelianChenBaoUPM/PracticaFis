

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:08
 */
public interface InterfazUsuarioGenerico {

	public String getContrase�a();

	public String getCorreo();

	public String getNombre();

	public String getNombreUsuario();

	public void logIn();

	public void logOut();

	/**
	 * 
	 * @param contrase�a
	 */
	public void setContrase�a(String contrase�a);

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo);

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre);

	/**
	 * 
	 * @param nombre
	 */
	public void setNombreUsuario(String nombre);

}