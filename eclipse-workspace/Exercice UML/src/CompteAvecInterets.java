
public class CompteAvecInterets extends CompteBancaire {

	private float taux;

	public CompteAvecInterets(String numero, float solde, float dateOuverture, float taux) {
		super (numero, solde, dateOuverture);
		this.taux = taux;
	}	
	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
}