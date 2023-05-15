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
	private String fechaFIn;
	private String fechaInicio;
	private String horario;
	private String nombre;
	private int id ;
	// public   ListaCursos  m_ListaCursos;
	public ViewSesionCerrada  m_ViewSesionCerrada;

	public Curso(){

	}
	

	public void finalize() throws Throwable {

	}
	public SesionCerrada crearSesionCerrada(Monitor monitor, TActividad actividad, int aforo, String horaFin, String horaInicio){
		
		SesionCerrada sesion = new SesionCerrada(monitor, actividad, aforo, horaFin, horaInicio);
		
		return sesion;
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
	public Curso(SesionCerrada sesion1, SesionCerrada sesion2, String fechaInicio, String fechaFin, String horario, String nombre){
		this.sesiones.add(sesion1);
		this.sesiones.add(sesion2);
		this.fechaInicio = fechaInicio;
		this.fechaFIn = fechaFin;
		this.horario = horario;
		this.nombre = nombre;
	}
	public void setId (int id) {
		this.id = id;
	}
	public int getId () {return this.id;}

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