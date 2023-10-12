package com.rupehs.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMConnection {

	public static EntityManager getConnection() {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("AnimalUnit");
		
		return emf.createEntityManager();
		
	}
	
}
