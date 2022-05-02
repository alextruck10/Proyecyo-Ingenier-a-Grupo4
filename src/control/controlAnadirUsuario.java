package control;
import java.io.IOException;
import model.Administrador;
import java.util.Scanner;

public class controlAnadirUsuario {

	controlAnadirAdmin control = new controlAnadirAdmin(); 
	controlAnadirJugador control2 = new controlAnadirJugador();
	private Administrador user; 
	void anadirUsuario() throws IOException {
		String opcion;
		
		do
		{
			System.out.println("¿Que tipo de usuario quieres añadir?");
			System.out.println("Opciones disponibles: (1) Jugador || (2) Administrador");
			Scanner teclado = new Scanner(System.in);
			opcion=teclado.nextLine();
		
		}
		while (opcion=="1" && opcion=="2");
		
		switch (opcion)
		{
		case "1":
			control2.AnadirJugador();
			break;
		case "2":
			System.out.println("Elegiste crear Administrador");
			control.AnadirAdmin();
			
		}
	

	}
	public void setUser(Administrador user) {
        this.user = user;
    }
	
}
