package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * omb
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:51
 */
public class Curso implements InterfazCurso {

	private List<InscripcionCurso> inscripciones;
	private List<SesionCerrada> sesiones;
	private int fechaFIn;
	private int fechaInicio;
	private int horario;
	private String nombre;
	// public   ListaCursos  m_ListaCursos;
	public ViewSesionCerrada  m_ViewSesionCerrada;

	public Curso(){

	}
	

	public void finalize() throws Throwable {

	}
	public SesionCerrada crearSesionCerrada(){
		return null;
	}

	public void destroy(){

	}

	public String  getFechaFin(){
		return "";
	}

	public String getFechaInicio(){
		return "" ;
	}

	public String getHorario(){
		return " ";
	}

	public String getNombre(){
		return "";
	}

	public String listaSesionesCerradas(){
		return "";
	}

	/**
	 * 
	 * @param fechaInicio
	 * @param fechaFin
	 * @param horario
	 * @param nombre
	 */
	public Curso(int fechaInicio, int fechaFin, int horario, String nombre){

	}

	public void setFechaFin(){

	}

	public void setFechaInicio(){

	}

	public void setHorario(){

	}

	public void setNombre(){

	}

	public void visualizarInformacion(){

	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaFin(String fecha){

	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFechaInicio(String fecha){

	}

	/**
	 * 
	 * @param horario
	 */
	public void setHorario(String horario){

	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre){

	}
	
	//metodos de la relacion con SesionCerrada
	
	public void setSesiones(List<SesionCerrada> sesiones) {
		this.sesiones = sesiones;
	}
	
	public List<SesionCerrada> getSesiones(){
		return this.sesiones;
	}
	
	public void addSesion(SesionCerrada sesion) {
		this.sesiones.add(sesion);
	}
	
	public void removeSesion (SesionCerrada sesion) {
		this.sesiones.remove(sesion);
	}
	//metodos de la relacion con Cliente-InscripcionCurso
	
	public void setInscripciones(List<InscripcionCurso> inscripciones)  {
				
	}
			
	public List<InscripcionCurso> getInscripciones(){
		return null;
	}
			
	public void addInscripcionCurso(InscripcionCurso inscripcion) {
				
	}
			
	public void removeInscripcionCurso (InscripcionCurso inscripcion) {
				
	}
}//end Curso