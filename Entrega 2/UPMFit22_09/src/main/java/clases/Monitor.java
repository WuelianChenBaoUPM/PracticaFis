package clases;



/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:50
 */
public class Monitor extends UsuarioNoAdmin implements InterfazMonitor {

	private int numeroDeCuenta;

	public Monitor(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void cobrar(){

	}

	public String getNumeroCuenta(){
		return "";
	}

	/**
	 * 
	 * @param numeroDeCuenta
	 * @param dni
	 * @param contrase�a
	 * @param correoElectronico
	 * @param nombre
	 * @param nombreUsuario
	 */
	public Monitor(int numeroDeCuenta, String dni, String contrasena, String correoElectronico, String nombre, String nombreUsuario){

	}

	/**
	 * 
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(int numeroCuenta){

	}

	/**
	 * 
	 * @param numCuenta
	 */
	public void setNumeroCuenta(String numCuenta){

	}
}//end Monitor