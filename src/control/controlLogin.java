package control;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import aplication.ficheros;
import model.Usuario;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
public class controlLogin {
	 
	private String userNameText;

	private String passwordText;
	private Boolean entra=true;
	private final Properties properties = new Properties();
	
	private String password;
 
	private Session session;

	private void init() {
		 
		properties.put("mail.smtp.host", "mail.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port",25);
		properties.put("mail.smtp.mail.sender","tributestats@gmail.com");
		properties.put("mail.smtp.user", "tributestats@gmail.com");
		properties.put("mail.smtp.auth", "true");
		
		session = Session.getDefaultInstance(properties);
	}
	
	public void comprobarLogin() throws IOException {
		try
		{
		File myObj = new File("recursos/arma.txt"); // Specify the filename
		 Scanner myReader = new Scanner(myObj);
	     while (myReader.hasNextLine()) {
	       String data = myReader.nextLine();
	       System.out.println(data);
	     }
	     myReader.close();
		 } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		userNameText=sc.nextLine();
		System.out.println("Password: ");
		passwordText=sc.nextLine();
		
		ficheros files = new ficheros();
		Usuario usuario = files.IniciarSesion(userNameText, passwordText);
		if(usuario!=null) {
			String rol = usuario.getUserType();
			//sendEmail();
			switch (rol) {
			case "administrador":
				if(entra.equals(usuario.active)) {
					System.out.println("Bienvenido " + usuario.getName());
				controlAdmin controlAdmin1 = new controlAdmin();
				controlAdmin1.setUsuario(files.leerAdministrador("src/files/administradores/" + usuario.getUserId() + ".jsonl"));
				controlAdmin1.menuAdmin();
				
				}else {
					System.out.println("SU CUENTA SE ENCUENTRA EN ESTE MOMENTO SUSPENDIDA");
					return;
				}
				
								
				break;
			case "jugador":
				if(entra.equals(usuario.active)) {
				System.out.println("Bienvenido " + usuario.getName());
				controlJugador controlJugador1 = new controlJugador();
				controlJugador1.setUser(files.leerJugador("src/files/jugadores/" + usuario.getUserId() + ".jsonl"));
				controlJugador1.menuJugador();		
				
				}else {
					System.out.println("SU CUENTA SE ENCUENTRA EN ESTE MOMENTO SUSPENDIDA");
					return;
				}		
				break;
				
			}
		}else {
			System.out.println("ERROR");
			comprobarLogin();
		}


	}
	public void sendEmail() {
		 
		init();
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("ismacorporation@gmail.com"));
			message.setSubject("Prueba");
			message.setText("Texto");
			Transport t = session.getTransport("smtp");
			t.connect((String)properties.get("tributestats@gmail.com"), "Pass_1234");
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		}catch (MessagingException me){
                        //Aqui se deberia o mostrar un mensaje de error o en lugar
                        //de no hacer nada con la excepcion, lanzarla para que el modulo
                        //superior la capture y avise al usuario con un popup, por ejemplo.
			return;
		}
		
	} 
}
