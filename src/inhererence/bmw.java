package inhererence;

public class bmw extends car{
	//
   //method overiding:polymorfism->its dynamic ,its runtime polymirfusm --here decision will be taken at runtime(JVM)
	//when we have a method in a parent class and the same method in a child class
	//1. with the same name
	//2.with the same number of parameters
	//3,with the same return type
	
	@Override
	public void start() {
		   System.out.println("bmw---start");
	   }
	
	public void autoparking() {
		   System.out.println("bmw---autoparking");
	   }
	//this is not overridden method from the class
	//method hiding:its related to static method,if any static method in parent class and same static method in child class known as method hiding
	
	//static method can not be overridden
	 public static void billing() {
		   System.out.println("bmw---billing");
	   }
	 //individual
	 private static void getcarinfo() {
		   System.out.println("car---getcarinfo");
	   }
	 public static void getbmwinfo() {
		 getcarinfo();
		  // System.out.println("car---getcarinfo");
	   }
}
