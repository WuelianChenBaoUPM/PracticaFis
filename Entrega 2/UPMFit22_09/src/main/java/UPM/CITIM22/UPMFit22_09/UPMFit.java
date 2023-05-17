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
	public viewCurso viewCurso;
	public ControladorCurso controllerCurso;

	public UPMFit(){

	}

	public void finalize() throws Throwable {

	}
	private void init(){
		
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
		
//		 controllerCliente.altaCliente("20,hombre,80,258258123,x1564564,asdqwe,pepe.fernandez@alumnos.upm.es,Pepe,PepeFit");

	}

	public void main(){

	}

	public String operate(){
		return "";
	}
	
	public void cursoInicio(String datos) {
		tratadoDatos(datos);
		
	}
	
	private void tratadoDatos(String datos) {
		
	}
	
	
	
	 public static void main( String[] args ){
		 UPMFit UPMF = new UPMFit();
		 UPMF.init();
		 UPMF.start();
		 //int edad, String sexo, double peso, int tarjeta, String dni, String contrasena, String correo, String nombre, String nombreUsuario
		 
		 
	 }

	private void start() {

controllerCliente.altaCliente();
		
	}
	 
	 
	 
	 
	    
}//end UPMFit