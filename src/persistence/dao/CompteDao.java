package persistence.dao;

import java.util.List;

import comptes.Compte;

public interface CompteDao {
	void add(Compte c);
	void delete(Compte c);
	void update(Compte c);
	List<Compte> findAll();
	Compte findById(int numCompte);
}