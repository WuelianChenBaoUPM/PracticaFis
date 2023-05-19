package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:54
 */
public class InscripcionCurso {

	private Cliente cliente;
	private Curso curso;
	private int fechaInscripcion;
	
	public InscripcionCurso(){

	}

	public void finalize() throws Throwable {

	}
	public void  destroy(){

	}

	public int getFechaIns(){
		return 0;
	}

	/**
	 * 
	 * @param fechaInscripcion
	 */
	public InscripcionCurso(int fechaInscripcion){
		this.fechaInscripcion = fechaInscripcion;
	}

	public InscripcionCurso(Cliente client , Curso curso){
		this.cliente = client;
		this.curso = curso;
		cliente.getInscripciones().add(this);
		curso.getInscripciones().add(this);
		
	}
	
	
	public void setFechaInscripcion(){

	}
	
	//metodos de la relacion con Curso-Cliente
	
	public void setCurso(Curso curso) {
				
	}
			
	public Curso getCurso(){
		return curso;
	}
	
	public void setCliente(Cliente cliente)  {
		
	}
			
	public Cliente getCliente(){
		return cliente;
	}
			
	
}//end InscripcionCurso