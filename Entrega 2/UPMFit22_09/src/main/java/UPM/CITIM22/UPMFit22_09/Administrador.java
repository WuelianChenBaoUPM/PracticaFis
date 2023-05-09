package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:49
 */
public class Administrador extends UsuarioGenerico implements InterfazAdministrador  {

	private int numeroDeTelefono;
 
	public Administrador(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void altaMonitor(){

	}

	public void destroy(){

	}

	public int getTelefono(){
		return this.numeroDeTelefono;
	}

	/**
	 * 
	 * @param numeroTelf
	 * @param contrase�a
	 * @param correoElectronico
	 * @param nombre
	 * @param nombreUsuario
	 */
	public Administrador(int numeroTelf, String contrasena, String correoElectronico, String nombre, String nombreUsuario){

	} 

	/**
	 * 
	 * @param numeroTelefono
	 */
	 

	@Override
	public void setNumTelefono(int numTelefono) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param numTelefono
	 */
	
}//end Administrador