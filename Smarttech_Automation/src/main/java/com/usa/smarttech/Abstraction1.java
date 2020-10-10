   package com.usa.smarttech;

   public class Abstraction1 implements Abstraction,AbstractionClass2 {

	public void getName() {
	System.out.println("Shoaib Islam");	
		
	}
    
	public void getAge() {
		System.out.println("32");
	}

	public void getAddress() {
		System.out.println("8345 Broadway,Apt#521,");
	}
		
    public static void main(String[] args) {
		Abstraction1 obj = new Abstraction1();
		obj.getName();
		obj.getAge();
		obj.getAddress();
		obj.getCar();
		
	}

	public void getCar() {
		System.out.println("Audi");
		
	}

	public void getModel() {
		// TODO Auto-generated method stub
		
	}

	public void getColor() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
