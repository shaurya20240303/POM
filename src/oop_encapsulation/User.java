package oop_encapsulation;

//clrl +c
//pojo class:plain old java object

public class User {
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	public User(String name, int age, double salary, boolean isActive) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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

}
