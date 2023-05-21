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
	public ViewSesionCerrada  ViewSesionCerrada;

	public Curso(){

	}
	

	public void finalize() throws Throwable {

	}
	public void destroy(){

	}

	public String  getFechaFin(){
		return this.fechaFIn;
	}

	public String getFechaInicio(){
		return this.fechaInicio ;
	}

	public String getHorario(){
		return this.horario;
	}

	public String getNombre(){
		return this.nombre;
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
	public Curso( String fechaInicio, String fechaFin, String horario, String nombre,String sesion1,String sesion2){
		
		
		this.fechaInicio = fechaInicio;
		this.fechaFIn = fechaFin;
		this.horario = horario;
		this.nombre = nombre;
		
		SesionCerrada ses1 = crearSesionCerrada(sesion1);
		SesionCerrada ses2 = crearSesionCerrada(sesion2);
		
		this.sesiones.add(ses1);
		this.sesiones.add(ses2);
		
	}
	
	private  SesionCerrada crearSesionCerrada(String datos) {
		
		String []info = datos.split(",");
		//TActividad actividad, int aforo, String horaFin, String horaInicio,Monitor monitor
		
		TActividad actividad ;
		switch (Integer.parseInt(info[0])) {
		case 1:
			actividad = TActividad.baile;
			break;
		case 2:	
			actividad = TActividad.bicicleta;
			break;
		default:
		case 3:
			actividad = TActividad.general;
			break;
		case 4:
			actividad = TActividad.gimnasia;	
			break;
		case 5:
			actividad = TActividad.natacion;
			break;
		case 6:	
			actividad = TActividad.relax;
			break;
			
		}
		//preguntar si la clase curso puede llamar a la clase ControllerMonitor
		ControladorMonitor controllerM = new ControladorMonitor();
	
		Monitor monitor = controllerM.obtenerMonitorPorId(Integer.parseInt(info[4]));
		return new SesionCerrada(actividad,Integer.parseInt(info[1]),info[2],info[3],monitor);
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


	@Override
	public List<SesionCerrada> getListaSesiones() {
		 
		return this.sesiones;
	}
			
	
}//end Curso