package control;
import java.util.*;
import aplication.ficheros;
import model.Usuario;
public class controlLogin {
	
	private String userNameText;

	private String passwordText;
	
	
	private String opcion;
	
	public void comprobarLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		userNameText=sc.nextLine();
		System.out.println("Password: ");
		passwordText=sc.nextLine();
		
		ficheros files = new ficheros();
		Usuario usuario = files.IniciarSesion(userNameText, passwordText);
		if(usuario!=null) {
			String rol = usuario.getUserType();
			switch (rol) {
			case "administrador":
				System.out.println("Bienvenido " + usuario.getName());
				controlAdmin controlAdmin1 = new controlAdmin();
				controlAdmin1.setUsuario(files.leerAdministrador("src/files/administradores/" + usuario.getUserId() + ".jsonl"));
				Scanner teclado=new Scanner(System.in);
				System.out.println("********************************************************************");
				System.out.println("TE HAS ADENTRADO EN EL SISTEMA DE TRIBUTESTATS\n");
				System.out.println("Elija una de las opciones 1-5: \n");
				System.out.println("1.Crear usuario\n");
				System.out.println("2.Editar usuario\n");
				System.out.println("3.Eliminar usuario\n");
				System.out.println("4.Revisar y modificar estadísticas\n");
				System.out.println("5.Suspender usuario\n");


				opcion=teclado.next();
				switch (opcion)
				{
				case "1":
					System.out.println("Crear usuario");
					break;
				case "2":
					System.out.println("Editar usuario");
					break;
				case "3":
					System.out.println("Eliminar usuario");
					break;
				case "4":
					System.out.println("Revisar y modificar estadísticas");
					break;
				case "5":
					System.out.println("Suspender usuario");
					break;
				default:
					System.out.println("ERROR");
					break;
				}
				
				break;
			case "jugador":
				System.out.println("Bienvenido " + usuario.getName());
				controlJugador controlJugador1 = new controlJugador();
				controlJugador1.setUsuario(files.leerJugador("src/files/jugadores/" + usuario.getUserId() + ".jsonl"));
				
				Scanner teclado1=new Scanner(System.in);

				System.out.println("********************************************************************");

				System.out.println("TE HAS ADENTRADO EN LOS BARRACONES DE TRIBUTESTATS\n");
				System.out.println("Elija una de las opciones 1-4: \n");
				System.out.println("1.Modos de juego\n");
				System.out.println("2.% Victorias/Derrotas\n");
				System.out.println("3.Armas\n");
				System.out.println("4.Rachas de puntos\n");

				opcion=teclado1.next();
				switch (opcion)
				{
				case "1":
					System.out.println("Modos de juego");
					break;
				case "2":
					System.out.println("% Victorias/Derrotas");
					break;
				case "3":
					System.out.println("Armas");
					break;
				case "4":
					System.out.println("Rachas de puntos");
					break;
				default:
					System.out.println("ERROR");
					break;
				}
				break;
				
			}
		}else {
			System.out.println("ERROR");
		}


	}
}
