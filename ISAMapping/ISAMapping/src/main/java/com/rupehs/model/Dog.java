package com.rupehs.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dog")
public class Dog  extends Animal {

	private Integer Lifespan;
	
	private String breed;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Integer getLifespan() {
		return Lifespan;
	}

	public void setLifespan(Integer lifespan) {
		Lifespan = lifespan;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [Lifespan=" + Lifespan + ", breed=" + breed + "]";
	}
	
	
	
	
}
