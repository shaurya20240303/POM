package javasession;

import java.util.Arrays;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		//object array:storess different type of data,but this is still a static array
		//emp data
		//for non primitive any class default value is null
		//name(string),age(int),salary(double),gender(char),is permenent(boolean)
   //object is class,object is super class of all class
		//size is fixed:static array:to overcome this issue,we have to use dynamic arrays:arraylist(collections) 
		Object emp[]=new Object[5];
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));
		emp[0]="naman";
		emp[1]=30;
		emp[2]=45.55;
		emp[3]='m';
		emp[4]=true;
		System.out.println(Arrays.toString(emp));
		
		Object emp1[]=new Object[5];
		System.out.println(emp1.length);
		System.out.println(Arrays.toString(emp1));
		emp1[0]="ravi";
		emp1[1]=30;
		emp1[2]=45.555;
		emp1[3]='f';
		emp1[4]=true;
		System.out.println(Arrays.toString(emp1));
	}

}
