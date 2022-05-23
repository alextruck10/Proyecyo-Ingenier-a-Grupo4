package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Armas;
import model.Usuario;

public class controlArmas {
	
	private String idText;
	private Administrador user;
	
	
	void mostrarfusiles() throws IOException {
		String usuario=user.getUserId();
		System.out.println(usuario);
		ficheros files = new ficheros();
		Armas armas = files.buscarArmas(idText);
		System.out.println(armas.fusiles());
	}

	
}
