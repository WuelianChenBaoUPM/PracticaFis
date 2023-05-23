package UPM.CITIM22.UPMFit22_09;

import java.util.Scanner;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:12
 */
public class UPMFit {

	public ViewSistema viewSistema;
	public ControladorAdmin controllerAdmin;
	public ControladorCliente controllerCliente;
	public ControladorMonitor controllerMonitor;
	public ControladorCurso controllerCurso;
	public Curso controllerSesiones;
	public ControladorInscripciones controllerInscripcion;

	public UPMFit(){

	}

	public void finalize() throws Throwable {

	}
	private void init(){ // inicializacion de todas las variables y cosas a tener previos a la ejecucion del menú
		
		this.controllerCliente= new ControladorCliente();
		this.controllerMonitor = new ControladorMonitor();
		this.controllerCurso =  new ControladorCurso();
		this.controllerSesiones = new Curso();
		this.controllerInscripcion = new ControladorInscripciones();
		this.viewSistema = new ViewSistema();
		controllerSesiones.setControladorMonitor(controllerMonitor);
		controllerCurso.setControladorSesiones(controllerSesiones);
		controllerInscripcion.setCliente(controllerCliente);
		controllerInscripcion.setCurso(controllerCurso);
		
		//clientes 
	
		controllerCliente.altaCliente("20,hombre,80,258258123,x1564564,asdqwe,pepe.fernandez@gmail.com,Pepe,PepeFit");//cliente normal
		controllerCliente.altaCliente("18,hombre,80,258258123,x1564564,asdqwe,jose.fernandez@alumnos.upm.es,jose,JoseFit,bs012");//estudiante : tiene matricula
		controllerCliente.altaCliente("19,hombre,80,258258123,x1564564,asdqwe,Rafa.Miñano@profesores.upm.es,Rafael,2"); //empleado :tiene antiguedad y tipo de empleado
		//controllerCliente.verClientes();
		
		//monitores
		
		controllerMonitor.altaMonitor("23132123,x151565611,as5d15,ramoncin.perez@upm.es,Ramon,RamonGym");
		controllerMonitor.altaMonitor("895648,70649821H,azul5D,pedrito@upm.es,Pedro,PedroPilates");
		controllerMonitor.altaMonitor("892248,86588104K,verde3C,monica.perez@upm.es,Monica,MonicaBici");
		controllerMonitor.altaMonitor("895648,37498210P,amarillo6B,ana_gomez@upm.es,Ana,AnaUPM");
		//controllerMonitor.verMonitores();
		//sesiones
		
		 
		controllerSesiones.altaSesionCerrada("1,10,15:00,12:00,1");
		controllerSesiones.altaSesionCerrada("2,20,16:00,15:00,2");
		controllerSesiones.altaSesionCerrada("3,30,17:30,13:00,0");
		controllerSesiones.altaSesionCerrada("4,40,15:00,10:00,1");
		//controllerSesiones.verListaSesiones();
	 
		//cursos
		////String fechaInicio, String fechaFin, String horario, String nombre ; String sesion1 ; String sesion2
		controllerCurso.altaCurso("15-02-2023,15-04-2023,10:00-14:00,Curso1;5,30,15:00,11:00,1;6,30,14:00,12:00,2");
		
		//inscripciones //idCliente , idCurso , fecha
		controllerInscripcion.inscribirseACurso("0,0,15-01-2023");
		//controllerInscripcion.inscribirseACurso("1,1,10-01-2013");
		//controllerInscripcion.inscribirseACurso("2,2,05-02-2023");
		//controllerInscripcion.verInscripciones();
		 
	}


	public void menu(){ //el menu de las operaciones que queremos hacer (recordar hacer una vista)
		
		
	}
	
	
	 public static void main( String[] args ){
		 UPMFit UPMF = new UPMFit();
		 UPMF.init();
		 UPMF.start();
		 
		 
	 }

	private void start() { 
		int opcion ; 
		Scanner sc = new Scanner(System.in);
		do {
			viewSistema.menu();
		opcion = sc.nextInt();	
		switch (opcion) {
		case 1:
			viewSistema.opcionAltaCliente();
			controllerCliente.altaCliente(datos());
			break;
		case 2:
			viewSistema.opcionAltaCurso();
			controllerCurso.altaCurso(datos());
			break;
		case 3:
			viewSistema.opcionInscripcion();
			controllerInscripcion.inscribirseACurso(datos());
			break;
		case 4:
			viewSistema.opcionVerCurso();
			controllerCurso.verCurso(datos());
			break;

		case 0:
			break;
		}
		
		}
		while (opcion !=0);
	// controllerCliente.altaCliente();
		
	}
	 
	 public String datos () {
		 Scanner sc = new Scanner(System.in);
		 String info = sc.nextLine();
		 return info;
	 }
	 
	 
	 
	    
}//end UPMFit