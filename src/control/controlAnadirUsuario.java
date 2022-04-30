package control;

import model.Administrador;

public class controlAnadirUsuario {

	private Administrador user;

	void anadirUsuario() {
		System.out.println("¿Qué tipo de usuario desea añadir?");
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
