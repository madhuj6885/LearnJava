package com.polymorphism.class10;

public class ConstructorOverLoading {
	
	String name;
	int age;
	String job;
	
	ConstructorOverLoading() {
		
		System.out.println("From no-args constructor !");
	}
	
	ConstructorOverLoading(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	ConstructorOverLoading(String name, int age, String job) {
		
		this.name = name;
		this.age = age;
		this.job = job;
		
	}
	
	
	public void displayDetails() {
		
		
		System.out.println("Details");
		System.out.println("The Employee name is : " + name);
		System.out.println("The Employee age is :" + age);
		System.out.println("The Employee job is :" + job);
	}

	public static void main(String[] args) {
		
		ConstructorOverLoading c = new ConstructorOverLoading();
		c.displayDetails();
		System.out.println("????????????????????????????????");
		ConstructorOverLoading c1 = new ConstructorOverLoading("Madhu",27);
		
		c1.displayDetails();
		System.out.println("????????????????????????????????");

ConstructorOverLoading c2 = new ConstructorOverLoading("Madhu",27, "Automation Tester");
		
		c2.displayDetails();
     
	
		
		
		
	}

}
