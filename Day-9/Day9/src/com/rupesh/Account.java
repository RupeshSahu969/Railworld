package com.rupesh;

public class Account {

	private String accountname;
	
	private int accountnumber;
	
	private AccountType accountType;
	
	private Gender gender;
	
	
	public Account() {
		
	}


	public Account(String accountname, int accountnumber, AccountType accountType, Gender gender) {
		super();
		this.accountname = accountname;
		this.accountnumber = accountnumber;
		this.accountType = accountType;
		this.gender = gender;
	}


	public String getAccountname() {
		return accountname;
	}


	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}


	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public AccountType getAccountType() {
		return accountType;
	}


	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Account [accountname=" + accountname + ", accountnumber=" + accountnumber + ", accountType="
				+ accountType + ", gender=" + gender + "]";
	}
	
	
	
	
}
