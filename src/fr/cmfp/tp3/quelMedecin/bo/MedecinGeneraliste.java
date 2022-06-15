package fr.cmfp.tp3.quelMedecin.bo;

public class MedecinGeneraliste {

	

	public MedecinGeneraliste(String nom, String prenom, String telephone, String adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}
	
	private String nom;
	private String prenom;
	private String telephone;
	private static int tarif;
	private adresse medecin;
	
	
	 {
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public String getNom() {
		return nom;
	}

	public adresse getMedecin() {
		return medecin;
	}

	public void setMedecin(adresse medecin) {
		this.medecin = medecin;
	}
	
	
}
