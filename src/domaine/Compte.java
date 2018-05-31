package domaine;

public abstract class Compte {
	
	protected int idCompte ;
	protected double solde ; 
	protected String dateOuverture ;
	private Client client ; 
	
	//----------   Constructeurs ----------
	
	public Compte() {
		super();
	}
	
	

	public Compte(int idCompte) {
		super();
		this.idCompte = idCompte;
	}



	public Compte(int idCompte, double solde, String dateOuverture) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	/**
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the dateOuverture
	 */
	public String getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	} 
	
	// 
	
	

}
