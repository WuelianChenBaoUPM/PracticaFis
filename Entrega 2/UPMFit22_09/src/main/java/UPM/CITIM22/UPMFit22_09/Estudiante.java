package UPM.CITIM22.UPMFit22_09;

public class Estudiante  extends Cliente {

	private float descuento; 
	private String matricula;
	
	public Estudiante (int edad, String sexo, int peso, int tarjeta, String dni, String contrasena, 
			String correo, String nombre, String nombreUsuario,String matricula) {
		super(edad,sexo,peso,tarjeta,dni,contrasena,correo,nombre,nombreUsuario);
		this.descuento = (float) 0.5;

		setMatricula(matricula);
	}
	
	public float getDescuento() {
		return this.descuento;
	}	
	
	public void setMatricula (String matricula) 
	{
		if(matricula == null || matricula.isEmpty())
			throw new RuntimeException("La matricula tiene que ser un cadena de caracteres no vacia");
		this.matricula = matricula;
	}
	public String getMatricula () 
	{
		return this.matricula ;
	}
	
	
}
