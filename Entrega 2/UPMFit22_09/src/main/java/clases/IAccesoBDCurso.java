package clases;


/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:04
 */
public interface IAccesoBDCurso {

	/**
	 * 
	 * @param curso
	 */
	public void  actualizar(Curso curso);

	/**
	 * 
	 * @param curso
	 */
	public void  borrar(Curso curso);

	/**
	 * 
	 * @param curso
	 */
	public void  insertar(Curso curso);

	/**
	 * 
	 * @param curso
	 */
	public void   seleccionar(Curso curso);

}