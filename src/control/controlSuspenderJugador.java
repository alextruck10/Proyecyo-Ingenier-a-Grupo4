package control;


import aplication.ficheros;

import model.Administrador;


public class controlSuspenderJugador {

	private Administrador user;
	
	void suspender() {
		System.out.println("�A qui�n desea suspender?");
	}
	
	public void setUser(Administrador user) {
		this.user = user;
	}
}
