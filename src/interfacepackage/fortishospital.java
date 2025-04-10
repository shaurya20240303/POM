package interfacepackage;

public class fortishospital implements UDSmedical,UKmedical,Indianmedical{

	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
		
	}

	@Override
	public void oncologyServices() {
		
		System.out.println("FH---oncologyServices");
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("FH---dentalServices()");
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		System.out.println("FH---orthoServices");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("FH---neuroServices");
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH---cardioServices");
	}

	@Override
	public void gyncServices() {
		// TODO Auto-generated method stub
		System.out.println("FH---gyncServices");
	}
  
	//common
	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		System.out.println("FH---emergencyServices");
	}
	//individual
	public void medicalTraining() {
		System.out.println("FH---medical training");
	}
	public void OPTservices() {
		System.out.println("FH---opt services");
	}

}
