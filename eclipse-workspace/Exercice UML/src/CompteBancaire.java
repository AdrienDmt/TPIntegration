
public class CompteBancaire {
	private String numero;
	private float solde;
	private float dateOuverture;
	
	public CompteBancaire(String numero, float solde, float dateOuverture) {
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public float getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(float dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	
}
