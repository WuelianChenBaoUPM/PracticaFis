package UPM.CITIM22.UPMFit22_09;

import servidor.UPMUsers;

public interface InterfazPersonal {

 
	public int getAntiguedad() ;
	public UPMUsers getTipoEmpleado() ;
	public float getDescuento() ;
	
	public void setAntiguedad(int antiguedad) ;
	public void setTipoEmpleado(UPMUsers tipoEmpleado) ;
	public void setDescuento(int antiguedad) ;
}
