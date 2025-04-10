package oop_encapsulation;

public class UserTest {

	public static void main(String[] args) {
		User u1=new User("naman", 35, 34.55, true);
		
		
		System.out.println(u1.getName()+ " "+u1.getAge()+" "+u1.getSalary()+" "+u1.isActive());
		

	}

}
