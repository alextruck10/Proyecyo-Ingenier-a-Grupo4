package control;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import aplication.ficheros;
import model.Administrador;
import model.Armas;
import model.Modos;
import model.Jugador;
import model.Usuario;

public class controlAnadirJugador {
	private String userId;
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
	private Administrador user;
	
	
	private int totalKills=0;
	private int fusiles=0;
	private int subfusiles=0;
	private int ametralladoras=0;
	private int escopetas=0;
	private int franco=0;
	private int pistolas=0;
	
	private int mododuelowins=0;
	private int mododuelototal=0;
	private int mododominiowins=0;
	private int mododominiototal=0;
	private int modocalientewins=0;
	private int modocalientetotal=0;
	
	


	public void AnadirJugador() throws IOException {
		System.out.println("Has elegido CREAR UN JUGADOR.");
		System.out.println("1.Email:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		email = sc.nextLine();
		System.out.println("Password: ");
		password = sc.nextLine();
		System.out.println("UserID: ");
		userId = sc.nextLine();
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("LastName: ");
		lastnames = sc.nextLine();
		System.out.println("Birthday DD-MM-AAAA: ");
		birthday = sc.nextLine();
		System.out.println("Genre: (hombre/mujer)");
		genre = sc.nextLine();
		System.out.println("Usuario activo? (y/n)");
		opcionactivo = sc.nextLine();
		
		
		if (opcionactivo == "y") {
			active = true;
		} else if (opcionactivo == "n") {
			active = false;
		}
		System.out.println("PERFECTO. Ya tenemos todo.");
		System.out.println("       ");
		System.out.println("       ");
		System.out.println("Resumen del usuario a crear:");
		System.out.println("Nombre:" + name);
		System.out.println("Apellidos:" + lastnames);
		System.out.println("Email:" + email);
		System.out.println("Password:" + password);
		System.out.println("Cumpleaños:" + birthday);
		System.out.println("ID:" + userId);
		System.out.println("Genero:" + genre);
		System.out.println("Activo?:" + active);


    	Usuario nuevo = new Usuario(userId, email, password, userType);
    	Armas nuevas = new Armas(userId, totalKills, fusiles, subfusiles, ametralladoras, escopetas, franco, pistolas);
    	Modos nuevos = new Modos(userId, mododuelowins, mododuelototal, mododominiowins, mododominiototal, modocalientewins, modocalientetotal);
    	Jugador nuevo2 = new Jugador (userId, email, password, userType, name, lastnames, birthday, genre, active);
    	
    	
    	System.out.println("El usuario que se va a anadir es: " + nuevo2.toString());
    	String ruta = "src/files/jugadores/" + userId + ".jsonl";
    	
    	ficheros fichero = new ficheros();
    	fichero.escribirLogin(nuevo);
    	fichero.escribirArmas(nuevas);
    	fichero.escribirModos(nuevos);
    	fichero.escribirPersona(nuevo2, ruta);
    	volver();
		
	}
	public void volver () throws IOException {
		ficheros files = new ficheros();
	System.out.println("ACCIÓN FINALIZADA...Volviendo al menú");
	controlAdmin controlAdmin2 = new controlAdmin();
	controlAdmin2.menuAdmin();
	}

	public void setUsuario(Administrador user) {
		this.user = user;
	}

}
