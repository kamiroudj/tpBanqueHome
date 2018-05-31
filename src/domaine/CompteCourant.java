package domaine;

public class CompteCourant extends Compte {
	
	private double decouvert ;

	//----------   Constructeurs ----------
	
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
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
