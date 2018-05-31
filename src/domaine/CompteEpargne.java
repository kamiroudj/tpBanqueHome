package domaine;

public class CompteEpargne extends Compte {
	
	private double taux = 3 ;
	
	//----------   Constructeurs ----------

	public CompteEpargne() {
		super();
	}
	
	

	public CompteEpargne(int idCompte) {
		super(idCompte);
	}



	public CompteEpargne(int idCompte, double solde, String dateOuverture, double taux) {
		super(idCompte, solde, dateOuverture);
		this.taux = taux;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	} 
	
	
	

}
