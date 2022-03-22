package control;

import aplication.ficheros;
import model.Usuario;
public class controlLogin {
	
	private String userNameText;

	private String passwordText;
	
	void comprobarLogin() {
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
