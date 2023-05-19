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
	

	
	public void  formAltaCliente() {
		
		//int edad, String sexo, double peso, int tarjeta, String dni, String contrasena, String correo, String nombre, String nombreUsuario
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba los datos del nuevo cliente de la forma +"
				+ "\n'edad,sexo,peso,tarjeta,dni,contrasena,correo,nombre,nombreUsuario'");
		String datos = sc.nextLine();
		
	}
	

	
}//end ViiewCliente