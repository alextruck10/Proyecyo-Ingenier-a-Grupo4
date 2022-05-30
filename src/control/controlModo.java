package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Modos;
import model.Jugador;

public class controlModo {
	
private Jugador user;
private String modosDeJuego;

	void modo() throws IOException {
		

		Scanner teclado2 = new Scanner (System.in);
		
		System.out.println("TE HAS ADENTRADO EN LOS MODOS DE JUEGO\n");
		System.out.println("Elija una de las opciones 1-6: \n");
		System.out.println("1.Duelo por equipos\n");
		System.out.println("2.Dominio\n");
		System.out.println("3.Punto Caliente\n");
		System.out.println("0.Volver\n");
		
		modosDeJuego=teclado2.next();
		
		switch (modosDeJuego) {
		case "0":
			
			break;
		case "1":
			ficheros files8 = new ficheros();
			Modos modos = files8.buscarModos(user.getUserId());
			System.out.println(modos.dueloporequiposwin());
			System.out.println(modos.dueloporequipostotal());
			break;
		case "2":
			ficheros files9 = new ficheros();
			Modos modos2 = files9.buscarModos(user.getUserId());
			System.out.println(modos2.dominiowin());
			System.out.println(modos2.dominiototal());
			break;
		case "3":
			ficheros files10 = new ficheros();
			Modos modos3 = files10.buscarModos(user.getUserId());
			System.out.println(modos3.calientewin());
			System.out.println(modos3.calientetotal());
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
