package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import controller.Fetchall;
import dto.FetchallDaoJsp;
import dto.pateint;

public class DaoPateint {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(pateint p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}

	public void update(String s1, String s2) {
		entityTransaction.begin();
		pateint p = new pateint();
		p.setP_id(s1);
		p.setP_bg(s2);
		entityManager.merge(p);
		entityTransaction.commit();
	}

	public void remove(String s1) {
		
		pateint p = entityManager.find(pateint.class, s1);
		p.setP_id(s1);
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
	}

	public pateint fetch(String s1) {

		pateint p = entityManager.find(pateint.class, s1);
	return p;
	}

	public List<pateint> fetchall() {
		Query q = entityManager.createQuery("select a from pateint a");
		List<pateint> d = q.getResultList();
		return d;
		
	}
	public void deleteAll() {
		Query q = entityManager.createQuery("delete from pateint");
		entityTransaction.begin();
		q.executeUpdate();
		entityTransaction.commit();
	}
}
