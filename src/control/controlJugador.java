package control;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Administrador;
import model.Jugador;
import model.Usuario;


public class controlJugador {

	private String opcion;
	private String modosDeJuego;
	private String armas;
	private String fusiles;
	private String subfusiles;
	private String ametralladoras;
	private String escopetas;
	private String francotiradores;
	private String pistolas;
	private String rachasDePuntos;
	
	private Jugador user;
	
	void menuJugador() throws IOException {
		
	Scanner teclado=new Scanner(System.in);
	System.out.println("********************************************************************");

	System.out.println("TE HAS ADENTRADO EN LOS BARRACONES DE TRIBUTESTATS\n");
	System.out.println("Elija una de las opciones 1-5: \n");
	System.out.println("1.Modos de juego\n");
	System.out.println("2.% Victorias/Derrotas\n");
	System.out.println("3.Armas\n");
	System.out.println("4.Rachas de puntos\n");
	System.out.println("5.Ajustes\n");
	System.out.println("6.Cerrar sesi�n\n");
	

	opcion=teclado.next();
	
	switch (opcion){
	
	case "1": 
		
		Scanner teclado2 = new Scanner (System.in);
		
		System.out.println("TE HAS ADENTRADO EN LOS MODOS DE JUEGO\n");
		System.out.println("Elija una de las opciones 1-6: \n");
		System.out.println("1.Duelo por equipos\n");
		System.out.println("2.Dominio\n");
		System.out.println("3.Baja Confirmada\n");
		System.out.println("4.Juego de Armas\n");
		System.out.println("5.Demolici�n\n");
		System.out.println("6.Punto Caliente\n");
		System.out.println("0.Volver\n");
		
		modosDeJuego=teclado2.next();
		
		switch (modosDeJuego) {
		case "0":
			
			break;
		case "1":
			System.out.println("Duelo por equipos:");
			break;
		case "2":
			System.out.println("Dominio");
			break;
		case "3":
			System.out.println("Baja Confirmada");
			break;
		case "4":
			System.out.println("Juego de Armas");
			break;
		case "5":
			System.out.println("Demolici�n");
			break;
		case "6":
			System.out.println("Punto Caliente");
			break;
		}
		break;
		
	case "2":
		System.out.println("% Victorias/Derrotas");
		break;
	case "3":
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
			Scanner teclado4 = new Scanner (System.in);
			
			System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE FUSILES\n");
			System.out.println("Elija una de las opciones 1-5: \n");
			System.out.println("1.AN-94\n");
			System.out.println("2.M8A1\n");
			System.out.println("3.MTAR\n");
			System.out.println("4.SCAR-H\n");
			System.out.println("5.FALL\n");
			
			
			fusiles=teclado4.next();
			
			switch (fusiles) {
			case "1":
				System.out.println("AN-94");
				System.out.println("Pulse la tecla P para volver atr�s");
				Scanner teclado5 = new Scanner (System.in);
				fusiles=teclado5.next();
				if(fusiles.equalsIgnoreCase("P")) {
					
				}
				break;
			case "2":
				System.out.println("M8A1");
				System.out.println("Pulse la tecla P para volver atr�s");
				break;
			case "3":
				System.out.println("MTAR");
				System.out.println("Pulse la tecla P para volver atr�s");
				break;
			case "4":
				System.out.println("SCAR-H");
				System.out.println("Pulse la tecla P para volver atr�s");
				break;
			case "5":
				System.out.println("FALL");
				System.out.println("Pulse la tecla P para volver atr�s");
				break;
			}
			break;
		case "2":
			Scanner teclado5 = new Scanner (System.in);
			
			System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE SUBFUSILES\n");
			System.out.println("Elija una de las opciones 1-5: \n");
			System.out.println("1.MSMC\n");
			System.out.println("2.MP7\n");
			System.out.println("3.VECTOR\n");
			System.out.println("4.PEACEKEEPER\n");
			System.out.println("5.PDW-57\n");
			
			
			subfusiles=teclado5.next();
			
			switch (subfusiles) {
			case "1":
				System.out.println("MSMC");
				break;
			case "2":
				System.out.println("MP7");
				break;
			case "3":
				System.out.println("VECTOR");
				break;
			case "4":
				System.out.println("PEACEKEEPER");
				break;
			case "5":
				System.out.println("PDW-57");
				break;
			}
			break;
		case "3":
			Scanner teclado6 = new Scanner (System.in);
			
			System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE AMETRALLADORAS\n");
			System.out.println("Elija una de las opciones 1-4: \n");
			System.out.println("1.MSAT\n");
			System.out.println("2.MK-48\n");
			System.out.println("3.QBB\n");
			System.out.println("4.HAMMER\n");
			

			ametralladoras=teclado6.next();
			
			switch (ametralladoras) {
			case "1":
				System.out.println("MSAT");
				break;
			case "2":
				System.out.println("MK-48");
				break;
			case "3":
				System.out.println("QBB");
				break;
			case "4":
				System.out.println("HAMMER");
				break;
			}
			break;
		case "4":
			Scanner teclado7 = new Scanner (System.in);
			
			System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE ESCOPETAS\n");
			System.out.println("Elija una de las opciones 1-4: \n");
			System.out.println("1.REMMINGTON\n");
			System.out.println("2.KSG\n");
			System.out.println("3.S-12\n");
			System.out.println("4.M-26\n");
			

			escopetas=teclado7.next();
			
			switch (escopetas) {
			case "1":
				System.out.println("REMMINGTON");
				break;
			case "2":
				System.out.println("KSG");
				break;
			case "3":
				System.out.println("S-12");
				break;
			case "4":
				System.out.println("M-26");
				break;
			}
			break;
		case "5":
			Scanner teclado8 = new Scanner (System.in);
			
			System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE FRANCOTIRADORES\n");
			System.out.println("Elija una de las opciones 1-4: \n");
			System.out.println("1.DSR-50\n");
			System.out.println("2.BALLISTA\n");
			System.out.println("3.SVU-AS\n");
			System.out.println("4.XPR\n");
			

			francotiradores=teclado8.next();
			
			switch (francotiradores) {
			case "1":
				System.out.println("DSR-50");
				break;
			case "2":
				System.out.println("BALLISTA");
				break;
			case "3":
				System.out.println("SVU-AS");
				break;
			case "4":
				System.out.println("XPR");
				break;
			}
			break;
		case "6":
			Scanner teclado9 = new Scanner (System.in);
			
			System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE PISTOLAS\n");
			System.out.println("Elija una de las opciones 1-4: \n");
			System.out.println("1.B23R\n");
			System.out.println("2.EXECUTIONER\n");
			System.out.println("3.TAC\n");
			System.out.println("4.FIVE-SEVEN\n");
			

			pistolas=teclado9.next();
			
			switch (pistolas) {
			case "1":
				System.out.println("B23R");
				break;
			case "2":
				System.out.println("EXECUTIONER");
				break;
			case "3":
				System.out.println("TAC");
				break;
			case "4":
				System.out.println("FIVE-SEVEN");
				break;
			}
			break;
		}
		break;
	case "4":
		System.out.println("Rachas de puntos");
		break;
	case "5":
		System.out.println("Ajustes");
	case "6":
		System.out.println("Hasta pronto"+user.getName());
		controlLogin controlLogin1 = new controlLogin();
		controlLogin1.comprobarLogin();
		break;
	default:
		System.out.println("ERROR");
		break;
	}
	
	
	}
	
	 public void setUsuario(Jugador u) {
	    	user = u;
	    	

	    }
	
}
