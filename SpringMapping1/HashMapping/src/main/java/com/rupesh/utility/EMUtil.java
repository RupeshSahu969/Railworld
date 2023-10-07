package com.rupesh.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	public static EntityManager getEntityManager() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("EmpAddress");
		
		return emf.createEntityManager();
	}
}
