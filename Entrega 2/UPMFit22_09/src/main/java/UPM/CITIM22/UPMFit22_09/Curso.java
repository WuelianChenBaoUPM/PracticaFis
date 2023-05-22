package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
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
	private ControladorMonitor controladorMonitor;		
	
	public ControladorMonitor getControladorMonitor() {
		return controladorMonitor;
	}


	public ViewSesionCerrada  viewSesionCerrada;

	public void setControladorMonitor(ControladorMonitor controladorMonitor) {
		this.controladorMonitor = controladorMonitor;
	}

	public Curso(){
		this.viewSesionCerrada = new ViewSesionCerrada();
		this.sesiones = new ArrayList<>();
		this.inscripciones =new ArrayList<>();
		controladorMonitor =new ControladorMonitor();
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

	/**
	 * 
	 * @param fechaInicio
	 * @param fechaFin
	 * @param horario
	 * @param nombre
	 */
	public Curso( String fechaInicio, String fechaFin, String horario, String nombre,SesionCerrada sesion1,SesionCerrada sesion2){
		

		this.viewSesionCerrada = new ViewSesionCerrada();
		this.sesiones = new ArrayList<>();
		this.inscripciones =new ArrayList<>();
		this.fechaInicio = fechaInicio;
		this.fechaFIn = fechaFin;
		this.horario = horario;
		this.nombre = nombre;
		
	 
		this.sesiones.add(sesion1);
		 
		this.sesiones.add(sesion2);
		
	}
	
	public void altaSesionCerrada(String datos) {
		SesionCerrada sesion = crearSesionCerrada( datos);
		
	}
	
	 public SesionCerrada crearSesionCerrada(String datos) {
		
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
		 
		Monitor monitor = controladorMonitor.obtenerMonitorPorId(Integer.parseInt(info[4]));
		SesionCerrada sesion = new SesionCerrada(actividad,Integer.parseInt(info[1]),info[2],info[3],monitor);
		sesion.setId(sesiones.size());
		this.sesiones.add(sesion);
		
		return sesion;
	}
	 
	 
	 private List<InterfazSesion> convertirLista(){
		 List<InterfazSesion> sesionesInterfaz = new ArrayList<>();
		    for (InterfazSesion s : sesiones) {
		    	sesionesInterfaz .add(s);
		    }
		    return sesionesInterfaz ;
	}
	
	 
	public void verListaSesiones() {
		
		viewSesionCerrada.renderLisatSesionesCerradas(getListaSesiones());
	}
	 
	public void setId (int id) {
		this.id = id;
	}
	public int getId () {return this.id;}
	
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
	
	 
	//metodos de la relacion con Cliente-InscripcionCurso
	
	public void setInscripciones(List<InscripcionCurso> inscripciones)  {
				
	}
			
	public List<InscripcionCurso> getInscripciones(){
		return this.inscripciones;
	}


	@Override
	public List<InterfazSesion> getListaSesiones() {
		 
		return convertirLista();
	}
			
	
}//end Curso