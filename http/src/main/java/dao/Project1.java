package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import controller.Project;
import dto.Project2;

public class Project1 {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
public void insert(Project2 p){
	entityTransaction.begin();
	entityManager.persist(p);
	entityTransaction.commit();
}
}
