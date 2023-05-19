package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

public class ControladorInscripciones {
	private List<InscripcionCurso> inscripciones;
	private ViewInscripciones view ;
	
	public ControladorInscripciones() {
		this.inscripciones = new ArrayList<>();
	}
	public void inscribirseACurso() {
		String datos[] = view.datosInscripcion().split(",");
		ControladorCliente cliente = new ControladorCliente();
		ControladorCurso curso = new ControladorCurso();
	
		InscripcionCurso ins = new InscripcionCurso(cliente.obtenerClientePorId(Integer.parseInt(datos[0]))
				,curso.obtenerCursoPorId(Integer.parseInt(datos[1])));
		inscripciones.add(ins);
	}
	
	
	
	
	
}
