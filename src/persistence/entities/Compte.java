package persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compte", schema = "AFPA")
public class Compte {
	
	private String numCompte;
	private double solde;
	private String proprietaire;
	
	@Id
	@Column(name = "numcompte", length = 254)
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	@Column(name = "solde")
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Column(name = "proprietaire", length = 254)
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	} 
	
	
}
