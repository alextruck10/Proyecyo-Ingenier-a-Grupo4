package model;

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
	
	
	

}
