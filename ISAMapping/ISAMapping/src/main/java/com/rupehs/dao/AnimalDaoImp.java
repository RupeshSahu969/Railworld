package com.rupehs.dao;

import javax.persistence.EntityManager;

import com.rupehs.connection.EMConnection;
import com.rupehs.model.Animal;

public class AnimalDaoImp  implements AnimalDao {

	
	private EntityManager em;
	
	public AnimalDaoImp() {
		// TODO Auto-generated constructor stub
		this.em=EMConnection.getConnection();
		
	}
	
	
	@Override
	public String addAnimal(Animal animal) {
		// TODO Auto-generated method stub
		
		this.em.getTransaction().begin();
		Animal a1 =this.em.merge(animal);
		
		this.em.getTransaction().commit();
		
		if(animal != null) {
			return "Animal is Saved";
		}
		else {
			return "Animal is not Saved";
		}
		
	}

}
