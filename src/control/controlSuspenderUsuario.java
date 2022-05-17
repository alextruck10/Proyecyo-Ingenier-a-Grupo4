package control;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Usuario;

public class controlSuspenderUsuario {

	private String idText;
	private Administrador user;
	
	
/*	private String userId=idText;
	
	private String email;
	private String password;
	private String userType = "jugador";
	private String name;
	private String lastnames;
	private String birthday;
	private String genre;
	private boolean active;*/
	
	
	void suspenderJugador() {
		
		System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA SUSPENDER/ACTIVAR UN JUGADOR");		
		
		//System.out.println(idText);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("UserID: ");
		idText=sc.nextLine();
		System.out.println(idText);
		
		user.suspenderUsuario(idText);		
		
		/*System.out.println("¿A quién desea suspender/activar?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		System.out.println(idText);
		
		user.suspenderJugador(idText);
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(idText);

		if (persona != null) {

			persona = files.leerUsuario(persona);
			
			switch (persona.getUserType()) {
			
			case "jugador":

				controlSuspenderJugador controlSuspenderJugador1 = new controlSuspenderJugador();
				controlSuspenderJugador1.setUser(user);
				controlSuspenderJugador1.suspender();
				
				break;
			}
		}*/
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
