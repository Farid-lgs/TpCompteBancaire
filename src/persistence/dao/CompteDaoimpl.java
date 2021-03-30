package persistence.dao;

import org.hibernate.Session;

import persistence.entities.Compte;

public class CompteDaoimpl implements CompteDao{

	@Override
	public Compte findById(String numCompte) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Compte compte = s.get(Compte.class,numCompte);
		s.close();
		return compte;
	}

}
