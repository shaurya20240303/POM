package staticconcept;

public class car {
	String name;
	int price;
	String model;
	int wheels;
	
  // final we use for constant  value for specific variable.
	
	//static we use for common property value and hold one copy in the memory
	//static only for class(global) variable
	public static void main(String[] args) {
		
		//static 
		//object will never hold static property
		//local variable can be final but not static
		//metaspace is dynamic memory in nature
		

		car c1=new car();
		c1.name="bmw";
		c1.price=50;
		c1.model="x3";
		c1.wheels=4;
		
		car c2=new car();
		c2.name="Adi";
		c2.price=55;
		c2.model="q3";
		c2.wheels=4;
		
		car c3=new car();
		c2.name="honda";
		c2.price=56;
		c2.model="ciry";
		c2.wheels=4;
		
	}

}
