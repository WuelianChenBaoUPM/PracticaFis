package UPM.CITIM22.UPMFit22_09;

import java.util.List;

/**
 * @author The Administrator
 * @version 1.0
 * @created 28-abr.-2023 0:12:13
 */
public class ControladorAdmin {
	
	private List<Administrador> admins;

	public viewAdministrador viewAdministrador;
	
	public ControladorAdmin(){

	}

	public void finalize() throws Throwable {

	}
 
	public void crearAdmin(String datos) {
		String [] info = datos.split(",");
		 try {
			 Administrador admin = new Administrador(Integer.parseInt(info[0]),info[1],info[2],info[3],info[4]);
			 admins.add(admin);
		 } catch (RuntimeException e) {
				viewAdministrador.printException(e.getMessage());
			}
		
		
	}

	 
	 
	//metodos relacion con Admin
	
		public void setAdmin(List<Administrador> admins)  {
			
		}
		
		public List<Administrador> getAdmin(){
			return this.admins;
		}
		
		public void addAdmin(Administrador admin) {
			
		}
		
		public void removeAdmin (Administrador admin) {
			
		}
}//end ControladorAdmin