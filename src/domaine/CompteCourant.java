package domaine;

public class CompteCourant extends Compte {
	
	private double decouvert =1000;

	//----------   Constructeurs ----------
	
	public CompteCourant() {
		super();
	}
	
	

	public CompteCourant(int idCompte) {
		super(idCompte);
	}



	public CompteCourant(int idCompte, double solde, String dateOuverture, double decouvert) {
		super(idCompte, solde, dateOuverture);
		this.decouvert = decouvert;
	}
	
	//----------   Getters & Setters ----------

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	} 
	
	
	
	
	
	

}
