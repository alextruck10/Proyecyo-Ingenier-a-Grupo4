package control;
import java.util.*;
import aplication.ficheros;
import model.Usuario;
public class controlLogin {
	
	private String userNameText;

	private String passwordText;
	
	public void comprobarLogin() {
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
				System.out.println("Es un admin");
				break;
			case "jugador":
				System.out.println("Es un jugador");

				break;
			
			}
		}else {
			System.out.println("ERROR");
		}


	}
}
