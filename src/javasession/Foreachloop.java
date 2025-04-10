package javasession;

public class Foreachloop {

	public static void main(String[] args) {
		int i[]= {10,20,30,40};
		//index loop
		for(int k=0;k<=i.length-1;k++) {
			System.out.println(i[k]);
			
			System.out.println("--------");
			//for each loop
			for(int e:i) {
				System.out.println(e);
			}
			
			
			
			
		}
	}

}
