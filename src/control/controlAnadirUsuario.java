package control;

import model.Administrador;

public class controlAnadirUsuario {

	private Administrador user;

	void anadirUsuario() {
		System.out.println("�Qu� tipo de usuario desea a�adir?");
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
