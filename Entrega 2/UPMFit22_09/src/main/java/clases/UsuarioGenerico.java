

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:46
 */
public class UsuarioGenerico implements InterfazUsuarioGenerico {

	private String contraseña;
	private String correoElectronico;
	private String nombre;
	private String nombreUsuario;

	public UsuarioGenerico(){

	}

	public void finalize() throws Throwable {

	}
	public destroy(){

	}

	public String getContraseña(){
		return "";
	}

	public String getCorreo(){
		return "";
	}

	public String getNombre(){
		return "";
	}

	public String getNombreUsuario(){
		return "";
	}

	public void login(){

	}

	public void logOut(){

	}

	/**
	 * 
	 * @param contraseña
	 * @param nombre
	 * @param nombreUsuario
	 * @param correoElectronico
	 */
	public new(String contraseña, String nombre, String nombreUsuario, String correoElectronico){

	}

	public void setContraseña(){

	}

	public void setCorreo(){

	}

	public void setNombre(){

	}

	/**
	 * 
	 * @param nombreUsusario
	 */
	public void setNombreUsuario(String nombreUsusario){

	}

	public void logIn(){

	}

	/**
	 * 
	 * @param contraseña
	 */
	public void setContraseña(String contraseña){

	}

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo){

	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre){

	}
}//end UsuarioGenerico