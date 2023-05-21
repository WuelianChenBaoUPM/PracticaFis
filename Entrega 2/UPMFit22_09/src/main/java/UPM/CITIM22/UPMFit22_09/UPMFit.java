package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:12
 */
public class UPMFit {


	public ControladorAdmin controllerAdmin;
	public ControladorCliente controllerCliente;
	public ControladorMonitor controllerMonitor;
	public ControladorCurso controllerCurso;
	public Curso controllerSesiones;

	public UPMFit(){

	}

	public void finalize() throws Throwable {

	}
	private void init(){ // inicializacion de todas las variables y cosas a tener previos a la ejecucion del menú
		
		this.controllerCliente= new ControladorCliente();
		this.controllerMonitor = new ControladorMonitor();
		this.controllerCurso =  new ControladorCurso();
		this.controllerSesiones = new Curso();
		
		
		//clientes 
		
	
		controllerCliente.altaCliente("20,hombre,80,258258123,x1564564,asdqwe,pepe.fernandez@gmail.com,Pepe,PepeFit");//cliente normal
		controllerCliente.altaCliente("20,hombre,80,258258123,x1564564,asdqwe,jose.fernandez@alumnos.upm.es,jose,JoseFit,bs012");//estudiante : tiene matricula
		controllerCliente.altaCliente("20,hombre,80,258258123,x1564564,asdqwe,Rafa.Miñano@profesores.upm.es,Rafael,2"); //empleado :tiene antiguedad y tipo de empleado
		controllerCliente.verClientes();
		
		//monitores
		
		controllerMonitor.altaMonitor("23132123,x151565611,as5d15,ramoncin.perez@upm.es,Ramon,RamonGym");
		controllerMonitor.altaMonitor("895648,70649821H,azul5D,pedrito@upm.es,Pedro,PedroPilates");
		controllerMonitor.altaMonitor("892248,86588104K,verde3C,monica.perez@upm.es,Monica,MonicaBici");
		controllerMonitor.altaMonitor("895648,37498210P,amarillo6B,ana_gomez@upm.es,Ana,AnaUPM");
		controllerMonitor.verMonitores();
		//sesiones
		
		/*
		SesionCerrada s1 = new SesionCerrada(m1, TActividad.general , 20, "14:00", "15:00");
		controllerSesiones.getSesiones().add(s1);
		SesionCerrada s2 = new SesionCerrada(m2, TActividad.gimnasia , 20, "17:00", "18:00");
		controllerSesiones.getSesiones().add(s2);
		SesionCerrada s3 = new SesionCerrada(m1, TActividad.bicicleta , 40, "15:00", "16:00");
		controllerSesiones.getSesiones().add(s3);
		SesionCerrada s4 = new SesionCerrada(m1, TActividad.baile , 30, "16:00", "17:00");
		controllerSesiones.getSesiones().add(s4);
		 */
	 
	}


	public String operate(){ //el menu de las operaciones que queremos hacer (recordar hacer una vista)
		return "";
	}
	
	
	 public static void main( String[] args ){
		 UPMFit UPMF = new UPMFit();
		 UPMF.init();
		 UPMF.start();
		 
		 
	 }

	private void start() { 

	// controllerCliente.altaCliente();
		
	}
	 
	 
	 
	 
	    
}//end UPMFit