package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Armas;
import model.Jugador;



public class controlArmasJugador {
	
private Jugador user;
private String armas;

	void armasJugador() throws IOException {
		
		Scanner teclado3 = new Scanner (System.in);
		
		System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE ARMAS\n");
		System.out.println("Elija una de las opciones 1-6: \n");
		System.out.println("1.Fusiles\n");
		System.out.println("2.Subfusiles\n");
		System.out.println("3.Ametralladoras\n");
		System.out.println("4.Escopetas\n");
		System.out.println("5.Francotiradores\n");
		System.out.println("6.Pistolas\n");
		
		armas=teclado3.next();
		
		switch (armas) {
		case "1":
			System.out.println("Has elegido mostrar las estadï¿½sticas del arma: FUSILES");
			ficheros files = new ficheros();
			Armas armas = files.buscarArmas(user.getUserId());
			System.out.println(armas.fusiles());
			
			break;
		case "2":
			System.out.println("Has elegido mostrar las estadï¿½sticas del arma: Subfusiles");
			ficheros files2 = new ficheros();
			Armas armas2 = files2.buscarArmas(user.getUserId());
			System.out.println(armas2.subfusiles());
			break;
		case "3":
			System.out.println("Has elegido mostrar las estadï¿½sticas del arma: Ametralladoras");
			ficheros files3 = new ficheros();
			Armas armas3 = files3.buscarArmas(user.getUserId());
			System.out.println(armas3.ametralladoras());
			break;
		case "4":
			System.out.println("Has elegido mostrar las estadï¿½sticas del arma: Escopetas");
			ficheros files4 = new ficheros();
			Armas armas4 = files4.buscarArmas(user.getUserId());
			System.out.println(armas4.escopetas());
			break;
		case "5":
			System.out.println("Has elegido mostrar las estadï¿½sticas del arma: Francotiradores");
			ficheros files5 = new ficheros();
			Armas armas5 = files5.buscarArmas(user.getUserId());
			System.out.println(armas5.franco());
			break;
		case "6":
			System.out.println("Has elegido mostrar las estadï¿½sticas del arma: Pistolas");
			ficheros files6 = new ficheros();
			Armas armas6 = files6.buscarArmas(user.getUserId());
			System.out.println(armas6.pistolas());
			break;
		}
		volver();
		
	}
	public void volver () throws IOException {
		ficheros files = new ficheros();
		System.out.println("ACCIÓN FINALIZADA...Volviendo al menu");
		controlJugador controlJugador1 = new controlJugador();
		controlJugador1.setUser(user);

		controlJugador1.menuJugador();
		}
	
	public void setUser(Jugador user) {
		this.user = user;
	}
}
