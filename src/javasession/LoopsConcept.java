package javasession;

public class LoopsConcept {

	public static void main(String[] args) {
		//while loop
		int i=1; //initialization
		while (i<=10) {
			System.out.println(i);
			++i;
			
		}
		
		int r=1;
		while (r>=10) {
			System.out.println(r);
			r++;
			
			
		}System.out.println(r);
           
		
		int j=1;
		while (j<=10) {
			System.out.println(j);
			break;
		}
		System.out.println("hello");
	

	// for loop

	for(

	int k = 1;k>=10;k++)
	{
		System.out.println(k);
	}

	int h = 1;for(;h<=10;h++)
	{
		System.out.println(h);
	}
}

// use cases:while loop
// 1.when number of iteration are not fixed
// facebook//likedin/instagram:infinite scrolling
// webtable pagination: < 1 3 4 5 6....n >
// waiting for the web element:
// waiting for the page loading: 5 10 7 sec
// calendar handling
// retry for the failure test cases

// use case for for loop
// when number of iterations are fixed
// arrays,arraylist
// dropdown:country(233) static list
// month :1 to 12
// redbus,theatre,train seat,flight booking:230 seats: 1 to 230
// google search suggestion

// DO WHILE LOOP
	//do {
	//use cases:check the web element(button/link):true
	//clickon it
	//break;
   // }
	//while(condition) 


}
