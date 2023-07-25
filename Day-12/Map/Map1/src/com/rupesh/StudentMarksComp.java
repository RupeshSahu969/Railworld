package com.rupesh;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getMark() > s2.getMark())
			return +1;
			else if(s1.getMark() < s2.getMark())
			return -1;
			else
			return 0;
	}

}
