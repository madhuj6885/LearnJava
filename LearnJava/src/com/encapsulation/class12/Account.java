package com.encapsulation.class12;

public class Account {
	
	private String accName;
	String accNum;
	double balance;

Account(String name, String no, double amt) {
	
	setAccName(name);
	accNum = no;
	balance = amt;
	
}

public String getAccName() {
	return accName;
}

public void setAccName(String accName) {
	this.accName = accName;
}

public void setAccNum(String accNum) {
	this.accNum = accNum;
}

public void setBalance(double balance) {
	this.balance = balance;
}



public double getBalance() {
	return balance;
}



}
