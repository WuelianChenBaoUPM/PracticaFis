package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
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
	private int peso;
	private String sexo;
	private int tarjetaCredito;
	private int id;
	
	public Cliente() {}


	public void finalize() throws Throwable {
		super.finalize();
	}
	
	public int getEdad(){
		return this.edad;
	}

	public int getPeso(){
		return this.peso;
	}

	public String getSexo(){
		return this.sexo;
	}

	public int getTarjeta(){
		return this.tarjetaCredito;
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
	public Cliente(int edad, String sexo, int peso, int tarjeta, String dni, String contrasena, String correo,
			String nombre, String nombreUsuario){
		super (dni,contrasena , correo, nombre,nombreUsuario);
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.tarjetaCredito = tarjeta;
		this.inscripciones= new ArrayList<>(); 
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad){
		if (edad>0)
		this.edad = edad;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(int peso){
		if (peso>0)
		this.peso= peso;
	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo){
		if (sexo != null)
		this.sexo = sexo;
	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(int tarjeta){
		if (tarjeta >= 0)
		this.tarjetaCredito = tarjeta;
	}

	/**
	 * 
	 * @param peso
	 */


	/**
	 * 
	 * @param tarjeta
	 */
	
	public void setId (int id) {
		this.id = id;
	}
	public int getId () {return this.id;}
	
	//metodos de la relacion con Curso-InscripcionCurso
	
	
	
	
	public void setInscripciones(List<InscripcionCurso> inscripciones)  {
			
	}
		
	public List<InscripcionCurso> getInscripciones(){
		return this.inscripciones;
	}
		
	public void addInscripcionCurso(InscripcionCurso inscripcion) {
			this.inscripciones.add(inscripcion);
	}
		
	public void removeInscripcionCurso (InscripcionCurso inscripcion) {
			
	}




}//end Cliente