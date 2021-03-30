package persistence.dao;

import persistence.entities.Compte;

public interface CompteDao {
	Compte findById(String numCompte);
}