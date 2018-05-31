package domaine;

import java.util.List;

public class Client extends Personne {
	
	private String typeClient ;
	private Conseiller conseiller ; 
	List <Compte> comptes ; 
	private CarteBancaire carte; 

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	} 
	

}
