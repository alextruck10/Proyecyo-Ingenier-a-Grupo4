package model;

import java.util.Scanner;

import aplication.ficheros;

public class Jugador extends Usuario{

	
	
	public Jugador(String userId, String email, String password, String userType, String name, String lastnames,
			String birthdate, String genre, Boolean active) {
        super(userId, email, password, userType, name, lastnames, birthdate, genre, active);
        
        
    }
public void editarpassword(String dni) {
		
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(dni);

		if(persona!=null) {
			
			String password2 = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("Indica la nueva password:");
			password2 = sc.nextLine();
			persona = files.leerUsuario(persona);
			persona.setPassword(password2);

			switch (persona.getUserType()) {
				case "administrador":
					files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
					break;
				case "jugador":
					files.escribirPersona(persona, "src/files/jugadores/" + persona.getUserId() + ".jsonl");
					break;
				
			}
			System.out.println("Contraseña cambiada");
		}else {
			System.out.println("Error. No se ha encontrado el usuario.");
		}
		
	}
	
public void editarNombre(String dni) {
	
	ficheros files = new ficheros();
	Usuario persona = files.buscarUsuarioId(dni);

	if(persona!=null) {
		
		String nombre2 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el nuevo nombre de usuario:");
		nombre2 = sc.nextLine();
		persona = files.leerUsuario(persona);
		persona.setName(nombre2);

		switch (persona.getUserType()) {
			case "administrador":
				files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
				break;
			case "jugador":
				files.escribirPersona(persona, "src/files/jugadores/" + persona.getUserId() + ".jsonl");
				break;
			
		}
		System.out.println("Nombre de usuario cambiado");
	}else {
		System.out.println("Error. No se ha encontrado el usuario.");
	}
	
}
	
	

}