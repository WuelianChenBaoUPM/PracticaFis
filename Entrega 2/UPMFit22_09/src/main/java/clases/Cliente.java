

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:50
 */
public class Cliente extends UsuarioNoAdmin implements InterfazCliente {

	private int edad;
	private double peso;
	private String sexo;
	private int tarjetaCredito;

	public Cliente(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public destroy(){

	}

	public int getEdad(){
		return 0;
	}

	public double getPeso(){
		return 0;
	}

	public String getSexo(){
		return "";
	}

	public int getTarjeta(){
		return 0;
	}

	/**
	 * 
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param tarjeta
	 * @param dni
	 * @param contraseña
	 * @param correo
	 * @param nombre
	 * @param nombreUsuario
	 */
	public new(int edad, String sexo, double peso, int tarjeta, String dni, String contraseña, String correo, String nombre, String nombreUsuario){

	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad){

	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(double peso){

	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo){

	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(int tarjeta){

	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(float peso){

	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(String tarjeta){

	}
}//end Cliente