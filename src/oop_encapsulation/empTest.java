package oop_encapsulation;

public class empTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee();
		e1.setName("tome");
		e1.setAge(30);
		e1.setSalary(23.44);
		e1.setActive(true);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		if(e1.getAge()==-1) {
			System.out.println("noy eligible for hiring");
		}
		
		System.out.println(e1.getSalary());
		System.out.println(e1.isActive());
		
		LoginPage lp=new LoginPage();
		lp.setUsername("naveen");
		lp.setPassword("naveen123");
		
		

	}

}
