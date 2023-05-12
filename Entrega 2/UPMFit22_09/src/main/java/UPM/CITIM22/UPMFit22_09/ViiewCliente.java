package UPM.CITIM22.UPMFit22_09;

import java.util.List;
import java.util.Scanner;

import servidor.Autenticacion;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:56
 */
public class ViiewCliente {

	private ControladorCliente controllerCliente;
	private Scanner sc = new Scanner(System.in);
	
	public ViiewCliente(){

	}
	

	public void finalize() throws Throwable {

	}
	

	public void renderCliente(InterfazCliente c){
		
		System.out.println("nombre : "+c.getNombre()+"\nnombre de usuario : " + c.getNombreUsuario() +"\ncorreo : " + c.getCorreo() + 
				"\ndni : "+c.getDni()+"\nedad :"+ c.getEdad() + "\npeso : "+c.getPeso() + "\nsexo : "+c.getSexo());
	
	}

	public void renderListaCliente(List<Cliente> clientes ){
		for (Cliente c :clientes) {
			renderCliente(c);	
		}
		
	}
	public void altaCliente(InterfazCliente cl){
		
		System.out.println("nombre :");
		String nombre = sc.nextLine();
		cl.setNombre(nombre);
		System.out.println("nombre Usuario :");
		String nombreUs = sc.nextLine();
		cl.setNombreUsuario(nombreUs);
		System.out.println("contrasenia:");
		String contrasenia = sc.nextLine();
		cl.setContrasena(contrasenia);
		System.out.println("correo electronico:");
		String correo = sc.nextLine();
		cl.setCorreo(correo);
		System.out.println("dni:");
		String dni = sc.nextLine();
		cl.setDni(dni);
		System.out.println("edad:");
		int edad = sc.nextInt();
		cl.setEdad(edad);
		System.out.println("peso:");
		int peso = sc.nextInt();
		cl.setPeso(peso);
		System.out.println("sexo (H/M):");
		String sexo = sc.nextLine();
		cl.setSexo(sexo );
		System.out.println("tarjeta de credito:");
		int tarjeta = sc.nextInt();
		cl.setTarjeta(tarjeta);
	
	
	}
	

	
}//end ViiewCliente