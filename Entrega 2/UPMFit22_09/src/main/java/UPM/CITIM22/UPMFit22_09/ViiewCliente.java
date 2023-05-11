package UPM.CITIM22.UPMFit22_09;

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
	

	public void renderCliente(){

	}

	public void renderListaCliente(){

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
		float peso = sc.nextFloat();
		cl.setPeso(peso);
		System.out.println("sexo:");
		String sexo = sc.nextLine();
		cl.setSexo(sexo);
		System.out.println("tarjeta de credito:");
		int tarjeta = sc.nextInt();
		cl.setTarjeta(tarjeta);
	
	
	}
	

	
}//end ViiewCliente