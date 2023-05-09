package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:46
 */
public class UsuarioGenerico implements InterfazUsuarioGenerico {

	private String contrasena;
	private String correoElectronico;
	private String nombre;
	private String nombreUsuario;

	public UsuarioGenerico(){

	}
	
	public String gentContrasena() {
		return this.contrasena; 
	}

	public void finalize() throws Throwable {

	}
	public void destroy(){

	}

	public String getContrasena(){
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
	 * @param contrase�a
	 * @param nombre
	 * @param nombreUsuario
	 * @param correoElectronico
	 */
	public UsuarioGenerico(String contrasena, String nombre, String nombreUsuario, String correoElectronico){

	}

	public void setContrasena(){

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
	 * @param contrase�a
	 */
	public void setContrasena(String contrasena){

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

}