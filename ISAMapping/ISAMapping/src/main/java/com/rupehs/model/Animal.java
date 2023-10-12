package com.rupehs.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DiscriminatorType" , discriminatorType=DiscriminatorType.STRING)
public class Animal {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aId;
	
	private String aName;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "Animal [aId=" + aId + ", aName=" + aName + "]";
	}
	
	
	
	
	
}
