package methodcalling;

public class Employee {
	String name;
	int age;
	
	public static void getInfo(Employee e2) {
		e2.name="rohit";
		e2.age=10;
		System.out.println(e2.name);
		System.out.println(e2.age);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.name="tom";
		
		e1.age=20;
		System.out.println(e1.name);
		System.out.println(e1.age);
		Employee.getInfo(e1);
		System.out.println(e1.name);
		System.out.println(e1.age);

	}

}
