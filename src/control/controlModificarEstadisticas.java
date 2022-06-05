package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Armas;
import model.Modos;
import model.Usuario;

public class controlModificarEstadisticas {
	
	private String idText;
	private Administrador user;
	private Armas arma;
	private Modos modo;
	private String userId=idText;

	private int totalKills;
	private int fusiles;
	private int subfusiles;
	private int ametralladoras;
	private int escopetas;
	private int franco;
	private int pistolas;
	
	private int mododuelowins;
	private int mododuelototal;
	private int mododominiowins;
	private int mododominiototal;
	private int modocalientewins;
	private int modocalientetotal;
	
	private int mod;

	

	void modificarEstadisticas() throws IOException {
		
		System.out.println("¿De quién desea modificar las estadísticas?");
		
		ficheros files = new ficheros();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		
		System.out.println("¿Desea modificar las estadísticas de las armas(1) o de los modos(2)?");
		mod=sc.nextInt();
		if(mod==1) {
			System.out.println("Modificar armas");
			Armas armas = files.buscarArmas(idText);
			armas.borrarArmas(idText);
			userId=idText;
			System.out.println("Fusiles:");
			fusiles = sc.nextInt();
			System.out.println("Subfusiles: ");
			subfusiles = sc.nextInt();
			
			System.out.println("Ametralladoras: ");
			ametralladoras = sc.nextInt();
			System.out.println("Escopetas: ");
			escopetas = sc.nextInt();
			System.out.println("Francotiradores: ");
			franco = sc.nextInt();
			System.out.println("Pistolas: ");
			pistolas = sc.nextInt();
			
			totalKills= fusiles+subfusiles+ametralladoras+escopetas+franco+pistolas;
			
			
			
			
			Armas armaNueva= new Armas(userId, totalKills, fusiles, subfusiles, ametralladoras, escopetas, franco, pistolas);
			System.out.println("Las estadisticas agregadas pertenecen al jugador: " + userId);
	    	
			files.escribirArmas(armaNueva);
			System.out.println(armaNueva.toString());
			volver();
		}else if(mod==2) {
			System.out.println("Modificar modos");
			Modos modos = files.buscarModos(idText);
			modos.borrarModos(idText);
			
			userId=idText;
			System.out.println("Duelo por equipos ganados:");
			mododuelowins = sc.nextInt();
			System.out.println("Duelo por equipos perdidos: ");
			mododuelototal = mododuelowins+sc.nextInt();
			
			System.out.println("Dominios ganados:");
			mododominiowins = sc.nextInt();
			System.out.println("Dominios perdidos: ");
			mododominiototal = mododominiowins+sc.nextInt();
			System.out.println("Puntos calientes ganados:");
			modocalientewins = sc.nextInt();
			System.out.println("Puntos calientes perdidos: ");
			modocalientetotal = modocalientewins+sc.nextInt();
			
			
			
			
			
			Modos modoNuevo= new Modos(userId, mododuelowins, mododuelototal, mododominiowins, mododominiototal, modocalientewins, modocalientetotal);
			System.out.println("Las estadisticas agregadas pertenecen al jugador: " + userId);
	    	
			files.escribirModos(modoNuevo);
			System.out.println(modoNuevo.toString());
			volver();
		}
		
			
	}
	
	
	public void volver () throws IOException {
		ficheros files = new ficheros();
	System.out.println("ACCIÓN FINALIZADA...Volviendo al menu");
	controlAdmin controlAdmin1 = new controlAdmin();
	controlAdmin1.setUsuario(user);

	controlAdmin1.menuAdmin();		
	}
	public void setUser(Administrador user) {
		this.user = user;
	}
	public void setArma(Armas arma) {
		this.arma=arma;
	}
	public void serModo(Modos modo) {
		this.modo=modo;
	}
	

}
