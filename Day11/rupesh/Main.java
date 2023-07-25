package com.rupesh;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		TreeSet<Persion>  st= new TreeSet<>();
		
		st.add(new Persion(1,"Rupesh","male",12));
		st.add(new Persion(1,"veena","male",14));
		st.add(new Persion(1,"puja","male",19));
		st.add(new Persion(1,"ana","male",30));
		
		
		for(Persion s: st) {
			System.out.println(s);
		}
		
	}
}
