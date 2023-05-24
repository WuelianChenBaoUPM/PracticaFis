package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

public class ControladorInscripciones {
	private List<InscripcionCurso> inscripciones;
	private ViewInscripciones view ;
	ControladorCliente cliente;
	public ControladorCliente getCliente() {
		return cliente;
	}

	public void setCliente(ControladorCliente cliente) {
		this.cliente = cliente;
	}

	public ControladorCurso getCurso() {
		return curso;
	}

	public void setCurso(ControladorCurso curso) {
		this.curso = curso;
	}

	ControladorCurso curso;
	
	public ControladorInscripciones() {
		this.inscripciones = new ArrayList<>();
		this.view = new ViewInscripciones();
		this.cliente = new ControladorCliente();
		this.curso = new ControladorCurso();
	}
	
	public void inscribirseACurso(String datos) {
		try {
				
		String info[] = datos.split(",");
		InscripcionCurso ins = new InscripcionCurso(cliente.obtenerClientePorId(Integer.parseInt(info[0]))
				,curso.obtenerCursoPorId(Integer.parseInt(info[1])),info[2]);//idCurso
		ins.setId(inscripciones.size());
		inscripciones.add(ins);
			}catch(RuntimeException e) {
				view.printException(e.getMessage());}
	
	}
	public void verInscripciones() {
		view.renderListaInscripcion(convertirLista(inscripciones));
		
	}
	private List<InterfazInscripcion > convertirLista (List<InscripcionCurso> ins){
		List<InterfazInscripcion > inscripInterfaces = new ArrayList<>();
		for (InterfazInscripcion i : ins) {
			inscripInterfaces.add(i);
	    }
		
		
		return inscripInterfaces;
	}
	
	
	
	
	
}
