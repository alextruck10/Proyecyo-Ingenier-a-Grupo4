package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;

import model.Administrador;


public class controlBorrarUsuario {

	private String idText;
	private Administrador user;
	
	void borrarUser() throws IOException {
		System.out.println("¿Qué usuario desea eliminar?");
		//System.out.println(user.toString());
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		System.out.println(idText);
		user.borrarUsuario(idText);
		
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
		this.user=user;
	}
	
	
	
	
}
