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

	public UsuarioGenerico() {}
	public UsuarioGenerico(String contrasena, String correoElectronico, String nombre, String nombreUsuario){
		this.contrasena = contrasena;
		this.correoElectronico = correoElectronico;
		this.nombre = nombre;
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getContrasena() {
		return this.contrasena; 
	}

	public void finalize() throws Throwable {

	}
	public void destroy(){

	}


	public String getCorreo(){
		return this.correoElectronico;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getNombreUsuario(){
		return this.nombreUsuario;
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



	public void setNombreUsuario(String nombreUsusario){
		if (nombreUsusario != null)
		this.nombreUsuario = nombreUsuario;
		
	}

	public void logIn(){

	}

	/**
	 * 
	 * @param contrase�a
	 */
	public void setContrasena(String contrasena){
		if(contrasena.length()>=8 && contrasena.length()<=12 )
		this.contrasena = contrasena;
	}

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo){
		if (correo != null)
		this.correoElectronico = correo;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre){
		if (nombre != null)
		this.nombre = nombre;
	}

}