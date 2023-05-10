package UPM.CITIM22.UPMFit22_09;

 

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:09
 */
public interface InterfazAdministrador {

	public double getTelefono();

	/**
	 * 
	 * @param numTelefono
	 */
	public void setNumTelefono(double numTelefono);

	public Monitor altaMonitor(double numeroDeCuenta, String dni, String contrasena, String correoElectronico, String nombre,
			String nombreUsuario);

}