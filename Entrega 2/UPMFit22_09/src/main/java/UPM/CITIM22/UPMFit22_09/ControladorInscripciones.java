package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

public class ControladorInscripciones {
	private List<InscripcionCurso> inscripciones;
	private ViewInscripciones view ;
	
	public ControladorInscripciones() {
		this.inscripciones = new ArrayList<>();
		view = new ViewInscripciones();
	}
	public void inscribirseACurso(String idCliente,String idCurso) {
		
		ControladorCliente cliente = new ControladorCliente();
		ControladorCurso curso = new ControladorCurso();
	
		InscripcionCurso ins = new InscripcionCurso(cliente.obtenerClientePorId(Integer.parseInt(idCliente))
				,curso.obtenerCursoPorId(Integer.parseInt(idCurso)));//idCurso
		ins.setId(inscripciones.size());
		inscripciones.add(ins);
	}
	
	
	
	
	
	
	
}
