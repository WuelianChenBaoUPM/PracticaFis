package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:48
 */
public class UsuarioNoAdmin extends UsuarioGenerico implements InterfazUsNoAdmin {

	private String dni;
	public UsuarioNoAdmin() {}

	public UsuarioNoAdmin(String dni, String contrasena, String correoElectronico, String nombre, String nombreUsuario){
		
		super(contrasena, correoElectronico, nombre, nombreUsuario);
		this.setDni(dni);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

	}

	public String getDni(){
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 * @param contrase�a
	 * @param correoElectronico
	 * @param nombre
	 * @param nombreUsuario
	 */
	
	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni){
		if  (dni == null||dni.isEmpty())
			throw new RuntimeException("El dni tiene que ser un cadena de caracteres no vacia");
		this.dni = dni;
	}

}//end UsuarioNoAdmin