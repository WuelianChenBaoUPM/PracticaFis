package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

import servidor.Autenticacion;
import servidor.ObtencionDeRol;
import servidor.UPMUsers;
import utilidades.Cifrado;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:14
 */
public class ControladorCliente {
	
	private List<Cliente> clientes;
	private ViiewCliente ViewCliente;

	private ControladorCurso controllerCurso;
	
	
	public ControladorCliente(){
		clientes = new ArrayList<>();
		ViewCliente = new ViiewCliente();
		
	}

	public void finalize() throws Throwable {

	}
	public Cliente crearCliente(){
		return new Cliente();
	}
	

	
	
	public void altaCliente() {
		
		String datos = ViewCliente.formAltaCliente();
		
		String info[] = datos.split(",");
		
		if (validacion(info[6])) {// comprueba si es de la UPM
		UPMUsers rol = getRol(info[6]); // hay que cambiar creaCliente para que me cree un alumno o un trabajador (falta crear las clases )
		
		Cliente c = creaCliente(info);
		c.setRol(rol);
		clientes.add(c);
		c.setId(clientes.size());
		
		}
		
		else {	
			Cliente c = creaCliente(info);
			clientes.add(c);
			c.setId(clientes.size());
			
		}
	
		ViewCliente.renderListaCliente(clientes);
		
	}
	
	
	private Cliente creaCliente(String[] info) {
		String contrasenia = cifradoUPM(info[5]);
		return 	new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
	}
	/*
	private Cliente creaClienteInterno(String[] info) {

		return 	new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
	}
	*/
	private String cifradoUPM(String contrasenia) {
		
		String cifrado = Cifrado.cifrar(contrasenia);
		
		return cifrado;
	}
	private UPMUsers getRol(String correo) {
		// TODO Auto-generated method stub
		UPMUsers rol = ObtencionDeRol.get_UPM_AccountRol(correo);
		
		return rol;
	}
	private boolean validacion (String correo) {
		Autenticacion autentica = new Autenticacion();
		return autentica.existeCuentaUPM(correo);
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