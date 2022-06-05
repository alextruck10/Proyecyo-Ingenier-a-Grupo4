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
import model.Armas;
import model.Jugador;
import model.Enlace;
import model.Mensaje;
import model.Modos;
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
	
	public Armas leerArmas(String ruta) {
		Armas arma = null;
		try {
			Gson gson = new Gson();
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			arma = gson.fromJson(br.readLine(), Armas.class);
			br.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return arma;
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
	public void escribirArmas(Armas arma) {
		
		Gson gson = new Gson();
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/files/armas.jsonl", true));
			bw.newLine();
			bw.append(gson.toJson(arma));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escribirModos(Modos modo) {
		
		Gson gson = new Gson();
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/files/modos.jsonl", true));
			bw.newLine();
			bw.append(gson.toJson(modo));
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
	
	
	//AQUI IRIA EL ESCRIBIR ENLACE, ESCRIBIR CHAT, LEER CHAT, ELIMINAR USUARIO LOGIN
	
		public void escribirEnlace(Enlace en) {
			Gson gson = new Gson();
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/files/enlaces.jsonl", true));
				bw.newLine();
				bw.append(gson.toJson(en));
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void escribirChat(Mensaje mensaje, String ruta) {
			Gson gson = new Gson();
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
				bw.newLine();
				bw.append(gson.toJson(mensaje));
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public ArrayList<Mensaje> leerChat(String ruta) {
			ArrayList<Mensaje> lista = new ArrayList<Mensaje>();
			File file = new File(ruta);
			if (file.exists()) {
				try {
					Gson gson = new Gson();
					BufferedReader br = new BufferedReader(new FileReader(ruta));
					String linea;
					Mensaje men;
					while ((linea = br.readLine()) != null) {
						if(!linea.equals("")){
							men = gson.fromJson(linea, Mensaje.class);
							lista.add(men);
						}

					}
					br.close();

				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}

			return lista;
		}
		
		public boolean eliminarUsuarioLogin(String email) {
			Gson gson = new Gson();
			Usuario persona = null;
			File ficheroViejo = new File("src/files/login.jsonl");
			File ficheroNuevo = new File("src/files/login2.jsonl");
			try {
				BufferedReader br = new BufferedReader(new FileReader(ficheroViejo));
				BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroNuevo, true));

				String linea;
				while ((linea = br.readLine()) != null) {
					persona = gson.fromJson(linea, Usuario.class);
					if (!persona.getEmail().equalsIgnoreCase(email)) {
						bw.append(gson.toJson(persona));
						bw.flush();
						bw.newLine();
					}
					
				}
				br.close();
				bw.close();
				System.out.println("fichero viejo duplicado");
				if (ficheroViejo.delete()) { // Aqui� deberia eliminar el original
					System.out.println("fichero viejo eliminado");
					File renombrar = new File("src/files/login.jsonl");
					if (ficheroNuevo.renameTo(renombrar)) { // Aqui deberia renombrarlo al nombre original
						System.out.println("fichero renombrado");
						
						return true;
					} else {
						System.out.println("error al renombrar fichero");
					}
				} else {
					System.out.println("error al eliminar fichero");
				}
			} catch (IOException e) {
				System.out.println(e);
			}
			return false;
		}
		
		public boolean eliminarUsuarioArmas(String dni) {
			Gson gson = new Gson();
			Armas arma = null;
			File ficheroViejo = new File("src/files/armas.jsonl");
			File ficheroNuevo = new File("src/files/armas2.jsonl");
			try {
				BufferedReader br = new BufferedReader(new FileReader(ficheroViejo));
				BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroNuevo, true));

				String linea;
				while ((linea = br.readLine()) != null) {
					arma = gson.fromJson(linea, Armas.class);
					if (!arma.getUserId().equalsIgnoreCase(dni)) {
						bw.append(gson.toJson(arma));
						bw.flush();
						bw.newLine();
					}
				}
				br.close();
				bw.close();
				System.out.println("fichero viejo duplicado");
				if (ficheroViejo.delete()) { // Aqui� deberia eliminar el original
					System.out.println("fichero viejo eliminado");
					File renombrar = new File("src/files/armas.jsonl");
					if (ficheroNuevo.renameTo(renombrar)) { // Aqui deberia renombrarlo al nombre original
						System.out.println("fichero renombrado");
						return true;
					} else {
						System.out.println("error al renombrar fichero");
					}
				} else {
					System.out.println("error al eliminar fichero");
				}
			} catch (IOException e) {
				System.out.println(e);
			}
			return false;
		}
		
		public boolean eliminarUsuarioModos(String dni) {
			Gson gson = new Gson();
			Modos modo = null;
			File ficheroViejo = new File("src/files/modos.jsonl");
			File ficheroNuevo = new File("src/files/modos2.jsonl");
			try {
				BufferedReader br = new BufferedReader(new FileReader(ficheroViejo));
				BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroNuevo, true));

				String linea;
				while ((linea = br.readLine()) != null) {
					modo = gson.fromJson(linea, Modos.class);
					if (!modo.getUserId().equalsIgnoreCase(dni)) {
						bw.append(gson.toJson(modo));
						bw.flush();
						bw.newLine();
					}
				}
				br.close();
				bw.close();
				System.out.println("fichero viejo duplicado");
				if (ficheroViejo.delete()) { // Aqui� deberia eliminar el original
					System.out.println("fichero viejo eliminado");
					File renombrar = new File("src/files/modos.jsonl");
					if (ficheroNuevo.renameTo(renombrar)) { // Aqui deberia renombrarlo al nombre original
						System.out.println("fichero renombrado");
						return true;
					} else {
						System.out.println("error al renombrar fichero");
					}
				} else {
					System.out.println("error al eliminar fichero");
				}
			} catch (IOException e) {
				System.out.println(e);
			}
			return false;
		}
		
		
		
	//ARMAS

		
		public Armas buscarArmas(String dni) {
			Gson gson = new Gson();
			Armas armas = null;
			Boolean encontrado = false;
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/files/armas.jsonl"));
				String linea;
				
				while ((linea = br.readLine()) != null && !encontrado) {
					try {
						armas = gson.fromJson(linea, Armas.class);
						if (armas.getUserId().equalsIgnoreCase(dni)) {
							encontrado = true;
						}
					}catch (Exception e) {}
				}
				br.close();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
			if(encontrado) {
				return armas;
			}else {
				return null;
			}
		}
		
		
		public Modos buscarModos(String dni) {
			Gson gson = new Gson();
			Modos modos = null;
			Boolean encontrado = false;
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/files/modos.jsonl"));
				String linea;
				
				while ((linea = br.readLine()) != null && !encontrado) {
					try {
						modos = gson.fromJson(linea, Modos.class);
						if (modos.getUserId().equalsIgnoreCase(dni)) {
							encontrado = true;
						}
					}catch (Exception e) {}
				}
				br.close();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
			if(encontrado) {
				return modos;
			}else {
				return null;
			}
		}
		
		
		
}
