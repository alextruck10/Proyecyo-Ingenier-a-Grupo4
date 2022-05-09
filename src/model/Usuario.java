package model;

public class Usuario {

    private String userId;
    private String email;
    private String password;
    private String userType;
    private String name;
    private String lastnames;
    private String birthday;
    private String genre;
    private Boolean active;
    
    private int totalKills;
	private int fusiles;
	private int subfusiles;
	private int ametralladoras;
	private int escopetas;
	private int franco;
	private int pistolas;
   


    public Usuario(String userId, String email, String password, String userType) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    
    public Usuario(String userId, String email, String password, String userType, String name, String lastnames,
			String birthdate, String genre, Boolean active) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.name = name;
		this.lastnames = lastnames;
		this.birthday = birthdate;
		this.genre = genre;
		this.active = active;
	}
    
    public Usuario(String userId, int totalKills, int fusiles, int subfusiles, int ametralladoras, int escopetas, int franco, int pistolas) {
    	
    	this.userId=userId;
    	this.totalKills=totalKills;
    	this.fusiles=fusiles;
    	this.subfusiles=subfusiles;
    	this.ametralladoras=ametralladoras;
    	this.escopetas=escopetas;
    	this.franco=franco;
    	this.pistolas=pistolas;
    	
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


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	
    
   

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastnames() {
		return lastnames;
	}

	public void setLastnames(String lastnames) {
		this.lastnames = lastnames;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthdate(String birthday) {
		this.birthday = birthday;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	


	@Override
	public String toString() {
		return "Usuario [userId=" + userId + ", email=" + email + ", password=" + password + ", userType=" + userType
				+ ", name=" + name + ", lastnames=" + lastnames + ", birthday=" + birthday + ", genre=" + genre
				+ ", active=" + active + "]";
	}

}