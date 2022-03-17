package model;

public class Jugador extends Usuario{

	private float peso;
    private float altura;

	public Jugador(String userId, String email, String password, String userType, String name, String lastnames,
			String birthdate, String genre, Boolean active) {
        super(userId, email, password, userType, name, lastnames, birthdate, genre, active);
        
    }



}