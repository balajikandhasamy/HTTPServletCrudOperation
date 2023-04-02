package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.FetchallDaoJsp;

public class Jspmethod {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public void jspinsert(FetchallDaoJsp p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	public List jspfetchall(){
	Query q=entityManager.createQuery("select a from FetchallDaoJsp a");
	List<FetchallDaoJsp> l=q.getResultList();
	return l;
	}
}
