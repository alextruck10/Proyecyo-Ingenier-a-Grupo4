package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import aplication.ficheros;
import model.Jugador;
import model.Mensaje;
import model.Usuario;

public class controlChat {
	private Jugador user;
	private String textoMensaje;
	
    void cargarChat() throws IOException{

    	ficheros fichero = new ficheros();
    	String ruta = "src/files/chats/"+ user.getUserId() +".jsonl";
    	ArrayList <Mensaje> miChat = fichero.leerChat(ruta);

    	for(int i = 0; i < miChat.size(); i++){
    		System.out.println(miChat.get(i).getNombre() + " : " + miChat.get(i).getTexto());
    	}
    	
    	Scanner sc = new Scanner(System.in);
    	textoMensaje = sc.nextLine();
    	fichero.escribirChat(new Mensaje(user.getName(), textoMensaje),  ruta);
    	volver();
    }
	public void volver () throws IOException {
	ficheros files = new ficheros();
	System.out.println("ACCIÓN FINALIZADA...Volviendo al menu");
	controlAdmin controlAdmin2 = new controlAdmin();
	controlAdmin2.menuAdmin();
	}
	public void setUser(Jugador u) {
    	user = u;
    }
}