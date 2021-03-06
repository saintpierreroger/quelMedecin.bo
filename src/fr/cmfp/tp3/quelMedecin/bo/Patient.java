package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalDate;

public class Patient {

	private String nom;
	private String prennom;
	private String telephone;
	private char sexe;
	private int numSecuritÚSociale;
	private LocalDate dateDeNaissance; 
	private String commentaire;
	
	public String toString() {
		return "Patient [nom=" + nom + ", prennom=" + prennom + ", telephone=" + telephone + ", sexe=" + sexe
				+ ", numSecuritÚSociale=" + numSecuritÚSociale + ", dateDeNaissance=" + dateDeNaissance
				+ ", commentaire=" + commentaire + "]";

	
	
	}
	
}
