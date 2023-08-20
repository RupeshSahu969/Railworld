package com.rupesh.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	public static EntityManager getEntityManager() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("empUnit");
		
		EntityManager em=emf.createEntityManager();
		
		return em;
		
	}
}
