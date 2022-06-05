package model;

import aplication.ficheros;

public class Modos {
	private String userId;
	private int mododuelowins;
	private int mododuelototal;
	private int mododominiowins;
	private int mododominiototal;
	private int modocalientewins;
	private int modocalientetotal;
	
	
	
	
	
	public Modos(String userId, int mododuelowins, int mododuelototal, int mododominiowins, int mododominiototal,
			int modocalientewins, int modocalientetotal) {
		super();
		this.userId = userId;
		this.mododuelowins = mododuelowins;
		this.mododuelototal = mododuelototal;
		this.mododominiowins = mododominiowins;
		this.mododominiototal = mododominiototal;
		this.modocalientewins = modocalientewins;
		this.modocalientetotal = modocalientetotal;
	}
	
public void borrarModos(String dni) {
		
		ficheros files = new ficheros();
		Modos modo = files.buscarModos(dni);
		
		if(modo!=null) {
		
			files.eliminarUsuarioModos(modo.getUserId());
			//files.eliminarUsuarioModos(persona.getUserId());

			System.out.println("Modos borrados");
			
			
		}else {
			System.out.println("No hemos encontrado los modos del usuario");
		}
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getMododuelowins() {
		return mododuelowins;
	}
	public void setMododuelowins(int mododuelowins) {
		this.mododuelowins = mododuelowins;
	}
	public int getMododuelototal() {
		return mododuelototal;
	}
	public void setMododuelototal(int mododuelototal) {
		this.mododuelototal = mododuelototal;
	}
	public int getMododominiowins() {
		return mododominiowins;
	}
	public void setMododominiowins(int mododominiowins) {
		this.mododominiowins = mododominiowins;
	}
	public int getMododominiototal() {
		return mododominiototal;
	}
	public void setMododominiototal(int mododominiototal) {
		this.mododominiototal = mododominiototal;
	}
	public int getModocalientewins() {
		return modocalientewins;
	}
	public void setModocalientewins(int modocalientewins) {
		this.modocalientewins = modocalientewins;
	}
	public int getModocalientetotal() {
		return modocalientetotal;
	}
	public void setModocalientetotal(int modocalientetotal) {
		this.modocalientetotal = modocalientetotal;
	}
	@Override
	public String toString() {
		return "Modos [userId=" + userId + ", mododuelowins=" + mododuelowins + ", mododuelototal=" + mododuelototal
				+ ", mododominiowins=" + mododominiowins + ", mododominiototal=" + mododominiototal
				+ ", modocalientewins=" + modocalientewins + ", modocalientetotal=" + modocalientetotal + "]";
	}
	
	public String dueloporequiposwin() {
		return "Tus victorias en Duelo por Equipos son:" + mododuelowins;
		
	}
	
	public String dominiowin() {
		return "Tus victorias en Dominio son:" + mododominiowins;
		
	}
	
	public String calientewin() {
		return "Tus victorias en Punto Caliente son:" + modocalientewins;
		
	}
	
	public String dueloporequipostotal() {
		return "El total de partidas jugadas en Duelo por Equipos son:" + mododuelototal;
		
	}
	
	public String dominiototal() {
		return "El total de partidas jugadas en Dominio son:" + mododominiototal;
		
	}
	
	public String calientetotal() {
		return "El total de partidas jugadas en Punto Caliente son:" + modocalientetotal;
		
	}
	
	public int totalpartidas() {
		
		int totalpartidas;
		totalpartidas=modocalientetotal+modocalientetotal+mododominiototal;
		
		return totalpartidas;
		
	}
	
public int totalwins() {
		
		int totalwins;
		totalwins=mododuelowins+mododominiowins+modocalientewins;
		
		return totalwins;
		
	}
	
	
	

}
