package javasession;

public class stringConcept {

	public static void main(String[] args) {
		//String : is a class : in built
		
		String s="hello selenium";
		System.out.println(s);
		
		System.out.println("hello world");
		
		String s1="100";
		System.out.println(s1 + 20); //concantenation
		
		int a=100;
		int b=20;
	    String x="hello";
	    String y="Selenium";
	    
	    System.out.println(a+b); //120 :addition
	    System.out.println(a+x); //100hello concate
	    System.out.println(x+a); //hello100 concate
	    System.out.println(a+b+x+y); //120helloselenium  add and concatenation
		System.err.println(x+y+a+b); //helloselenium10020
		
		System.out.println(x+y+(a+b)); //helloselenkium300
		
		System.out.println("the value of a is " +a);
		System.out.println("the value of b is "+b);
		
		

	}

}
