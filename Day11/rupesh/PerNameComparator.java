package com.rupesh;
import java.util.*;

public class PerNameComparator implements Comparator <Persion> {

	@Override
	public int compare(Persion o1, Persion o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
