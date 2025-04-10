package methodoverloading;

public class callbyreference {
	public void m1() {
		System.out.println("m1 method");
	}

	public void m2() {
		System.out.println("m2 method");
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void t1(callbyreference ob) {
		System.out.println("t1 method");
		//t1(static)-->m1(non static)
		ob.m1();
		
	}

	public static void t2() {
		System.out.println("t2 method");
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public static void main(String[] args) {

		
		
		callbyreference obj=new callbyreference();
		obj.m1();
		
		//main-->t1
		callbyreference.t1(obj);  //call by reference
	}

}
