package model;

public class Armas{
	private String userId;
	private int totalKills;
	private String fusiles;
	private String subfusiles;
	private String ametralladoras;
	private String escopetas;
	private String franco;
	private String pistolas;
	
	public Armas(String userId, int totalKills, String fusiles, String subfusiles, String ametralladoras, String escopetas,
			String franco, String pistolas) {
		
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

	public String getFusiles() {
		return fusiles;
	}

	public void setFusiles(String fusiles) {
		this.fusiles = fusiles;
	}

	public String getSubfusiles() {
		return subfusiles;
	}

	public void setSubfusiles(String subfusiles) {
		this.subfusiles = subfusiles;
	}

	public String getAmetralladoras() {
		return ametralladoras;
	}

	public void setAmetralladoras(String ametralladoras) {
		this.ametralladoras = ametralladoras;
	}

	public String getEscopetas() {
		return escopetas;
	}

	public void setEscopetas(String escopetas) {
		this.escopetas = escopetas;
	}

	public String getFranco() {
		return franco;
	}

	public void setFranco(String franco) {
		this.franco = franco;
	}

	public String getPistolas() {
		return pistolas;
	}

	public void setPistolas(String pistolas) {
		this.pistolas = pistolas;
	}
	@Override
	public String toString() {
		return "Armas [userId=" + userId + ", totalKills=" + totalKills + ", fusiles=" + fusiles + ", subfusiles="
				+ subfusiles + ", ametralladoras=" + ametralladoras + ", escopetas=" + escopetas + ", franco=" + franco
				+ ", pistolas=" + pistolas + "]";
	}


	
}
