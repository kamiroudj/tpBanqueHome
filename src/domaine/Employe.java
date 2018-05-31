package domaine;

public class Employe extends Personne{
	
	protected int login;
	protected int password;
	
	

	
	public Employe() {
		super();
	}


	public Employe(String nom, String prenom, String adresse, String codePostal, String ville, int login, int password) {		
		super(nom, prenom, adresse, codePostal, ville);
		this.login = login;
		this.password = password;
	}
	
	
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}
