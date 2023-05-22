package UPM.CITIM22.UPMFit22_09;

public interface InterfazInscripcion {
	public int getId()  ;

	public void setId(int id) ;
	
	public int getFechaIns() ;
	public void setFechaInscripcion(String fecha);
	
	 
	public void setCurso(Curso curso) ;
			
	public Curso getCurso();
	
	public void setCliente(Cliente cliente)  ;
			
	public Cliente getCliente();
			
}
