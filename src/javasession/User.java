package javasession;

public class User {
     //class varibles:global
	 String name;
	 int age;
	 String city;
	 boolean isactive;
	 double salary;
	 
	 
	public static void main(String[] args) {
		
        //local variables
		//create the object of the user class:using new keyword
		
		User u1=new User();  
		//User:class
		//new User():object
		//u1:object reference variable name
		
		System.out.println(u1.name +" "+u1.age +" " +u1.city +" "+u1.salary +" "+u1.isactive);
		u1.name="suresh";
		u1.age=20;
		u1.city="palanpur";
		u1.isactive=true;
		u1.salary=19.99;
		
		System.out.println(u1.name +" "+u1.age +" " +u1.city +" "+u1.salary +" "+u1.isactive);
		
		
	}

}
