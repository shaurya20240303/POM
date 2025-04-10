package Functins;

public class Employee {

	// method
	// 1 . can not create a function/method inside a function
	// function name can not be duplicate but it can be duplicate method overloading
	// type
	// 1.no input no return
	public void test() {
		System.out.println("test method");

	}

	// 2.no input but some return;
	public int add() {
		System.out.println("add method");
		int a = 10;
		int b = 5;
		int c = a + b;
		return c;

	}

	// 3.some input and return
	public int sum(int a, int b) { // a,b:input parameters
		System.out.println("sum method");
		int z = a + b;
		return z;
	}

	public String getcoursetrainer(String coursename) {
		System.out.println("select trainer");
		return coursename;

	}

	
	public static void main(String[] args) {
		System.out.println();
		Employee e1 = new Employee();
		System.out.println(e1.add());
		System.out.println(e1.sum(10, 02)); // values /arguments:call by value
		System.out.println(e1.getcoursetrainer("texsting"));
	}

}
