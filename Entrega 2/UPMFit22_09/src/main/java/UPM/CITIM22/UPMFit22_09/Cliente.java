package UPM.CITIM22.UPMFit22_09;

import java.util.List;

import servidor.Autenticacion;
import servidor.UPMUsers;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:50
 */
public class Cliente extends UsuarioNoAdmin implements InterfazCliente {

	
	private List<InscripcionCurso> inscripciones;
	private int edad;
	private float peso;
	private String sexo;
	private int tarjetaCredito;
	private UPMUsers rol ;
	
	public Cliente() {}


	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

	}

	public int getEdad(){
		return 0;
	}

	public float getPeso(){
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
	 * @param contrase�a
	 * @param correo
	 * @param nombre
	 * @param nombreUsuario
	 */
	public Cliente(int edad, String sexo, double peso, int tarjeta, String dni, String contrasena, String correo, String nombre, String nombreUsuario){
		super (dni,contrasena , correo, nombre,nombreUsuario);
		this.edad = edad;
		this.sexo = sexo;
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
	
	
	//metodos de la relacion con Curso-InscripcionCurso
	
	public void setInscripciones(List<InscripcionCurso> inscripciones)  {
			
	}
		
	public List<InscripcionCurso> getInscripciones(){
		return null;
	}
		
	public void addInscripcionCurso(InscripcionCurso inscripcion) {
			
	}
		
	public void removeInscripcionCurso (InscripcionCurso inscripcion) {
			
	}
}//end Cliente