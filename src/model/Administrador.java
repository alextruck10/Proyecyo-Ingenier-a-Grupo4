package model;

import java.util.Scanner;

import aplication.ficheros;


public class Administrador extends Usuario {
	
	

	public Administrador(String userId, String email, String password, String userType, String name, String lastnames,
			String birthdate, String genre, Boolean active) {
		super(userId, email, password, userType, name, lastnames, birthdate, genre, active);
	}

	public void borrarUsuario(String dni) {
		
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(dni);
		
		if(persona!=null) {
			files.eliminarUsuarioLogin(persona.getEmail());
			//files.eliminarUsuarioArmas(persona.getUserId());
			//files.eliminarUsuarioModos(persona.getUserId());

			persona = files.leerUsuario(persona);
			persona.setActive(false);
			
			switch (persona.getUserType()) {
				case "administrador":
					files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
					break;
				case "jugador":
					files.escribirPersona(persona, "src/files/jugadores/" + persona.getUserId() + ".jsonl");
					break;
				
			}
			System.out.println("usuario borrado");
		}else {
			System.out.println("no hemos encontrado el usuario");
		}
		
	}
	
public void suspenderUser(String dni) {
		
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(dni);

		if(persona!=null) {
			

			persona = files.leerUsuario(persona);
			
			persona.setActive(false);

			
			
			switch (persona.getUserType()) {
				case "administrador":
					files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
					break;
				case "jugador":
					files.escribirPersona(persona, "src/files/jugadores/" + persona.getUserId() + ".jsonl");
					break;
				
			}
			System.out.println("Usuario suspendido");
		}else {
			System.out.println("no hemos encontrado el usuario");
		}
		
	}

public void activarUser(String dni) {
	
	ficheros files = new ficheros();
	Usuario persona = files.buscarUsuarioId(dni);

	
	if(persona!=null) {
		

		persona = files.leerUsuario(persona);
		/*System.out.println("�Desea activar un usuario (1) o suspenderlo (2)?");
		Scanner sc = new Scanner(System.in);
		String opcionactivo = sc.nextLine();
		if (opcionactivo == "1") {
			persona.setActive(true);
		} else if (opcionactivo == "2") {
			persona.setActive(false);
		}*/
		persona.setActive(true);

		
		
		switch (persona.getUserType()) {
			case "administrador":
				files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
				break;
			case "jugador":
				files.escribirPersona(persona, "src/files/jugadores/" + persona.getUserId() + ".jsonl");
				break;
			
		}
		System.out.println("Usuario reactivado");
	}else {
		System.out.println("no hemos encontrado el usuario");
	}
	
}

	@Override
	public String toString() {
		return "Administrador [getUserId()=" + getUserId() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getUserType()=" + getUserType() + ", getName()=" + getName() + ", getLastnames()="
				+ getLastnames() + ", getBirthday()=" + getBirthday() + ", getGenre()=" + getGenre() + ", getActive()="
				+ getActive() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	public void modificarUsuario (String dni) {
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(dni);
		System.out.println("modificar");
		if(persona!=null) {
			
			persona = files.leerUsuario(persona);
			
			switch (persona.getUserType()) {
				case "administrador":
					//files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
					System.out.println("Administrador");
					System.out.println("USUARIO ESCOGIDO: " + persona.getName());
					
					break;
				case "jugador":
					//files.escribirPersona(persona, "src/files/jugadores/" + persona.getUserId() + ".jsonl");
					System.out.println("Jugador");
					System.out.println("USUARIO ESCOGIDO: " + persona.getName());
					break;
				
										
			}
						
		}else {
			System.out.println("No hemos encontrado el usuario");
		}
		}

	
		}
		
		
	


	/*public void confirmarModificarUsuario(String dni, String id,String mail,
			String password, String type, String name, String lastname, String day,
			String gen, Boolean act) {
		ficheros files = new ficheros();
		Usuario persona = files.buscarUsuarioId(dni);
		System.out.println("confirmar");
		System.out.println(dni);

		if(persona!=null) {
			files.eliminarUsuarioLogin(persona.getEmail());

			persona = files.leerUsuario(persona);
			
			switch (persona.getUserType()) {
				case "administrador":
					files.escribirPersona(persona, "src/files/administradores/" + persona.getUserId() + ".jsonl");
					System.out.println("a");
					System.out.println("USUARIO ESCOGIDO: " + persona.getName());
					

					break;
				case "entrenador":
					files.escribirPersona(persona, "src/files/entrenadores/" + persona.getUserId() + ".jsonl");
					System.out.println("e");
					System.out.println("USUARIO ESCOGIDO: " + persona.getName());
					
					break;
				case "deportista":
					files.escribirPersona(persona, "src/files/deportistas/" + persona.getUserId() + ".jsonl");
					System.out.println("USUARIO ESCOGIDO: " + persona.getName());
					
					break;
							
			}
						
		}else {
			System.out.println("No hemos encontrado el usuario");
		}

	}*/
	



