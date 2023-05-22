package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:52
 */

public class Sesion implements InterfazSesion {

	private TActividad actividad;
	private int aforo;
	private String horaFin;
	private String horaInicio;
	private Monitor monitor;
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Sesion(){

	}

	public void finalize() throws Throwable {

	}
	public void destroy(){

	}

	public TActividad getActividad(){
		return this.actividad;
	}

	public int getAforo(){
		return this.aforo;
	}

	public String getHoraFin(){
		return this.horaFin;
	}

	public String getHoraInicio(){
		return this.horaInicio;
	}

	/**
	 * 
	 * @param actividad
	 * @param aforo
	 * @param horaFin
	 * @param horaInicio
	 */
	public Sesion(TActividad actividad, int aforo, String horaFin, String horaInicio){
		this.actividad = actividad;
		this.aforo = aforo;
		this.horaFin = horaFin;
		this.horaInicio = horaInicio;
	}

	

	@Override
	public void setActividad(TActividad actividad){
		this.actividad = actividad;
	}

	@Override
	public void setAforo(int aforo){
		this.aforo = aforo;
	}

	@Override
	public void setHoraFin(String horaFin){
		this.horaFin = horaFin;
	}
	@Override
	public void setHoraInicio(String horaInicio){
		this.horaInicio = horaInicio;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	
}//end Sesion