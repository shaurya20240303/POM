package javasession;

public class incrementanddecrement {

	public static void main(String[] args) {
		//++ and --
		
		//post(later) increment
		int a=1;
		int b= a++;
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c=-98;
		int d=c++;
		System.out.println(c); //-97
		System.out.println(d); //-98
		
		//pre incremeent
		
		int e=1;
		int f=++e;
		System.out.println(e); //2
		
		int p =-999;
		int q=++p;
		System.out.println(p); //-998
		System.out.println(q); //-998
		
		//post decrement
		
		int x=2;
		int y=x--;
		System.out.println(x); //1
		System.out.println(y); //2
		
		//pre decrement
		
		int v=2;
		int w=--v;
		System.out.println(v); //1
		System.out.println(w); //1
		
		
		

	}

}
