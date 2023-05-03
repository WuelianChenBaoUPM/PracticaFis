

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:09
 */
public interface InterfazCliente {

	public int getEdad();

	public float getPeso();

	public String getSexo();

	public String getTarjeta();

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad);

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(float peso);

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo);

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(String tarjeta);

}