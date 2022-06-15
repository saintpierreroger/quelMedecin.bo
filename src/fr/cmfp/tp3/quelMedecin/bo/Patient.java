package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalDate;

public class Patient {

	private String nom;
	private String prennom;
	private String telephone;
	private char sexe;
	private int numSecurit�Sociale;
	private LocalDate dateDeNaissance; 
	private String commentaire;
	
	public String toString() {
		return "Patient [nom=" + nom + ", prennom=" + prennom + ", telephone=" + telephone + ", sexe=" + sexe
				+ ", numSecurit�Sociale=" + numSecurit�Sociale + ", dateDeNaissance=" + dateDeNaissance
				+ ", commentaire=" + commentaire + "]";

	
	
	}
	
}
