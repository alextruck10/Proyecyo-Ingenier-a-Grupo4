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
	private String armas;
	private String fusiles;
	private String subfusiles;
	private String ametralladoras;
	private String escopetas;
	private String francotiradores;
	private String pistolas;
	private String id;
	private Jugador user;
	
	void menuJugador() throws IOException {
	
	Scanner teclado=new Scanner(System.in);
	System.out.println("********************************************************************");

	System.out.println("TE HAS ADENTRADO EN LOS BARRACONES DE TRIBUTESTATS\n");
	System.out.println("Elija una de las opciones 1-5: \n");
	System.out.println("1.Modos de juego\n");
	System.out.println("2.% Victorias/Derrotas\n");
	System.out.println("3.Armas\n");
	System.out.println("4.Ajustes\n");
	System.out.println("5.Cerrar sesión\n");
		


	opcion=teclado.next();
	
	switch (opcion){
	
	case "1": 
		controlModo controlModo1=new controlModo();
		controlModo1.setUser(user);
		controlModo1.modo();
		
		break;
		
	case "2":
		controlVictoriasDerrotas controlVictoriasDerrotas1=new controlVictoriasDerrotas();
		controlVictoriasDerrotas1.setUser(user);
		controlVictoriasDerrotas1.victoriasDerrotas();
		break;
		
	case "3":
		controlArmasJugador armasJugador=new controlArmasJugador();
		armasJugador.setUser(user);
		armasJugador.armasJugador();
		
		break;
	case "4":
		
		System.out.println("1.Cambiar contraseña");
		System.out.println("2.Cambiar nombre");
		String opcionAjustes;
        Scanner teclado4 = new Scanner (System.in);
        opcionAjustes=teclado4.next();
        
        switch (opcionAjustes) {
        case "1":
        	controlAjustes ajustes = new controlAjustes();
    		ajustes.setUser(user);
    		ajustes.cambiarpassword();
        	break;
        case "2":
        	controlAjustes ajustes2 = new controlAjustes();
    		ajustes2.setUser(user);
    		ajustes2.cambiarNombre();
        	break;
        }
		
		break;
	
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
	
	
	 public void setUser(Jugador u) {
	    	this.user = u;
	    	

	    }
	
}
