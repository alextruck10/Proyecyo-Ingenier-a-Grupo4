package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Jugador;

public class controlAjustes {
	private String idText;
	private Jugador user;
	
	void cambiarpassword() throws IOException {

        System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA CAMBIAR LA PASSWORD DE TU CUENTA");

        //System.out.println(idText);

        Scanner sc = new Scanner(System.in);
        System.out.println("Id del usuario: ");
        idText=sc.nextLine();
        System.out.println(idText);
        System.out.println(user.getName());
        user.editarpassword(idText);
        volver();

    }

void cambiarNombre() throws IOException {

    System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA CAMBIAR EL NOMBRE DE TU CUENTA");

    //System.out.println(idText);

    Scanner sc = new Scanner(System.in);
    System.out.println("Id del usuario: ");
    idText=sc.nextLine();
    System.out.println(idText);
    System.out.println(user.getName());
    user.editarNombre(idText);
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
