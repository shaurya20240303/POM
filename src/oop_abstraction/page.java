package oop_abstraction;

public abstract class page {
 // can not create the object of abstract class
	//can have abstract and non abstract method
	//can we have constructor of the abstract class:yes
	//it will be called when you create the object of child class
	//o to 100% abstraction:
	//0% abstraction :no abstract metgod
	//100%abstraction:all abstract methods
	//partial abstraction:abstract + non abstract
	//return this ==>keyword means return same object of the class
	//this:
	   //1.can be used to init the class varible with this.g=l  in the constructor
	   //2.encapsulation :setter :this.g=l
	   //3.this() can be used to call the same class constructor
	   //4.in builder pattern :to generate the work flow /user:every method will return this keyword
	        //only the same object will be returned
	        //return type: class name
	        //return this;
 	//interface: both are helping me to achieving  the abstraction but  with interface achieve only 100% abstraction
 //expample whenever require 100% abstraction i will go with interface example webdriver is do know idea about how chrome,firefox and edge browser will be launched
	public abstract void title();
	public abstract void url();
	public void pageTimeout() {
		System.out.println("page time out");
	}
	public void logo() {
		System.out.println("logo");
	}
}
