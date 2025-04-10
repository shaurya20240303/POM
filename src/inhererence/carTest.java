package inhererence;

public class carTest {
	//we cant extends all more than one parent

	public static void main(String[] args) {
		
		//WebDriver driver=new ChromeDriver();
		bmw b=new bmw();
		b.start(); //child(BMW) -overridden
		b.stop();//parent
		b.refual(); //inherited
		b.autoparking(); //indivudual
		b.engine(); // overridden
		b.billing();//individual
		car.billing();
		
		
		audi au=new audi();
		au.start();
		au.stop();
		au.autothept(); //indivudual
		au.refual(); //
		au.engine();
		
		car c=new car();
		c.start();
		c.stop();
		c.stop();
		c.engine();
		
		truck tr=new truck();
		tr.loading();
		//top casting
		//child class object can be refereed by parent class ref variable
		car c1=new bmw();
		c1.engine();
		c1.refual();
		c1.start();
		c1.stop();
		
		c1.increaseSpeed();
		
		//child class object can be refered by grand parent ref varaible
		
		vehicle v1=new bmw();
		v1.engine();
	
		

	}

}
