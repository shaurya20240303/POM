package javasession;

import java.util.Arrays;

public class Arraymethods {

	public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=10;
		i[2]=20;
		i[1]=5;
		i[3]=6;
		
		System.out.println(i.length);
		System.out.println(i);  //emeory address for the array print ex:[I@6a6824be

		//print the array
		System.out.println(Arrays.toString(i));
		
		//print the value of array using loop
		for(int k=0;k<i.length; k++) {
			System.out.println(i[k]);
			if(i[k]==6) {
				System.out.println("hiii");
				break;
				
			}
			
		}
		System.out.println("---------");
		//string array:
		String browser[]=new String[4];
		browser[0]="chrome";
		browser[1]="FF";
		browser[2]="Edge";
		browser[3]="IE";
		System.out.println(Arrays.toString(browser));
		
		for(int e=0; e<browser.length-1; e++) {
			System.out.println(browser[e]);
			
			if(browser[e].equals("FF")) {
				System.out.println("launch IE");
				break;
			}
		}
		
		
		
	}

}
