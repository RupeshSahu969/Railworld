package com.rupesh;

public class Persion {

	
	private String namep;
	private int agep;
	private Gender genderp;
	
	
	
	public String getNamep() {
		return namep;
	}
	public void setNamep(String namep) {
		this.namep = namep;
	}
	public int getAgep() {
		return agep;
	}
	public void setAgep(int agep) {
		this.agep = agep;
	}
	public Gender getGenderp() {
		return genderp;
	}
	public void setGenderp(Gender genderp) {
		this.genderp = genderp;
	}
	
	
	public static void talking() {
		System.out.println(" Person is talking");
	}
}
