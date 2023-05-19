package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:12
 */
public class UPMFit {


	public ControladorAdmin controllerAdmin;
	public ControladorCliente controllerCliente= new ControladorCliente();
	public ControladorMonitor controllerMonitor;
	public ControladorCurso controllerCurso;
	public Curso controllerSesiones;

	public UPMFit(){

	}

	public void finalize() throws Throwable {

	}
	private void init(){ // inicializacion de todas las variables y cosas a tener previos a la ejecucion del menú
		/*
		Cliente c = new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
		controllerCliente.getCliente().add(c);
		
		Cliente c2 = new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
		controllerCliente.getCliente().add(c2);
		
		Cliente c3 = new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
		controllerCliente.getCliente().add(c3);
		
		Cliente c4 = new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
		controllerCliente.getCliente().add(c4);
		
		Cliente c5 = new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
		
		controllerCliente.getCliente().add(c5);
		*/
//		 controllerCliente.altaCliente("20,hombre,80,258258123,x1564564,asdqwe,pepe.fernandez@alumnos.upm.es,Pepe,PepeFit");
		
		//monitores
		Monitor m1 = new Monitor(895648, "95681283T", "rojo2A", "ramoncin.perez@upm.es", "Ramon", "RamonGym");
		controllerMonitor.getMonitor().add(m1);
		Monitor m2 = new Monitor(895648, "70649821H", "azul5D", "pedrito@upm.es", "Pedro", "PedroPilates");
		controllerMonitor.getMonitor().add(m2);
		Monitor m3 = new Monitor(895648, "86588104K", "verde3C", "monica.perez@upm.es", "Monica", "MonicaBici");
		controllerMonitor.getMonitor().add(m3);
		Monitor m4 = new Monitor(895648, "37498210P", "amarillo6B", "ana_gomez@upm.es", "Ana", "AnaUPM");
		controllerMonitor.getMonitor().add(m4);
		
		//TActividad a = general, bicicleta, baile, gimnasia;
		//sesiones
		SesionCerrada s1 = new SesionCerrada(m1, TActividad.general , 20, "14:00", "15:00");
		controllerSesiones.getSesiones().add(s1);
		SesionCerrada s2 = new SesionCerrada(m2, TActividad.gimnasia , 20, "17:00", "18:00");
		controllerSesiones.getSesiones().add(s2);
		SesionCerrada s3 = new SesionCerrada(m1, TActividad.bicicleta , 40, "15:00", "16:00");
		controllerSesiones.getSesiones().add(s3);
		SesionCerrada s4 = new SesionCerrada(m1, TActividad.baile , 30, "16:00", "17:00");
		controllerSesiones.getSesiones().add(s4);

	}


	public String operate(){ //el menu de las operaciones que queremos hacer (recordar hacer una vista)
		return "";
	}
	
	public void cursoInicio(String datos) {
		tratadoDatos(datos);
		
	}
	
	private void tratadoDatos(String datos) {
		
	}
	
	
	 public static void main( String[] args ){
		 UPMFit UPMF = new UPMFit();
		// UPMF.init();
		 UPMF.start();
		 
		 
	 }

	private void start() { // operaciones 

	controllerCliente.altaCliente();
		
	}
	 
	 
	 
	 
	    
}//end UPMFit