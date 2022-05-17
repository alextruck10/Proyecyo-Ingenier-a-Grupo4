package control;


import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;

import aplication.ficheros;
import model.Administrador;
import model.Jugador;
import model.Usuario;

public class controlSuspenderJugador  extends controlSuspenderUsuario{

	public static String idText="";
	private Administrador user;
	private String userId=idText;
	private String opcionactivo;
	private String email;
	private String password;
	private String userType = "jugador";
	private String name;
	private String lastnames;
	private String birthday;
	private String genre;
	private boolean active=true;
	
	
	void suspender() throws IOException{
		
		System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA SUSPENDER/ACTIVAR UN JUGADOR");		
		System.out.println(idText);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("UserID: ");
		userId = sc.nextLine();
		userId.equals(userId);
		
		if (opcionactivo == "y") {
			active = true;
		} else if (opcionactivo == "n") {
			active = false;
		}
		
		Usuario nuevo = new Usuario(userId, email, password, userType);
    	Jugador nuevo2 = new Jugador (userId, email, password, userType, name, lastnames, birthday, genre, active);
    	
    	System.out.println("El usuario que se va suspender/activar es: " + nuevo2.toString());
    	String ruta = "src/files/jugadores/" + userId + ".jsonl";
    	
    	ficheros fichero = new ficheros();
    	fichero.escribirLogin(nuevo);
    	fichero.escribirPersona(nuevo2, ruta);	
    	volver();
	
	}
	public void volver () throws IOException {
		ficheros files = new ficheros();
	System.out.println("ACCIÓN FINALIZADA...Volviendo al menú");
	controlJugador controlJugador1 = new controlJugador();
	controlJugador1.menuJugador();		
	}
	public void setUser(Administrador user) {
		this.user = user;
	}
}

	
	

