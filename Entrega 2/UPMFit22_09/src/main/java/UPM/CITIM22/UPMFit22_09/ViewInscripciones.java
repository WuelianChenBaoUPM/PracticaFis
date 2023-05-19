package UPM.CITIM22.UPMFit22_09;

import java.util.Scanner;

public class ViewInscripciones {

	private ControladorInscripciones controllerInscrip;
	
	public ViewInscripciones() {}
	
	public String datosInscripcion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("que cliente?(id)");
		String idClient = sc.nextLine();
		System.out.println("que curso?(id)");
		String idCurso = sc.nextLine();
		return idClient + "," +idCurso;
	}
	

}
