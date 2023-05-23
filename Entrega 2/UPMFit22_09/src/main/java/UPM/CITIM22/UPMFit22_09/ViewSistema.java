package UPM.CITIM22.UPMFit22_09;

public class ViewSistema {

	public void menu() {
		System.out.println("¿Qué operacion quiere realizar?");
		System.out.println("1. Alta de un Cliente \n2. Alta de un Curso "
				+ "\n3. Inscripcion de un cliente a un curso \n4. Ver la informacion de un curso\n0. Salir");
	}
	public void opcionAltaCliente() {
		System.out.println("Ha elegido crear un Cliente , introduzca sus datos de la forma 'edad,sexo,peso,tarjeta,dni,contrasena,correo,nombre, nombreUsuario'");
		System.out.println("Por ejemplo :  15,hombre,70,123456789,C13215613,contrasena,carlos@alumnos.upm.es,Carlos,CarlosFit,ba0211");
	}
	public void opcionAltaCurso() {
		//String fechaInicio, String fechaFin, String horario, String nombre,SesionCerrada sesion1,SesionCerrada sesion2
		//TActividad actividad, int aforo, String horaFin, String horaInicio,Monitor monitor
		System.out.println("Ha elegido crear un Curso , introduzca sus datos de la forma 'fechaInicio,fechaFin,horario,nombre,"
				+ ";Codigoactividad,aforo,horaFin,horaInicio,codigMonitor;Codigoactividad,aforo,horaFin,horaInicio,codigMonitor'");
		
		System.out.println("Por ejemplo : 16-02-2020,12-01-2021,10:00-19:00,Curso123;2,20,15:00,11:00,2;4,50,14:00,12:00,3");
	}
	public void opcionInscripcion() {
		System.out.println("Ha elegido inscribirse a un Curso , introduzca sus datos de la forma 'idCliente,idCurso,fechaDeInscripcion '");
		System.out.println("Por ejemplo :  2,1,15-05-2020 ");
	}
	public void opcionVerCurso() {
		System.out.println("Ha elegido ver un Curso , introduzca el id del Curso 'idCurso'");
		System.out.println("Por ejemplo : 0");
	}
	
}
