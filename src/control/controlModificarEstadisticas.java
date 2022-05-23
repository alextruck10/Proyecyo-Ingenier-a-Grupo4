package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Armas;
import model.Usuario;

public class controlModificarEstadisticas {
	
	private String idText;
	private Administrador user;


	void modificarEstadisticas() throws IOException {
		
		System.out.println("�De qui�n desea modificar las estad�sticas?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		
		ficheros files = new ficheros();
		Armas armas = files.buscarArmas(idText);
		System.out.println(armas.toString());
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
