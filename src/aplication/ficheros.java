package aplication;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import model.Administrador;
import model.Jugador;
import model.Enlace;
import model.Mensaje;
import model.Sesion;
import model.Usuario;

public class ficheros {

	public Usuario IniciarSesion(String email, String password) {
		Usuario persona = buscarUsuario(email);

		if (persona != null && persona.getPassword().equals(password)) {
			return leerUsuario(persona);
		} else {
			return null;
		}
	}
	
	public Usuario buscarUsuario(String email) {
		Gson gson = new Gson();
		Usuario persona = null;
		Usuario personaBuscada = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/files/login.jsonl"));
			String linea;

			Boolean encontrado = false;
			while ((linea = br.readLine()) != null && !encontrado) {
				try {
					persona = gson.fromJson(linea, Usuario.class);
					if (persona.getEmail().equalsIgnoreCase(email)) {
						encontrado = true;
						personaBuscada = persona;
					}
				}catch (Exception e) {}
			}
			br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return personaBuscada;
	}
	
	public Usuario buscarUsuarioId(String dni) {
		Gson gson = new Gson();
		Usuario persona = null;
		Boolean encontrado = false;
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/files/login.jsonl"));
			String linea;
			
			while ((linea = br.readLine()) != null && !encontrado) {
				try {
					persona = gson.fromJson(linea, Usuario.class);
					if (persona.getUserId().equalsIgnoreCase(dni)) {
						encontrado = true;
					}
				}catch (Exception e) {}
			}
			br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		if(encontrado) {
			return persona;
		}else {
			return null;
		}
	}
	
	public Usuario leerUsuario(Usuario persona) {
		switch (persona.getUserType()) { // Seleccionar la ruta
		case "administrador":
			persona = leerAdministrador("src/files/administradores/" + persona.getUserId() + ".jsonl");
			break;
		case "jugador":
			persona = leerJugador("src/files/jugadores/" + persona.getUserId() + ".jsonl");
			break;
		}

		return persona;
	}
	
	public Administrador leerAdministrador(String ruta) {
		Administrador persona = null;
		try {
			Gson gson = new Gson();
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			persona = gson.fromJson(br.readLine(), Administrador.class);
			br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return persona;
	}
	
	public Usuario leerUsuarioLogin(String ruta) {
		Usuario persona = null;
		try {
			Gson gson = new Gson();
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			persona = gson.fromJson(br.readLine(), Usuario.class);
			br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return persona;
	}
	
	public Jugador leerJugador(String ruta) {
		Jugador persona = null;
		try {
			Gson gson = new Gson();
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			persona = gson.fromJson(br.readLine(), Jugador.class);
			br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return persona;
	}
	
	public void escribirLogin(Usuario user) {
		Gson gson = new Gson();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/files/login.jsonl", true));
			bw.newLine();
			bw.append(gson.toJson(user));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public void escribirPersona(Usuario nuevo, String ruta) {
		Gson gson = new Gson();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
			bw.write(gson.toJson(nuevo));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//AQUI IRIA EL ESCRIBIR ENLACE, ESCRIBIR CHAR, LEER CHAT, ELIMINAR USUARIO LOGIN
	

}
