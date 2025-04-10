package oop_encapsulation;

public class Selenium {
	//here we want to full restruction on object creation using this private constructor //taking care heap memory here
	//no object creation
	//System class in this class we can create object of that class
	//inside this system all method are static and one private constructor thats why we are unable to create object
	//data protection and data manupulation via public layer
	//hiding the implemention details from external user with using private variable or private method aand access via public method ouside the class
	//i dont want to wrong data to my data base or direct to the user might impact my other functiolity of the application
	//we are totatly restrict to the user ,ATM machine,set card and get money here customer is not aware how system is works here
	//.click ,wait ,
	private Selenium() {
		
	}
	
	public static void get() {
		System.out.println("launch url");
	}
	public  static void click() {
		System.out.println("click on element");
	}
	public  static void quit() {
		System.out.println("close the broiwser");
	}

}
