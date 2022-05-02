package control;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import aplication.ficheros;
import model.Usuario;
public class controlLogin {
	 
	private String userNameText;

	private String passwordText;
	

	public void comprobarLogin() throws IOException {
		try
		{
		File myObj = new File("recursos/arma.txt"); // Specify the filename
		 Scanner myReader = new Scanner(myObj);
	     while (myReader.hasNextLine()) {
	       String data = myReader.nextLine();
	       System.out.println(data);
	     }
	     myReader.close();
		 } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		userNameText=sc.nextLine();
		System.out.println("Password: ");
		passwordText=sc.nextLine();
		
		ficheros files = new ficheros();
		Usuario usuario = files.IniciarSesion(userNameText, passwordText);
		if(usuario!=null) {
			String rol = usuario.getUserType();
			switch (rol) {
			case "administrador":
				System.out.println("Bienvenido " + usuario.getName());
				controlAdmin controlAdmin1 = new controlAdmin();
				controlAdmin1.setUsuario(files.leerAdministrador("src/files/administradores/" + usuario.getUserId() + ".jsonl"));
				controlAdmin1.menuAdmin();
								
				break;
			case "jugador":
				System.out.println("Bienvenido " + usuario.getName());
				controlJugador controlJugador1 = new controlJugador();
				controlJugador1.setUsuario(files.leerJugador("src/files/jugadores/" + usuario.getUserId() + ".jsonl"));
				controlJugador1.menuJugador();				
								
				break;
				
			}
		}else {
			System.out.println("ERROR");
		}


	}
}
