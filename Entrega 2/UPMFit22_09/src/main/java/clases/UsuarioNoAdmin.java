

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:48
 */
public class UsuarioNoAdmin extends UsuarioGenerico implements Interfaz Usuario No Admin {

	private String dni;

	public UsuarioNoAdmin(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public destroy(){

	}

	public String getdni(){
		return "";
	}

	/**
	 * 
	 * @param dni
	 * @param contraseña
	 * @param correoElectronico
	 * @param nombre
	 * @param nombreUsuario
	 */
	public new(String dni, String contraseña, String correoElectronico, String nombre, String nombreUsuario){

	}

	/**
	 * 
	 * @param dni
	 */
	public void setdni(String dni){

	}

	public String getDNI(){
		return "";
	}

	/**
	 * 
	 * @param DNI
	 */
	public void setDNI(String DNI){

	}
}//end UsuarioNoAdmin