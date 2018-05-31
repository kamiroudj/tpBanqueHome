package domaine;

import java.util.List;

public class Client extends Personne {

	private String typeClient;
	private Conseiller conseiller;
	List<Compte> comptes;
	private CarteBancaire carte;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String typeClient) {
		super(nom, prenom, adresse, codePostal, ville);
		this.typeClient = typeClient;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

}
