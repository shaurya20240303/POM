package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylisttest {

	public static void main(String[] args) {
		//ArrayList-default class-->dynamic array
		//size is not fixed
		
		ArrayList  ar =new  ArrayList();
		ar.add(100);
		ar.add(52);
		
		System.out.println(ar.size());
		
		ar.add(23);
		ar.add(65);
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		//System.out.println(ar.get(5));
	//	System.out.println(ar.remove(0));
	//	System.out.println(ar.remove(2));
		System.out.println(ar.size());
		Collections.sort(ar);
	System.out.println(ar);	
	Collections.sort(ar,Collections.reverseOrder());
	System.out.println(ar);

	}

}
