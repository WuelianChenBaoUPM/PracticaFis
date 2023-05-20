package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:14
 */
public class ControladorCurso {

	private List<Curso> cursos;
	
	public viewCurso viewCurso;

	public ControladorCurso(){
		//recordar hacer el new  de las listas
	}

	public void finalize() throws Throwable {

	}
	public Curso crearCurso(){
		return null;
	}

	public String listaCursos(){
		return "";
	}
	
	public void altaCurso(String datos) {
		String info [] = datos.split(",");
		//String fechaInicio, String fechaFin, String horario, String nombre,String sesion1,String sesion2
		Curso curso = new Curso (info[0],info[1],info[2],info[3],info[4],info[5]);
		cursos.add(curso);
		curso.setId(cursos.size());
		
	
	}
	
	public Curso obtenerCursoPorId(int id) {
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
}//end ControladorCurso