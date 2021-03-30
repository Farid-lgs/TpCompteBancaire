package beans;

import persistence.dao.CompteDaoimpl;

public class CompteBean {
	
	private String numCompte;
	private double solde;
	private String proprietaire;
	

	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		CompteDaoimpl c= new CompteDaoimpl();
		solde = c.findById(numCompte).getSolde();
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public String getProprietaire() {
		CompteDaoimpl c= new CompteDaoimpl();
		proprietaire = c.findById(numCompte).getProprietaire();
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	} 
	
}
