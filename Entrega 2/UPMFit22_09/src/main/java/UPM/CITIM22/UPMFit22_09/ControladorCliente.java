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
	public void verClientes () {
		ViewCliente.renderListaCliente(convertirLista());
	}
	
	private List<InterfazCliente> convertirLista(){
		 List<InterfazCliente> clientesInterfaz = new ArrayList<>();
		    for (Cliente c : clientes) {
		        clientesInterfaz.add(c);
		    }
		    return clientesInterfaz;
	}
	
	
	public void altaCliente(String datos) {
		try {
		String info[] = datos.split(",");
		
		if (validacion(info[6])) {// comprueba si es de la UPM
		UPMUsers rol = getRol(info[6]); 
		
		Cliente c = creaClienteInterno(info,rol);
		c.setId(clientes.size());
		clientes.add(c);
		
		}
		
		else {	
			Cliente c = creaCliente(info);
			c.setId(clientes.size());
			clientes.add(c);
		}
		}catch (RuntimeException e) {
			ViewCliente.printException(e.getMessage());
		}
	
	}
	
	
	private Cliente creaCliente(String[] info) {	
		 
		//la contraseña se cifra dentro del modelo
		return 	new Cliente (Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),
				Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]);
	}
	
	
	private Cliente creaClienteInterno(String[] info,UPMUsers rol) {	
		if (rol == UPMUsers.ALUMNO) {
			Estudiante c = new Estudiante(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),
					info[4],info[5],info[6],info[7],info[8],info[9]); 
			return c;
		}
		else {  
			Personal c = new Personal(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),
					info[4],info[5],info[6],info[7],info[8],Integer.parseInt(info[9]));
			return c;
		}
			
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
			//cliente.getInscripciones().add(inscripcion);
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
	
 
	//metodos de la relacion con cliente
	
		public void setCliente(List<Cliente> clientes)  {
				this.clientes = clientes;
			}
		
		public List<Cliente> getCliente(){
				return clientes;
			}
			
			
		public void removeCliente (Cliente cliente) {
				clientes.remove(cliente);
			}
		public void addCliente(Cliente cliente)  {
			this.clientes.add(cliente);
		}
}//end ControladorCliente