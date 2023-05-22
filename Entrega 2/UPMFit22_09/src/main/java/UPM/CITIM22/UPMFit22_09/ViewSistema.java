package UPM.CITIM22.UPMFit22_09;

public class ViewSistema {

	public void menu() {
		System.out.println("¿Qué operacion quiere realizar?");
		System.out.println("1. Alta de un Cliente \n2. Alta de un Curso \n3. Inscripcion de un cliente a un curso \n4. Ver la informacion de un curso");
	}
	public void opcionAltaCliente() {
		System.out.println("Ha elegido crear un Cliente , introduzca sus datos de la forma 'edad,sexo,peso,tarjeta,dni,contrasena,correo,nombre, nombreUsuario'");
		System.out.println("Por ejemplo :  15,hombre,70,123456789,C13215613,contrasena,carlos@alumnos.upm.es,Carlos,CarlosFit");
	}
	public void opcionAltaCurso() {
		System.out.println("Ha elegido crear un Curso , introduzca sus datos de la forma 'edad,sexo,peso,tarjeta,dni,contrasena,correo,nombre, nombreUsuario'");
		System.out.println("Por ejemplo :  15,hombre,70,123456789,C13215613,contrasena,carlos@alumnos.upm.es,Carlos,CarlosFit");
	}
	
}
