package control;

import model.Administrador;

public class controlModificarUsuario {

	private Administrador user;

	void modificarUsuario() {
		System.out.println("¿Qué usuario desea modificar?");

	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
