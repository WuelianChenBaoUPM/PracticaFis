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
	
	
	
	public void altaCliente(String datos) {
		String info[] = datos.split(",");
		//int edad, String sexo, double peso, int tarjeta, String dni, String contrasena, String correo, String nombre, String nombreUsuario
		Cliente c = new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
		this.addCliente(c);
		ViewCliente.altaClienteOk();
		ViewCliente.renderListaCliente(clientes);
		
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
				return null;
			}
			
		public void addCliente(Cliente cliente) {
			clientes.add(cliente);
			}
			
		public void removeCliente (Cliente cliente) {
				
			}
}//end ControladorCliente