package javasession;

public class Switchcaseconcept {

	public static void main(String[] args) {
		String browser = "chrome";
		switch (browser) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("plz pass the right browser" + browser);
			break;
		}

	}

}


//use cases
//1 crossbrowser logic
//2 user role:rbac:seller,admin,partner,vender
//env:dev,qa,stage,uat,prod
//payment:cc,upi,paypal,stripe
//language:eng ,hindi,gujarati,hindi,punjabi
