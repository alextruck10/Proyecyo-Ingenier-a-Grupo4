package control;

import java.util.Scanner;

import aplication.ficheros;

import model.Administrador;


public class controlBorrarUsuario {

	private String idText;
	private Administrador user;
	
	void borrarUser() {
		System.out.println("¿Qué usuario desea eliminar?");
		//System.out.println(user.toString());
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		System.out.println(idText);
		
		user.borrarUsuario(idText);
		//volverAdmin();
    	
    	
    	
		
	}
	
	void volverAdmin() {
        	
        	controlAdmin controlAdmin = new controlAdmin();
			controlAdmin.setUsuario(user);
		
		}
    	
	
	public void setUser(Administrador user) {
		this.user=user;
	}
	
	
	
	
}
