package UPM.CITIM22.UPMFit22_09;

import servidor.UPMUsers;

public class Personal extends Cliente{
	private UPMUsers tipoEmpleado;
	private int antiguedad;
	private float descuento;
	
	public Personal (int edad, String sexo, int peso, int tarjeta, String dni, String contrasena, 
			String correo, String nombre, String nombreUsuario,int antiguedad,UPMUsers tipoEmpleado) {
		super(edad,sexo,peso,tarjeta,dni,contrasena,correo,nombre,nombreUsuario);
		
		this.antiguedad = antiguedad;
		this.descuento = (float) 0.25+ calcularDesc(antiguedad);
		this.tipoEmpleado = tipoEmpleado;
		
	}
	
	private float calcularDesc(int antiguedad) {
		return  (float) ((float)antiguedad*0.03);
		
	}
 
	public int getAntiguedad() {
	return this.antiguedad;
}
	public UPMUsers getTipoEmpleado() {
		return tipoEmpleado;
	}
	public float getDescuento() {
		return descuento;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public void setTipoEmpleado(UPMUsers tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
}
