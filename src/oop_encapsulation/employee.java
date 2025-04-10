package oop_encapsulation;

public class employee {
	//encapsulation means we can call public method that public method the can call internal private method or private variable so means hiding implementation using private method and variable and call public method its call encapsulation

	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null) {
			System.out.println("name cant be null");
		}
		
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {  //here using this condition we can control our login and funtionality
		//here setter is controliing the data
		if(age >=18) {
			this.age = age;
		}
		this.age=-1;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	//public method:getter /setter
	
	
}
