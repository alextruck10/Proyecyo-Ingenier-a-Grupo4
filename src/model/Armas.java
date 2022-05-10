package model;

public class Armas{

	private String userId;
	private int totalKills;
	private int fusiles;
	private int subfusiles;
	private int ametralladoras;
	private int escopetas;
	private int franco;
	private int pistolas;

	

	public Armas(String userId, int totalKills, int fusiles, int subfusiles, int ametralladoras, int escopetas,
			int franco, int pistolas) {
		super();
		this.userId = userId;
		this.totalKills = totalKills;
		this.fusiles = fusiles;
		this.subfusiles = subfusiles;
		this.ametralladoras = ametralladoras;
		this.escopetas = escopetas;
		this.franco = franco;
		this.pistolas = pistolas;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getTotalKills() {
		return totalKills;
	}

	public void setTotalKills(int totalKills) {
		this.totalKills = totalKills;
	}

	public int getFusiles() {
		return fusiles;
	}

	public void setFusiles(int fusiles) {
		this.fusiles = fusiles;
	}

	public int getSubfusiles() {
		return subfusiles;
	}

	public void setSubfusiles(int subfusiles) {
		this.subfusiles = subfusiles;
	}

	public int getAmetralladoras() {
		return ametralladoras;
	}

	public void setAmetralladoras(int ametralladoras) {
		this.ametralladoras = ametralladoras;
	}

	public int getEscopetas() {
		return escopetas;
	}

	public void setEscopetas(int escopetas) {
		this.escopetas = escopetas;
	}

	public int getFranco() {
		return franco;
	}

	public void setFranco(int franco) {
		this.franco = franco;
	}

	public int getPistolas() {
		return pistolas;
	}

	public void setPistolas(int pistolas) {
		this.pistolas = pistolas;
	}

	@Override
	public String toString() {
		return "Armas [getUserId()=" + getUserId() + ", getTotalKills()=" + getTotalKills() + ", getFusiles()=" + getFusiles() + ", getSubfusiles()="
				+ getSubfusiles() + ", getAmetralladoras()=" + getAmetralladoras() + ", getEscopetas()="
				+ getEscopetas() + ", getFranco()=" + getFranco() + ", getPistolas()=" + getPistolas()
				+ "]";
	}
		





	


	
}
