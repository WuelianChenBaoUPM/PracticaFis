package UPM.CITIM22.UPMFit22_09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:14
 */
public class ControladorCurso {

	private List<Curso> cursos;
	private Curso controladorSesiones ;

	public viewCurso viewCurso;

	public ControladorCurso(){
		viewCurso = new viewCurso();
		controladorSesiones = new Curso();
		cursos = new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}
	public Curso crearCurso(){
		return null;
	}

	public String listaCursos(){
		return "";
	}
	
	public void verCurso(String id) {
		
		int idCurso = Integer.parseInt(id);
		viewCurso.renderCurso(obtenerCursoPorId(idCurso));
	}
	
	public void altaCurso(String datos) {
		try {
		String info [] = datos.split(";");
		String infoCurso [] = info[0].split(",");
		//String fechaInicio, String fechaFin, String horario, String nombre,String sesion1,String sesion2
		SesionCerrada ses1 = controladorSesiones.crearSesionCerrada(info[1]);
		SesionCerrada ses2 = controladorSesiones.crearSesionCerrada(info[2]);
		Curso curso = new Curso (infoCurso[0],infoCurso[1],infoCurso[2],infoCurso[3],ses1,ses2);

		curso.setId(cursos.size());
		cursos.add(curso);
		}catch(RuntimeException e) {
			viewCurso.printException(e);
		}
	}
	
	public Curso  obtenerCursoPorId(int id) {
		Curso curso = new Curso();
		for (Curso c : cursos) {
			if (c.getId() == id )	
				curso = c;
			}
		
		return curso;
	}
	
	//metodos relacion con curso
	
	public void setCurso(List<Curso> cursos)  {
		this.cursos = cursos;
	}
	
	public List<Curso> getCurso(){
		return this.cursos;
	}
	
	public void addCurso(Curso curso) {
		this.cursos.add(curso);
	}
	
	public void removeCurso (Curso curso) {
		this.cursos.remove(curso);
	}
	public Curso getControladorSesiones() {
		return controladorSesiones;
	}

	public void setControladorSesiones(Curso controladorSesiones) {
		this.controladorSesiones = controladorSesiones;
	}

	
}//end ControladorCurso