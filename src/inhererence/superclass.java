package inhererence;

public class superclass extends superKeyword {
	//in class:multiple inheritance not allowed
	//multilevel inheretance is allowed

	int speed =200;
	@Override
	public void start() {
		super.start();
		   System.out.println("car---start");
	   }
}
