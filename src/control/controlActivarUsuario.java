	package control;
	import java.util.Scanner;

	import aplication.ficheros;
	import model.Administrador;
	//import model.Usuario;

	public class controlActivarUsuario {

		private String idText;
		private Administrador user;
		

		
		void activarJugador() {
			
			System.out.println("TE HAS ADENTRADO EN EL SISTEMA PARA REACTIVAR UN JUGADOR");		
			
			//System.out.println(idText);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Id del usuario: ");
			idText=sc.nextLine();
			System.out.println(idText);
			System.out.println(user.getName());
			user.activarUser(idText);	
			
			/*System.out.println("�A qui�n desea suspender/activar?");
			Scanner sc = new Scanner(System.in);
			System.out.println("Id del usuario: ");
			idText=sc.nextLine();
			System.out.println(idText);
			
			user.suspenderJugador(idText);
			ficheros files = new ficheros();
			Usuario persona = files.buscarUsuarioId(idText);

			if (persona != null) {

				persona = files.leerUsuario(persona);
				
				switch (persona.getUserType()) {
				
				case "jugador":

					controlSuspenderJugador controlSuspenderJugador1 = new controlSuspenderJugador();
					controlSuspenderJugador1.setUser(user);
					controlSuspenderJugador1.suspender();
					
					break;
				}
			}*/
		}
		
		public void setUser(Administrador user) {
			this.user = user;
		}
	}


