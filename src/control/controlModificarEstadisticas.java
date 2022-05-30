package control;

import java.io.IOException;
import java.util.Scanner;

import aplication.ficheros;
import model.Administrador;
import model.Armas;
import model.Usuario;

public class controlModificarEstadisticas {
	
	private String idText;
	private Administrador user;
	private String userId=idText;

	private int totalKills;
	private int fusiles;
	private int subfusiles;
	private int ametralladoras;
	private int escopetas;
	private int franco;
	private int pistolas;


	void modificarEstadisticas() throws IOException {
		
		System.out.println("¿De quién desea modificar las estadísticas?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Id del usuario: ");
		idText=sc.nextLine();
		
		ficheros files = new ficheros();
		Armas armas = files.buscarArmas(idText);
		System.out.println(armas.toString());
		
		volver();
		}
	
	
	public void volver () throws IOException {
		ficheros files = new ficheros();
	System.out.println("ACCIÓN FINALIZADA...Volviendo al menu");
	controlAdmin controlAdmin1 = new controlAdmin();
	controlAdmin1.setUsuario(user);

	controlAdmin1.menuAdmin();		
	}
	public void setUser(Administrador user) {
		this.user = user;
	}
	

}
