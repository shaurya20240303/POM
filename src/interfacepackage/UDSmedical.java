package interfacepackage;

public interface UDSmedical {
     //interface var are static and final in nature by default
	//in ineterface we can not define the method body
	//no method body,no method implementation
	//only method declaration-only method prototype
	//Abstract method-no method body
	//can not create object of the interface
	//can not create the const..of the interface
	// 100% abstraction:hiding the implementation
	
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	public void emergencyServices();
	//after jdk1.8 there are two major changes in interface
	//we can have a method with body:but it should be static method
	public static void medicalbilling() {
		System.out.println("us--medicalbilling");
	}
	
}
