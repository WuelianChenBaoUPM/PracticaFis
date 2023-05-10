package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:49
 */
public class Administrador extends UsuarioGenerico implements InterfazAdministrador  {

	private double numeroDeTelefono;	
	
	public Administrador(double numeroTelf, String contrasena, String correoElectronico, String nombre, String nombreUsuario){
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

	public double getTelefono(){
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
	public void setNumTelefono(double numTelefono) {
		// TODO Auto-generated method stub
		this.numeroDeTelefono = numTelefono;
	}

	@Override
	public Monitor altaMonitor(double numeroDeCuenta, String dni, String contrasena, String correoElectronico, String nombre, String nombreUsuario) {
		// TODO Auto-generated method stub
		return new Monitor(numeroDeCuenta, dni, contrasena, correoElectronico, nombre, nombreUsuario);
	}

	/**
	 * 
	 * @param numTelefono
	 */
	
}//end Administrador