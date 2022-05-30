package control;

import java.io.IOException;

import aplication.ficheros;
import model.Modos;
import model.Jugador;

public class controlVictoriasDerrotas {
	private Jugador user;

	void victoriasDerrotas() throws IOException {
	System.out.println("% Victorias/Derrotas");
	ficheros files10 = new ficheros();
	Modos modos3 = files10.buscarModos(user.getUserId());
	System.out.println((double)modos3.totalwins()*100/(double)modos3.totalpartidas()+"%");
	volver();
	}
	
	public void volver () throws IOException {
		ficheros files = new ficheros();
		System.out.println("ACCIÓN FINALIZADA...Volviendo al menu");
		controlJugador controlJugador1 = new controlJugador();
		controlJugador1.menuJugador();
		}
	public void setUser(Jugador user) {
		this.user = user;
	}
}
