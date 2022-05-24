package control;

import java.util.ArrayList;

import aplication.ficheros;
import model.Jugador;
import model.Mensaje;

public class controlChat {
	private Jugador user;

	
    void cargarChat(){

    	ficheros fichero = new ficheros();
    	String ruta = "src/files/chats/"+ user.getUserId() +".jsonl";
    	ArrayList <Mensaje> miChat = fichero.leerChat(ruta);

    	System.out.println(miChat.toString());

    }
	
	public void setUsuario(Jugador u) {
    	user = u;
    	

    }
}
