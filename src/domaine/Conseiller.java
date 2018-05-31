package domaine;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Employe{
	
	List<Personne> clients = new ArrayList<Personne>();

	public List<Personne> getClients() {
		return clients;
	}

	public void setClients(List<Personne> clients) {
		this.clients = clients;
	}
	
	
	

}
