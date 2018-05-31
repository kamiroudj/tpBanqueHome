package domaine;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Employe{
	


	List<Personne> clients = new ArrayList<Personne>(); ;
	
	public Conseiller() {
		super();
		clients = new ArrayList<Personne>();
	}
	

	public Conseiller(String nom, String prenom, String adresse, String codePostal, String ville, int login,
			int password) {


		super(nom, prenom, adresse, codePostal, ville, login, password);
	}

	public List<Personne> getClients() {
		return clients;
	}

	public void setClients(List<Personne> clients) {
		this.clients = clients;
	}
	
	
	

}
