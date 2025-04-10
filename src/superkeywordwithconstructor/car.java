package superkeywordwithconstructor;

public class car {

	
	String name;
	int price;
	
	public car() {
		System.out.println("--car--default const....");
	}
	
	public car(String name,int price) {
		System.out.println("--car--two const....");
		this.name=name;
		this.price=price;
	}
	

}
