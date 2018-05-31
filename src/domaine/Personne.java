package domaine;

public abstract class Personne {

	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String codePostal;
	protected String ville;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(String nom, String prenom, String adresse, String codePostal, String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
