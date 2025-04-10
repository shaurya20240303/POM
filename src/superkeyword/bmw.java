package superkeyword;

import inhererence.superclass;

public class bmw extends car{
	
	int speed =200;
	//non static method can be overriddern
	@Override
	public void start() {
		super.start(); //here when we want call parent class same method in child class in present same parent class here is start metthod to call here we use super keyword
		
		   System.out.println("bmw---start");
	   }
	public void displayspeed() {
		//super.speed;
	 //internall super keyword means they are creating object of parent class we can access parent class property
		System.out.println(super.speed); //with supper keyword we can access parent class property
		   System.out.println(speed);
	}
	public static void billing() {
		//in static context we cant use super keyword
		System.out.println("bmw--billinhg");
	}
	

}
