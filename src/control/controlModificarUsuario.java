package control;

import java.util.Scanner;

import aplication.ficheros;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Administrador;
import model.Usuario;

public class controlModificarUsuario {
	
	private String idText;
	private Administrador user;

	void modificarUsuario() {
		System.out.println("¿Qué usuario desea modificar?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		System.out.println(idText);
		
		user.modificarUsuario(idText);
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(idText);

		if (persona != null) {

			persona = files.leerUsuario(persona);
			switch (persona.getUserType()) {
			case "administrador":

				controlModificarAdmin controlModificarAdmin = new controlModificarAdmin();
				controlModificarAdmin.setUser(user);
				controlModificarAdmin.modificarAdministrador();
				break;
			case "jugador":

				controlModificarJugador controlModificarJugador = new controlModificarJugador();
				controlModificarJugador.setUser(user);
				controlModificarJugador.modificarJugador();
					
				break;
			}
		}
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
