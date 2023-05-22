package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

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
		this.inscripciones= new ArrayList<>(); 
		setEdad(edad);
		setSexo(sexo);
		setPeso(peso);
		setTarjeta(tarjeta);
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad){
		if (edad<=0)
			throw new RuntimeException("La edad debe de ser positiva");
		this.edad = edad;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(int peso){
		if (peso<0)
			throw new RuntimeException("El peso debe de ser positivo");
		this.peso= peso;
	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo){
		if (sexo == null ||sexo.isEmpty())
			throw new RuntimeException("El sexo tiene que ser un cadena de caracteres no vacia");
		this.sexo = sexo;
	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(int tarjeta){
		if (tarjeta <= 0)
			throw new RuntimeException("La tarjeta deben de ser numeros positivos");
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
	
		
	public List<InscripcionCurso> getInscripciones(){
		return this.inscripciones;
	}
		
	public void addInscripcionCurso(InscripcionCurso inscripcion) {
			this.inscripciones.add(inscripcion);
	}
		
	



}//end Cliente