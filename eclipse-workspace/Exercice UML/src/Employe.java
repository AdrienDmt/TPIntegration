
public class Employe extends Personne {
	private float salaire;
	private String numINSEE;
	
	public Employe(String nom, String prenom, String adresse, float salaire, String numINSEE, Agence agence) {
		super(nom, prenom, adresse);
		this.salaire = salaire;
		this.numINSEE = numINSEE;
	}
	
	
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public String getNumINSEE() {
		return numINSEE;
	}
	public void setNumINSEE(String numINSEE) {
		this.numINSEE = numINSEE;
	}

}
