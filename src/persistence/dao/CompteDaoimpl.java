package persistence.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistence.entities.Compte;

public class CompteDaoimpl implements CompteDao{

	@Override
	public void add(Compte c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();
		
	}

	@Override
	public void delete(Compte c) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction(); 
		s.delete(c);
		tx.commit();
		s.close();
	}

	@Override
	public void update(Compte c) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction(); 
		s.update(c);
		tx.commit();
		s.close();
	}

	@Override
	public List<Compte> findAll() {
		List<Compte> listeCompte = new ArrayList<Compte>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		listeCompte = s.createQuery("from Compte").list();
		s.close();
		return listeCompte;
	}

	@Override
	public Compte findById(int numCompte) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Compte compte = s.get(Compte.class,(int) numCompte);
		s.close();
		return compte;
	}

}
