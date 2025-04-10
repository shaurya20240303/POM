package oop_encapsulation;

public class browser {
	public void launchBrowser() {
		System.out.println("launchBrowser");
		
		checkBrowserExist();
		checkBrowserVersion();
		checkBrowserCompatible();
		checkBrowserUpdates();
		System.out.println("browser is launched");
	}
	private void checkBrowserExist() {
		System.out.println("checkBrowserExist");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	private void checkBrowserCompatible() {
		System.out.println("checkBrowserCompatible");
	}
	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates");
	}

}
