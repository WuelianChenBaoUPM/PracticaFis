package UPM.CITIM22.UPMFit22_09;

import java.util.List;
import java.util.Scanner;

public class ViewInscripciones {

	private ControladorInscripciones controllerInscrip;
	private ViiewCliente viewCliente;
	private viewCurso viewCurso;
	
	public ViewInscripciones() {
		viewCliente = new ViiewCliente();
		viewCurso = new viewCurso();
	}
	
	public void renderInscripcion(InterfazInscripcion inscrip) {
		System.out.println("Inscripcion : "+"\nFecha de inscripcion : "+ inscrip.getFechaIns());
		System.out.println("Cliente : " );
		viewCliente.renderCliente(inscrip.getCliente());
		System.out.println("Curso : " );
		viewCurso.renderCurso(inscrip.getCurso());
		
	}
	
	public void renderListaInscripcion(List<InterfazInscripcion > inscrip) {
		System.out.println();
		for(InterfazInscripcion i : inscrip) {
			renderInscripcion(i);
		}
		
	}
	public void printException (RuntimeException e) {
		System.out.println(e.getMessage());
	}
}
