package stringconcept;

public class contains {

	public static void main(String[] args) {
		//scp
		//1.string literals-->its create only in  scp
		//
		String s="hello world"; 
		
		//using new keyword w-->it create object in heap and scp both
		
		String s1=new String("selenium");
		System.out.println(s)
		;
		System.out.println(s1);
		
		System.out.println("-------------");
		String t1="hello world"; //1-scp
		String t2="hello world"; //0
		//inside string constant pool can not create duplicate value
		
		System.out.println(t1==t2); //true
		
		String t3=new String("hello world"); //heap 1 and scp 0
		
		String t4=new String("testing"); //heap 1 and scp 1
		String t5="testing"; //scp 0
		String t6="testing"; //scp 0
		String t7="testing"; //scp 0
		String t8="testing"; //scp 0
		
		String t9=new String("testing"); //heap 1 and scp 0
		System.out.println(t5==t6); //true
		System.out.println(t5==t7); //true
		System.out.println(t5==t8); //true
		
		System.out.println(t4==t9); //false  here it check memory address in heap
		
		System.out.println(t4.equals(t9)); //true here it check compare their value
		
		System.out.println(t5.equals(t6)); //true .equal method always check value and compare it
		
		// it more optimize memory using this technique scp 
		//string is most using variable
		
		
		
		
		

	}

}
