package control;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;
import model.Administrador;
import model.Jugador;
import model.Usuario;
import model.Armas;
import model.Modos;
import aplication.ficheros;


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
	
	private Jugador user;
	
	void menuJugador() throws IOException {
	String usuario=user.getUserId();	
	Scanner teclado=new Scanner(System.in);
	System.out.println("********************************************************************");

	System.out.println("TE HAS ADENTRADO EN LOS BARRACONES DE TRIBUTESTATS\n");
	System.out.println("Elija una de las opciones 1-5: \n");
	System.out.println("1.Modos de juego\n");
	System.out.println("2.% Victorias/Derrotas\n");
	System.out.println("3.Armas\n");
	System.out.println("4.Ajustes\n");
	System.out.println("5.Cerrar sesi�n\n");
	

	opcion=teclado.next();
	
	switch (opcion){
	
	case "1": 
		
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
			Modos modos = files8.buscarModos(usuario);
			System.out.println(modos.dueloporequiposwin());
			System.out.println(modos.dueloporequipostotal());
			break;
		case "2":
			ficheros files9 = new ficheros();
			Modos modos2 = files9.buscarModos(usuario);
			System.out.println(modos2.dominiowin());
			System.out.println(modos2.dominiototal());
			break;
		case "3":
			ficheros files10 = new ficheros();
			Modos modos3 = files10.buscarModos(usuario);
			System.out.println(modos3.calientewin());
			System.out.println(modos3.calientetotal());
			break;
		}
		break;
		
	case "2":
		System.out.println("% Victorias/Derrotas");
		ficheros files10 = new ficheros();
		Modos modos3 = files10.buscarModos(usuario);
		System.out.println((double)modos3.totalwins()*100/(double)modos3.totalpartidas()+"%");
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
			System.out.println("Has elegido mostrar las estadísticas del arma: FUSILES");
			ficheros files = new ficheros();
			Armas armas = files.buscarArmas(usuario);
			System.out.println(armas.fusiles());
			break;
		case "2":
			System.out.println("Has elegido mostrar las estadísticas del arma: Subfusiles");
			ficheros files2 = new ficheros();
			Armas armas2 = files2.buscarArmas(usuario);
			System.out.println(armas2.subfusiles());
			break;
		case "3":
			System.out.println("Has elegido mostrar las estadísticas del arma: Ametralladoras");
			ficheros files3 = new ficheros();
			Armas armas3 = files3.buscarArmas(usuario);
			System.out.println(armas3.ametralladoras());
			break;
		case "4":
			System.out.println("Has elegido mostrar las estadísticas del arma: Escopetas");
			ficheros files4 = new ficheros();
			Armas armas4 = files4.buscarArmas(usuario);
			System.out.println(armas4.escopetas());
			break;
		case "5":
			System.out.println("Has elegido mostrar las estadísticas del arma: Francotiradores");
			ficheros files5 = new ficheros();
			Armas armas5 = files5.buscarArmas(usuario);
			System.out.println(armas5.franco());
			break;
		case "6":
			System.out.println("Has elegido mostrar las estadísticas del arma: Pistolas");
			ficheros files6 = new ficheros();
			Armas armas6 = files6.buscarArmas(usuario);
			System.out.println(armas6.pistolas());
			break;
		}
		break;
	case "4":
		System.out.println("Ajustes");
	case "5":
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
