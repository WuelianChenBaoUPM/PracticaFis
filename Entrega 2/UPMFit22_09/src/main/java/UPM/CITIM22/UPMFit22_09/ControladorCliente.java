package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

import servidor.Autenticacion;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:14
 */
public class ControladorCliente {
	
	private List<Cliente> clientes;
	private ViiewCliente ViewCliente;
	private Autenticacion autentica;
	private ControladorCurso controllerCurso;
	
	
	public ControladorCliente(){
		clientes = new ArrayList<>();
		ViewCliente = new ViiewCliente();
		autentica = new Autenticacion();
	}

	public void finalize() throws Throwable {

	}
	public Cliente crearCliente(){
		return new Cliente();
	}
	
	public void separarDatos() {}
	
	
	
	public void altaCliente() {
		
		
		String datos=ViewCliente.formAltaCliente();
		
		
		String info[] = datos.split(",");
		validacion(info);

		
		//int edad, String sexo, double peso, int tarjeta, String dni, String contrasena, String correo, String nombre, String nombreUsuario
		Cliente c = creaCliente(info);
		
		clientes.add(c);
		c.setId(clientes.size());
		
		ViewCliente.altaClienteOk();
		ViewCliente.renderListaCliente(clientes);
		
	}
	
	private Cliente creaCliente(String[] info) {

		return 	new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
	}

	private void validacion(String[] info) {
		// TODO Auto-generated method stub
		
	}

	public void inscribirseACurso(int idCliente,int idCurso){
		Cliente cliente = this.obtenerClientePorId(idCliente);
		Curso curso =controllerCurso.obtenerCursoPorId(idCurso);
		
		if(cliente != null && curso!= null ) {
			cliente.inscribirseACurso(curso);
		}
		
			
	}
	public Cliente obtenerClientePorId(int id) {
		Cliente cliente = new Cliente();
		for (Cliente c : clientes) {
		if (c.getId() == id )	
			cliente = c;
		}
		
		return cliente; 
	}
	
	public void verListaClientes() {
		ViewCliente.renderListaCliente(this.clientes);
		
	}

	public String listaClientes(){
		return "";
	}
	
	//metodos de la relacion con cliente
	
		public void setCliente(List<Cliente> clientes)  {
				
			}
		
		public List<Cliente> getCliente(){
				return clientes;
			}
			
			
		public void removeCliente (Cliente cliente) {
				
			}
}//end ControladorCliente