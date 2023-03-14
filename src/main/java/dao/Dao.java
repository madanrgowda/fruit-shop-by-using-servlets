package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dto.Fruits_Shop;
public class Dao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	public void add(Fruits_Shop fruits_Shop) {
		entityTransaction.begin();
		entityManager.persist(fruits_Shop);
		entityTransaction.commit();
	}
	public List<Fruits_Shop> fetchAll()
	{
		 return entityManager.createQuery("select x from Fruits_Shop x",Fruits_Shop.class).getResultList();
	}
}
