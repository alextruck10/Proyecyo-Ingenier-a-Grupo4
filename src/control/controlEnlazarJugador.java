package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Enlace;
import model.Usuario;

public class controlEnlazarJugador {
	private Administrador user;
	public static String idText="";
	public static String idText2="";
	
	void enlazarJugador() throws IOException {
		ficheros files = new ficheros();
		System.out.println("¿Qué jugadores desea enlazar?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del primer jugador: ");
		idText=sc.nextLine();
		Usuario jugador=files.buscarUsuarioId(idText);
		
		if(jugador==null) {
			System.out.println("El ID introducido no es correcto.");
			enlazarJugador();
		}
		System.out.println("Id del segundo jugador: ");
		idText2=sc.nextLine();
		Usuario jugador2=files.buscarUsuarioId(idText2);
		if(jugador2==null) {
			System.out.println("El ID introducido no es correcto.");
			enlazarJugador();
		}
	
		
		
		
		
		

		Enlace enlace = new Enlace(idText, idText2);
		
		//files.escribirEnlace(enlace);
		if(jugador !=null) {
			jugador=files.leerUsuario(jugador);
			
			if(jugador2!=null) {
				jugador2=files.leerUsuario(jugador2);
				

				files.escribirEnlace(enlace);
			}/*else {
				System.out.println("El ID introducido no es correcto.");
				
				enlazarJugador();
			}
		}else {
			System.out.println("El ID introducido no es correcto.");
			System.out.println("xdd");
			enlazarJugador();*/

		}
		
		volver();
		
	}
	public void volver () throws IOException {
	ficheros files = new ficheros();
	System.out.println("ACCIÓN FINALIZADA...Volviendo al menu");
	controlAdmin controlAdmin2 = new controlAdmin();
	controlAdmin2.setUsuario(user);

	controlAdmin2.menuAdmin();
	}
	
	public void setUser(Administrador user) {
		this.user = user;
		
		
	}
	
}
