package control;

import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Armas;
import model.Usuario;

public class controlModificarEstadisticas {
	
	private String idText;
	private Administrador user;


	void modificarEstadisticas() {
		
		System.out.println("¿De quién desea modificar las estadísticas?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		
		ficheros files = new ficheros();
		Armas armas = files.buscarArmas(idText);
		
		System.out.println(armas.toString());
		
		}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
	

}
