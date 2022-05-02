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
    	Jugador nuevo2 = new Jugador (userId, email, password, userType, name, lastnames, birthday, genre, active);
    	
    	System.out.println("El usuario que se va a anadir es: " + nuevo2.toString());
    	String ruta = "src/files/jugadores/" + userId + ".jsonl";
    	
    	ficheros fichero = new ficheros();
    	fichero.escribirLogin(nuevo);
    	fichero.escribirPersona(nuevo2, ruta);
		/*try {
			File myObj = new File("src/files/jugadores/" + userId + ".jsonl");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try {
			DataOutputStream fout = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream("src/files/jugadores/" + userId + ".jsonl")));
			fout.writeChars("{\"userId\":\"" + userId + "\",\"email\":\"" + email + "\",\"password\":\"" + password
					+ "\",\"userType\":\"jugador\",\"name\":\"" + name + "\",\"lastnames\":\"" + lastnames
					+ "\",\"birthday\":\"" + birthday + "\",\"genre\":\"" + genre + "\",\"active\":" + active + "}");
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured..");
		}

		String filePath = "src/files/login.jsonl";

		try (FileWriter fw = new FileWriter(filePath, true); BufferedWriter writer = new BufferedWriter(fw);) {
			writer.write("\n");
			writer.write("{\"userId\":\"" + userId + "\",\"email\":\"" + email + "\",\"password\":\"" + password
					+ "\",\"userType\":\"jugador\"}");
		}*/

	}

	public void setUsuario(Administrador user) {
		this.user = user;
	}

}
