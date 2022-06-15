package fr.cmfp.tp3.quelMedecin.bo;

public class adresse {
	
	
	public String afficher() {
		return "adresse [mentionsComplementaire=" + mentionsComplementaire + ", numVoie=" + numVoie + ", codePostale="
				+ codePostale + ", commune=" + commune + "]";
	}
	public adresse(String numVoie, int codePostale, String commune) {
		super();
		this.numVoie = numVoie;
		this.codePostale = codePostale;
		this.commune = commune;
	}
	public adresse(String mentionsComplementaire, String numVoie, int codePostale, String commune) {
		super();
		this.mentionsComplementaire = mentionsComplementaire;
		this.numVoie = numVoie;
		this.codePostale = codePostale;
		this.commune = commune;
	}
	private String mentionsComplementaire;
	private String numVoie;
	private int codePostale;
	private String commune;
}
