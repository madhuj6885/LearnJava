package com.encapsulation.class12;

public class AccountDriver {

	public static void main(String[] args) {
      Account a =  new Account("Madhu","62402066464", 58462555);
      
String name = a.getAccName();
System.out.println(name);

a.setAccName("Mithun");
String updatedName = a.getAccName();

System.out.println(updatedName);

a.setBalance(983438759);

double balance = a.getBalance();
System.out.println(balance);


	}

}
