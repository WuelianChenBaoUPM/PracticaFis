package UPM.CITIM22.UPMFit22_09;

public class ViewSistema {

	public void menu() {
		System.out.println("¿Qué operacion quiere realizar? Elija una opcion y los datos a introducir (NumOpcion # Datos a introducir)");
		System.out.println("1. Alta de un Cliente \nPor ejemplo :  1#15,hombre,70,123456789,C13215613,contrasena,carlos@alumnos.upm.es,Carlos,CarlosFit,ba0211 "
				+ "\n2. Alta de un Curso "
				+ "\nPor ejemplo : 2#16-02-2020,12-01-2021,10:00-19:00,Curso123;2,20,15:00,11:00,2;4,50,14:00,12:00,3"
				+ "\n3. Inscripcion de un cliente a un curso \nPor ejemplo : 3#2,1,15-05-2020 "
				+ "\n4. Ver la informacion de un curso\nPor ejemplo : 4#0"
				+ "\n0. Salir");
	}
	 
	
}
