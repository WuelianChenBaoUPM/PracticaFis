package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:48
 */
public class UsuarioNoAdmin extends UsuarioGenerico {

	private String dni;

	public UsuarioNoAdmin(String dni, String contrasena, String correoElectronico, String nombre, String nombreUsuario){
		
		super(contrasena, correoElectronico, nombre, nombreUsuario);
		this.dni = dni;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

	}

	public String getdni(){
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
	public void setdni(String dni){
		this.dni = dni;
	}

}//end UsuarioNoAdmin