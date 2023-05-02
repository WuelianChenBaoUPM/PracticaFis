

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
	public actualizar(Curso curso);

	/**
	 * 
	 * @param curso
	 */
	public borrar(Curso curso);

	/**
	 * 
	 * @param curso
	 */
	public insertar(Curso curso);

	/**
	 * 
	 * @param curso
	 */
	public seleccionar(Curso curso);

}