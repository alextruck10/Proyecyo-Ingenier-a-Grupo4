package control;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Administrador;
import model.Usuario;

public class controlAdmin {
	private String opcion;
	private Administrador user;

	void menuAdmin() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("********************************************************************");
		System.out.println("TE HAS ADENTRADO EN EL SISTEMA DE TRIBUTESTATS\n");
		System.out.println("Elija una de las opciones 1-5: \n");
		System.out.println("1.Crear usuario\n");
		System.out.println("2.Editar usuario\n");
		System.out.println("3.Eliminar usuario\n");
		System.out.println("4.Revisar y modificar estadísticas\n");
		System.out.println("5.Suspender usuario\n");
		System.out.println("6.Cerrar sesión\n");
		opcion=teclado.next();
		
		switch(opcion) {
		case "1":
			controlAnadirUsuario controlAnadirUsuario1 = new controlAnadirUsuario();
			controlAnadirUsuario1.anadirUsuario();
			break;
		case "2":
			controlModificarUsuario controlModificarUsuario1 = new controlModificarUsuario();
			controlModificarUsuario1.modificarUsuario();
			break;
		case "3":
			controlBorrarUsuario controlBorrarUsuario1 = new controlBorrarUsuario();
			controlBorrarUsuario1.borrarUsuario();
			break;
		case "4":
			controlModificarEstadisticas controlModificarEstadisticas1 = new controlModificarEstadisticas();
			controlModificarEstadisticas1.modificarEstadisticas();
			break;
		case "5":
			controlSuspenderJugador controlSuspenderJugador1 = new controlSuspenderJugador();
			controlSuspenderJugador1.suspender();
			break;
		case "6":
			System.out.println("Hasta pronto"+user.getName());
			controlLogin controlLogin1 = new controlLogin();
			controlLogin1.comprobarLogin();
			break;
		}
	}
	
    public void setUsuario(Administrador u) {
    	user = u;
    	

    }

}
