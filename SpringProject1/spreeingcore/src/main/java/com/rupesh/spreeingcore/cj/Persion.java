package com.rupesh.spreeingcore.cj;

public class Persion {
private String name;
private int persionId;


	public Persion(String name, int persionId) {
		this.name=name;
		this.persionId=persionId;
		
	}


	@Override
	public String toString() {
		return "Persion [name=" + name + ", persionId=" + persionId + "]";
	}

	
	
}
