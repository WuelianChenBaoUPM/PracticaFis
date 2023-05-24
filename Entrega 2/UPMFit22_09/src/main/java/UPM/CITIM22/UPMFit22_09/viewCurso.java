package UPM.CITIM22.UPMFit22_09;


/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:11:55
 */
public class viewCurso {

	public viewCurso(){

	}

	public void finalize() throws Throwable {

	}
	 

	public void renderCurso(InterfazCurso curso){
		ViewSesionCerrada viewSesionesC = new ViewSesionCerrada();
		
	
		System.out.println("Curso : "+ curso.getNombre() +"\nFecha de Inicio : "+curso.getFechaInicio()+"\nFecha de Fin : "+curso.getFechaFin()+"\nHorario : "+ curso.getHorario());
		
		System.out.println("\nSesiones que lo componen : ");
		
		viewSesionesC.renderLisatSesionesCerradas(curso.getListaSesiones());
		
	}

	public void renderListaCursos(){

	}
	
	public void printException (String e) {
		System.out.println(e );
	}
	
}//end viewCurso