package methodcalling;

public class CallByRefernce {
	
	public void m1() {
		System.out.println("m1 method");
		
	}
	public void m2() {
		System.out.println("m2 method");
	
	}
	public void m3() {
		System.out.println("m3 method");
		
	}
	public static void t1(CallByRefernce obj) {
		System.out.println("t1 method");
		//t1(static)->m1(non static)
		//if we trying to use obj object reference we cant use directly here because obj object reference only use for main method only as per current condition
	    //we are passing here main method object reference supply to this (t1) static method-
		//here we trying to avoid object creation using this call by reference
		obj.m1();
		
	}
	public static void t2(CallByRefernce obj) {
		System.out.println("t2 method");
		obj.m2();
	
	}
	public static void t3() {
		System.out.println("t3 method");
	
	}
	

	public static void main(String[] args) {
		CallByRefernce obj=new CallByRefernce();
		//Static ->non  static
		obj.m1(); //here Static method call non static method so we created object of the class
		
		//main->t1=static to static call -->using class name
		CallByRefernce.t1(obj); //using class name we can call static to static
		

	}

}
