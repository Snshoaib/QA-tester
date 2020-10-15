package com.polymorphism;

public class ConstructorDemoClass {

	String name;
	String address;
	int zip;
	ConstructorDemoClass(String n,String a, int z ){
	
	
	 //initialize object
	 
	 name = n;
	 address= a;
	 zip=z;
	}
	
	//default constructor
	ConstructorDemoClass(){
	System.out.println("no value");
	
	}
	//parameterized constructor
	
     public void displayinfo() {
     System.out.println("name is " + name);
	 System.out.println("address is "+ address );
	 System.out.println("zip code " + zip );
	 
	 
}
}