package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:49
 */
public class Administrador extends UsuarioGenerico implements InterfazAdministrador  {

	private int numeroDeTelefono;	
	
	public Administrador(int numeroTelf, String contrasena, String correoElectronico, String nombre, String nombreUsuario){
		super (contrasena,correoElectronico,nombre,nombreUsuario);
		this.numeroDeTelefono = numeroTelf;
	} 
	
	/**
	 * 
	 * @param numeroTelefono
	 */

	public void finalize() throws Throwable {
		super.finalize();
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

	 

	@Override
	public void setNumTelefono(int numTelefono) {
		 if(numTelefono<0 )
			 throw new RuntimeException("el numero de telf tiene que ser un num positivo");
		this.numeroDeTelefono = numTelefono;
	}

	 

	/**
	 * 
	 * @param numTelefono
	 */
	
}//end Administrador