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
	private int peso;
	private String sexo;
	private int tarjetaCredito;
	private UPMUsers rol = null;
	private int id;
	
	public Cliente() {}


	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

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
	public Cliente(int edad, String sexo, int peso, int tarjeta, String dni, String contrasena, String correo, String nombre, String nombreUsuario){
		super (dni,contrasena , correo, nombre,nombreUsuario);
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.tarjetaCredito = tarjeta;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad){
		this.edad = edad;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(int peso){
		this.peso= peso;
	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(int tarjeta){
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
	
	public void inscribirseACurso (Curso c) {
		
		InscripcionCurso inscripcion = new InscripcionCurso (this,c );
		addInscripcionCurso(inscripcion);
	}
	
	public void setInscripciones(List<InscripcionCurso> inscripciones)  {
			
	}
		
	public List<InscripcionCurso> getInscripciones(){
		return null;
	}
		
	public void addInscripcionCurso(InscripcionCurso inscripcion) {
			this.inscripciones.add(inscripcion);
	}
		
	public void removeInscripcionCurso (InscripcionCurso inscripcion) {
			
	}


	public UPMUsers getRol() {
		return rol;
	}


	public void setRol(UPMUsers rol) {
		this.rol = rol;
	}
}//end Cliente