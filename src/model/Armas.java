package model;

public class Armas extends Usuario{

	public Armas(String userId, int totalKills, int fusiles, int subfusiles, int ametralladoras, int escopetas,
			int franco, int pistolas) {
		super(userId, totalKills, fusiles, subfusiles, ametralladoras, escopetas, franco, pistolas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Armas [getUserId()=" + getUserId() + ", getTotalKills()=" + getTotalKills() + ", getFusiles()=" + getFusiles() + ", getSubfusiles()="
				+ getSubfusiles() + ", getAmetralladoras()=" + getAmetralladoras() + ", getEscopetas()="
				+ getEscopetas() + ", getFranco()=" + getFranco() + ", getPistolas()=" + getPistolas()
				+ ", getUserId()=" + getUserId() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getUserType()=" + getUserType() + ", getName()=" + getName() + ", getLastnames()=" + getLastnames()
				+ ", getBirthday()=" + getBirthday() + ", getGenre()=" + getGenre() + ", getActive()=" + getActive()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
		





	


	
}
