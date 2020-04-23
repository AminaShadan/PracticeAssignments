package com.amina.test1;
//SubClass
public class Car extends Vehicle {
	
	int speed = 100;
	public void run(){
		System.out.println("Speed of the Car : "+ speed);
		System.out.println("Speed of the Car : "+ super.speed); 
		super.run(); //method
	}
	
	public static void main(String args[]){
		
		Car c = new Car();
		System.out.println(c.speed);
		c.run();
	}
	

}
