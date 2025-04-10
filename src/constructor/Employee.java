package constructor;

public class Employee {
	
	String name;
	int age;
	String city;
	boolean isactive;
	double salary;
	//form usecase
	//constructor:
	//name:will be same as class name
	//const is not a function(it looks like a function)
	//const can never have any return type,no void ,no return keyword
	//const  can have params
	//const will be called when you create the object but function will be called usinhg obj reference variable.
	//if the default const.. is not available in the class ,then jvm will add one default const.. in the class at the runtime
	//const..can be overloaded	
	
// const.. is helping to construct the object properly
	//const.. is helping to prevent unnecesary object creation
	//const..is helping to initialize the class instance variable to the local variable using this keyword
	//inside constructor we never write business logic because it will be called when you create the object
	//and const.. will never
	public Employee() {
		
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="raj";
		e1.age=20;
		e1.city="hamiltion";
		e1.isactive=true;
		e1.salary=13.56;
		
		Employee e2=new Employee();
		e2.name="raj";
		e2.age=20;
		e2.city="hamiltion";
		e2.isactive=true;
		e2.salary=13.56;
		
		
		Employee e3=new Employee();
		e3.name="raj";
		e3.age=20;
		e3.city="hamiltion";
		e3.isactive=true;
		e3.salary=13.56;
		
		

	}

}
