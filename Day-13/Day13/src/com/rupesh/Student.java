package com.rupesh;

import java.util.Objects;

public class Student {

	private Integer  sId;
	private String sName;
	private String  suser;
	public Student(Integer sId, String sName, String suser) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.suser = suser;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSuser() {
		return suser;
	}
	public void setSuser(String suser) {
		this.suser = suser;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", suser=" + suser + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sId, sName, suser);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(sId, other.sId) && Objects.equals(sName, other.sName)
				&& Objects.equals(suser, other.suser);
	}
	
	
	
}
