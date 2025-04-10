package methodcalling;

public class User {
	//StackOverflowError:when infinite calling happen then this StackOverflowError create
	//when stack memory become full and deallocation is not happening in stack memory.means ending is not happening
	//lifo -last in first out
	//execulation takes memory thats call statck memory for 
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		m1();
	}

	public static void main(String[] args) {
		User u1=new User();
		u1.m1();
		
		//NS->S:use class name
		//S->NS:create object, use object ref name now call by reference
		//s-s:class name
		//NS->NS: call the directly(no need to craete extra object)

	}

}
