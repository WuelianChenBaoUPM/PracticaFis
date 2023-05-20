package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:53
 */
public class SesionCerrada extends Sesion implements InterfazSesion {

	private Monitor monitor;

	public SesionCerrada(){

	}

	public SesionCerrada(TActividad actividad, int aforo, String horaFin, String horaInicio,Monitor monitor ){
		
		super(actividad, aforo, horaFin, horaInicio);
		this.monitor = monitor;
	}
	
	public void finalize() throws Throwable {
		super.finalize();
	}
	public void destroy(){

	}
	
	public Monitor getMonitor() {
		return monitor;
	}

	public TActividad getActividad(){
		return super.getActividad();
	}

	public int getAforo(){
		return super.getAforo();
	}

	public String getHoraFin(){
		return super.getHoraFin();
	}

	public String getHoraInicio(){
		return super.getHoraInicio();
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setActividad(TActividad actividad) {
		super.setActividad(actividad);
	}
	/**
	 * 
	 * @param actividad
	 * @param aforo
	 * @param horaFin
	 * @param horaIncio
	 */
	

}//end SesionCerrada