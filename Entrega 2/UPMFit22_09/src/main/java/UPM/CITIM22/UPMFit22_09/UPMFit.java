package UPM.CITIM22.UPMFit22_09;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:12
 */
public class UPMFit {


	public ControladorAdmin controllerAdmin;
	public static ControladorCliente controllerCliente= new ControladorCliente();
	public ControladorMonitor controllerMonitor;
	public viewCurso viewCurso;
	public ControladorCurso controllerCurso;

	public UPMFit(){

	}

	public void finalize() throws Throwable {

	}
	private void init(){

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
		 
		 controllerCliente.altaCliente();
		 System.out.println("Lista de clientes");
		 controllerCliente.verListaClientes();
		 
		 
	    
	 }
	 
	 
	 
	 
	    
}//end UPMFit