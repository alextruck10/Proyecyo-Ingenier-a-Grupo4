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
	private Boolean entra=true;
	private final Properties properties = new Properties();
	
	private String password;
 
	
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
			//sendEmail();
			switch (rol) {
			case "administrador":
				if(entra.equals(usuario.active)) {
					System.out.println("Bienvenido " + usuario.getName());
				controlAdmin controlAdmin1 = new controlAdmin();
				controlAdmin1.setUsuario(files.leerAdministrador("src/files/administradores/" + usuario.getUserId() + ".jsonl"));
				controlAdmin1.menuAdmin();
				
				}else {
					System.out.println("SU CUENTA SE ENCUENTRA EN ESTE MOMENTO SUSPENDIDA");
					return;
				}
				
								
				break;
			case "jugador":
				if(entra.equals(usuario.active)) {
				System.out.println("Bienvenido " + usuario.getName());
				controlJugador controlJugador1 = new controlJugador();
				controlJugador1.setUser(files.leerJugador("src/files/jugadores/" + usuario.getUserId() + ".jsonl"));
				controlJugador1.menuJugador();		
				
				}else {
					System.out.println("SU CUENTA SE ENCUENTRA EN ESTE MOMENTO SUSPENDIDA");
					return;
				}		
				break;
				
			}
		}else {
			System.out.println("ERROR");
			comprobarLogin();
		}


	}
	
}
