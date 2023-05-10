package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:50
 */
public class Monitor extends UsuarioNoAdmin implements InterfazMonitor {

	private List<SesionCerrada> sesiones;
	
	private double numeroDeCuenta;

	public Monitor(double numeroDeCuenta, String dni, String contrasena, String correoElectronico, String nombre, String nombreUsuario){
		
			super(dni, contrasena, correoElectronico, nombre, nombreUsuario);
			this.numeroDeCuenta = numeroDeCuenta;
	}

	/**
	 * 
	 * @param numeroCuenta
	 */

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
	
	public void setNumeroCuenta(int numeroCuenta){

	}

	/**
	 * 
	 * @param numCuenta
	 */
	public void setNumeroCuenta(String numCuenta){

	}
	
	//metodos de la relacion con SesionCerrada
	
	public void setSesiones(List<SesionCerrada> sesiones)  {
		
	}
	
	public List<SesionCerrada> getSesiones(){
		return null;
	}
	
	public void addSesion(SesionCerrada sesion) {
		
	}
	
	public void removeSesion (SesionCerrada sesion) {
		
	}
	
}//end Monitor