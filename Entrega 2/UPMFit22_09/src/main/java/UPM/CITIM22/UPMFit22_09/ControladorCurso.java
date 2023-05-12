package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:14
 */
public class ControladorCurso {

	private List<Curso> cursos;
	public Curso m_Curso;
	public viewCurso m_viewCurso;

	public ControladorCurso(){

	}

	public void finalize() throws Throwable {

	}
	public Curso crearCurso(){
		return null;
	}

	public String listaCursos(){
		return "";
	}
	
	public void altaCurso(SesionCerrada sesion1, SesionCerrada sesion2, String fechaInicio, String fechaFin, String horario, String nombre) {
		Curso curso = new Curso(sesion1, sesion2, fechaInicio, fechaFin, horario, nombre);
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
}//end ControladorCurso