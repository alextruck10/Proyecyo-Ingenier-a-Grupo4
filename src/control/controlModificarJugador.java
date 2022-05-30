package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Jugador;
import model.Usuario;

public class controlModificarJugador extends controlModificarUsuario{
	private Administrador user;
	private int opcion;
	private String userId=idText;
	private String email;
	private String password;
	private String userType = "jugador";
	private String name;
	private String lastnames;
	private String birthday;
	private String genre;
	private boolean active=true;
	private String opciongenero;
	private String opcionactivo;


	void modificarJugador() throws IOException {
		System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA MODIFICAR UN JUGADOR");		
		System.out.println(idText);
		user.borrarUsuario(idText);
		System.out.println("1.Email:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		email = sc.nextLine();
		System.out.println("Password: ");
		password = sc.nextLine();
		//System.out.println("UserID: ");
		//userId = sc.nextLine();
		userId.equals(userId);
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("LastName: ");
		lastnames = sc.nextLine();
		System.out.println("Birthday DD-MM-AAAA: ");
		birthday = sc.nextLine();
		System.out.println("Genre: (hombre/mujer)");
		genre = sc.nextLine();
		/*System.out.println("Usuario activo? (y/n)");
		opcionactivo = sc.nextLine();
		
		
		if (opcionactivo == "y") {
			active = true;
		} else if (opcionactivo == "n") {
			active = false;
		}*/
		System.out.println("PERFECTO. Ya tenemos todo.");
		System.out.println("       ");
		System.out.println("       ");
		System.out.println("Resumen del usuario a crear:");
		System.out.println("Nombre:" + name);
		System.out.println("Apellidos:" + lastnames);
		System.out.println("Email:" + email);
		System.out.println("Password:" + password);
		System.out.println("Cumplea√±os:" + birthday);
		System.out.println("ID:" + userId);
		System.out.println("Genero:" + genre);
		System.out.println("Activo?:" + active);


    	Usuario nuevo = new Usuario(userId, email, password, userType);
    	Jugador nuevo2 = new Jugador (userId, email, password, userType, name, lastnames, birthday, genre, active);
    	
    	System.out.println("El usuario que se va modificar es: " + nuevo2.toString());
    	String ruta = "src/files/jugadores/" + userId + ".jsonl";
    	
    	ficheros fichero = new ficheros();
    	fichero.escribirLogin(nuevo);
    	fichero.escribirPersona(nuevo2, ruta);
    	volver();
	}
	
	public void volver () throws IOException {
	ficheros files = new ficheros();
	System.out.println("ACCI”N FINALIZADA...Volviendo al menu");
	controlAdmin controlAdmin1 = new controlAdmin();
	controlAdmin1.setUsuario(user);

	controlAdmin1.menuAdmin();		
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
