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
				System.out.println("Es un admin");
				controlAdmin controlAdmin1 = new controlAdmin();
				controlAdmin1.setUsuario(files.leerAdministrador("src/files/administradores/" + usuario.getUserId() + ".jsonl"));
				System.out.println();
				break;
			case "jugador":
				System.out.println("Bienvenido, jugador.");
				Scanner teclado=new Scanner(System.in);
				
				System.out.println("Elige una opcion:");
				opcion=teclado.next();
				switch (opcion)
				{
				case "1":
					System.out.println("Has elegido la opcion 1");
					break;
				case "2":
					System.out.println("Has elegido la opcion 2");
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
