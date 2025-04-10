package javasession;
public class mathoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		System.out.println(a/2);
		System.out.println(9/2); //4
		
		System.out.println(9.0/20);
		System.out.println(9/2.0);
		

		System.out.println(9/0); //AE
		System.out.println(0/9); //0
		System.out.println(9/0.0); //Infinity
		System.out.println(9.0/0); //infinity
		System.out.println(9.0/0.0);//infinity
		
		System.out.println(0.0/0.0);//NaN: not a number
		System.out.println(0/0.0); //NaN
		System.out.println(0.0/0); //NaN
		System.out.println(0/0); //AE its arithmetic exception
		
	}

}
