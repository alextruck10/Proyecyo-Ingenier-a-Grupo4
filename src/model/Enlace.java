package model;

public class Enlace {

	private String jugadorID1;
	private String jugadorID2;
	
	
	public String getJugadorID1() {
		return jugadorID1;
	}


	public void setJugadorID1(String jugadorID1) {
		this.jugadorID1 = jugadorID1;
	}


	public String getJugadorID2() {
		return jugadorID2;
	}


	public void setJugadorID2(String jugadorID2) {
		this.jugadorID2 = jugadorID2;
	}

	public Enlace(String jugadorID1, String jugadorID2) {
		this.jugadorID1 = jugadorID1;
		this.jugadorID2 = jugadorID2;
	}
	
	@Override
	public String toString() {
		return "Enlace [jugadorID1=" + jugadorID1 + ", jugadorID2=" + jugadorID2 + "]";
	}


	
	
}
