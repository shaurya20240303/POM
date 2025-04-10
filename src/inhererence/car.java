package inhererence;


//final keyword provide contant value
//final class :to prevent inheretance :it can not be a parent class 

public class car  extends vehicle{
	int speed=200;
	
	
	
	
   public void start() {
	   System.out.println("car---start");
   }
   public void stop() {
	   System.out.println("car---stop");
   }
   public void refual() {
	   System.out.println("car---refual");
   }
   //final method can not be overridden
   //but we can inherit parent method using final keyword method
   //usecase real app:where logo of the company where we can use this final method
   public final void increaseSpeed() {
	   System.out.println("car---increaseSpeed");
   }
	
 //static method can not be overridden
   public static void billing() {
	   System.out.println("car---billing");
   }
 //private static method can not be overridden
   private static void getcarinfo() {
	   System.out.println("car---getcarinfo");
   }
	
}
