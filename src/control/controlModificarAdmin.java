package control;

import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Usuario;

public class controlModificarAdmin extends controlModificarUsuario{
	private Administrador user;
	private int opcion;
	void modificarAdministrador() {
		System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA MODIFICAR UN ADMINISTRADOR");		
		user.borrarUsuario(idText);
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija una de las opciones 1-9: \n");
		System.out.println("1.userId\n");
		System.out.println("2.email\n");
		System.out.println("3.password\n");
		System.out.println("4.userType\n");
		System.out.println("5.name\n");
		System.out.println("6.lastnames\n");
		System.out.println("7.birthday\n");
		System.out.println("8.genre\n");
		System.out.println("9.active\n");
		
		opcion=sc.nextInt();
		
		switch(opcion) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		}
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
