package UPM.CITIM22.UPMFit22_09;



/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:09
 */
public interface InterfazCliente extends InterfazUsNoAdmin{

	public int getEdad();

	public int getPeso();

	public String getSexo();

	public int getTarjeta();

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad);

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(int peso);

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo);

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(int tarjeta);

}