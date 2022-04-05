package control;
import java.util.*;
import aplication.ficheros;
import model.Usuario;
public class controlLogin {
	
	private String userNameText;

	private String passwordText;
	
	
	private String opcion;
	private String modosDeJuego;
	private String armas;
	private String fusiles;
	private String subfusiles;
	private String ametralladoras;
	private String escopetas;
	private String francotiradores;
	private String pistolas;
	private String rachasDePuntos;
	
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
				System.out.println("Elija una de las opciones 1-5: \n");
				System.out.println("1.Modos de juego\n");
				System.out.println("2.% Victorias/Derrotas\n");
				System.out.println("3.Armas\n");
				System.out.println("4.Rachas de puntos\n");
				System.out.println("5.Ajustes\n");

				opcion=teclado1.next();
				
				
				switch (opcion)
				{
				case "1": 
					
					Scanner teclado2 = new Scanner (System.in);
					
					System.out.println("TE HAS ADENTRADO EN LOS MODOS DE JUEGO\n");
					System.out.println("Elija una de las opciones 1-6: \n");
					System.out.println("1.Duelo por equipos\n");
					System.out.println("2.Dominio\n");
					System.out.println("3.Baja Confirmada\n");
					System.out.println("4.Juego de Armas\n");
					System.out.println("5.Demolición\n");
					System.out.println("6.Punto Caliente\n");
					
					modosDeJuego=teclado2.next();
					
					switch (modosDeJuego) {
					case "1":
						System.out.println("Duelo por equipos:");
						break;
					case "2":
						System.out.println("Dominio");
						break;
					case "3":
						System.out.println("Baja Confirmada");
						break;
					case "4":
						System.out.println("Juego de Armas");
						break;
					case "5":
						System.out.println("Demolición");
						break;
					case "6":
						System.out.println("Punto Caliente");
						break;
					}
					break;
					
				case "2":
					System.out.println("% Victorias/Derrotas");
					break;
				case "3":
					Scanner teclado3 = new Scanner (System.in);
					
					System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE ARMAS\n");
					System.out.println("Elija una de las opciones 1-6: \n");
					System.out.println("1.Fusiles\n");
					System.out.println("2.Subfusiles\n");
					System.out.println("3.Ametralladoras\n");
					System.out.println("4.Escopetas\n");
					System.out.println("5.Francotiradores\n");
					System.out.println("6.Pistolas\n");
					
					armas=teclado3.next();
					
					switch (armas) {
					case "1":
						Scanner teclado4 = new Scanner (System.in);
						
						System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE FUSILES\n");
						System.out.println("Elija una de las opciones 1-5: \n");
						System.out.println("1.AN-94\n");
						System.out.println("2.M8A1\n");
						System.out.println("3.MTAR\n");
						System.out.println("4.SCAR-H\n");
						System.out.println("5.FALL\n");
						
						
						fusiles=teclado4.next();
						
						switch (fusiles) {
						case "1":
							System.out.println("AN-94");
							break;
						case "2":
							System.out.println("M8A1");
							break;
						case "3":
							System.out.println("MTAR");
							break;
						case "4":
							System.out.println("SCAR-H");
							break;
						case "5":
							System.out.println("FALL");
							break;
						}
						break;
					case "2":
						Scanner teclado5 = new Scanner (System.in);
						
						System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE SUBFUSILES\n");
						System.out.println("Elija una de las opciones 1-5: \n");
						System.out.println("1.MSMC\n");
						System.out.println("2.MP7\n");
						System.out.println("3.VECTOR\n");
						System.out.println("4.PEACEKEEPER\n");
						System.out.println("5.PDW-57\n");
						
						
						subfusiles=teclado5.next();
						
						switch (subfusiles) {
						case "1":
							System.out.println("MSMC");
							break;
						case "2":
							System.out.println("MP7");
							break;
						case "3":
							System.out.println("VECTOR");
							break;
						case "4":
							System.out.println("PEACEKEEPER");
							break;
						case "5":
							System.out.println("PDW-57");
							break;
						}
						break;
					case "3":
						Scanner teclado6 = new Scanner (System.in);
						
						System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE AMETRALLADORAS\n");
						System.out.println("Elija una de las opciones 1-4: \n");
						System.out.println("1.MSAT\n");
						System.out.println("2.MK-48\n");
						System.out.println("3.QBB\n");
						System.out.println("4.HAMMER\n");
						
	
						ametralladoras=teclado6.next();
						
						switch (ametralladoras) {
						case "1":
							System.out.println("MSAT");
							break;
						case "2":
							System.out.println("MK-48");
							break;
						case "3":
							System.out.println("QBB");
							break;
						case "4":
							System.out.println("HAMMER");
							break;
						}
						break;
					case "4":
						Scanner teclado7 = new Scanner (System.in);
						
						System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE ESCOPETAS\n");
						System.out.println("Elija una de las opciones 1-4: \n");
						System.out.println("1.REMMINGTON\n");
						System.out.println("2.KSG\n");
						System.out.println("3.S-12\n");
						System.out.println("4.M-26\n");
						
	
						escopetas=teclado7.next();
						
						switch (escopetas) {
						case "1":
							System.out.println("REMMINGTON");
							break;
						case "2":
							System.out.println("KSG");
							break;
						case "3":
							System.out.println("S-12");
							break;
						case "4":
							System.out.println("M-26");
							break;
						}
						break;
					case "5":
						Scanner teclado8 = new Scanner (System.in);
						
						System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE FRANCOTIRADORES\n");
						System.out.println("Elija una de las opciones 1-4: \n");
						System.out.println("1.DSR-50\n");
						System.out.println("2.BALLISTA\n");
						System.out.println("3.SVU-AS\n");
						System.out.println("4.XPR\n");
						
	
						francotiradores=teclado8.next();
						
						switch (francotiradores) {
						case "1":
							System.out.println("DSR-50");
							break;
						case "2":
							System.out.println("BALLISTA");
							break;
						case "3":
							System.out.println("SVU-AS");
							break;
						case "4":
							System.out.println("XPR");
							break;
						}
						break;
					case "6":
						Scanner teclado9 = new Scanner (System.in);
						
						System.out.println("TE HAS ADENTRADO EN LOS TIPOS DE PISTOLAS\n");
						System.out.println("Elija una de las opciones 1-4: \n");
						System.out.println("1.B23R\n");
						System.out.println("2.EXECUTIONER\n");
						System.out.println("3.TAC\n");
						System.out.println("4.FIVE-SEVEN\n");
						
	
						pistolas=teclado9.next();
						
						switch (pistolas) {
						case "1":
							System.out.println("B23R");
							break;
						case "2":
							System.out.println("EXECUTIONER");
							break;
						case "3":
							System.out.println("TAC");
							break;
						case "4":
							System.out.println("FIVE-SEVEN");
							break;
						}
						break;
					}
					break;
				case "4":
					System.out.println("Rachas de puntos");
					break;
				case "5":
					System.out.println("Ajustes");
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
