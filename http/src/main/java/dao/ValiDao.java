package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.ValidaDto;



public class ValiDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(ValidaDto v) {
		entityTransaction.begin();
		entityManager.persist(v);
		entityTransaction.commit();
	}
	public ValidaDto fetch(String s1) {

		ValidaDto p = entityManager.find(ValidaDto.class, s1);
	return p;
	}
}
