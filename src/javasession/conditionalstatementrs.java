package javasession;

public class conditionalstatementrs {

	public static void main(String[] args) {

		int a = 0;
		if (a > 5) {
			System.out.println("dccnd");
		} else {
			System.out.println("njdn");
		}

		// nested if else
		int marks = 00;
		if (marks >= 90) {
			System.out.println("grade A");
			if (marks >= 95) {
				System.out.println("grade A++");
			}
			if (marks == 100) {
				System.out.println("elligible for the scholership");
			}
		} else {
			System.out.println("failled");
		}

		// if comaring two primitive data types: ==
		// if comaring two non primitive data types : .equals
		String browser = "eddge";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("edge")) {
			System.out.println("launch edge");
		} else {
			System.out.println("plz pass the right browser" + browser);
		}

	}

}
