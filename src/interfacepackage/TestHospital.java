package interfacepackage;

public class TestHospital {

	public static void main(String[] args) {
		fortishospital fh=new fortishospital();
		fh.physioServices();
		fh.dentalServices();
		fh.neuroServices();
		fh.gyncServices();
		fh.emergencyServices();
		UDSmedical.medicalbilling();
		//top casting : child class object can be rerefred  by the parent interface ref variable
		UDSmedical us=new fortishospital();
		us.dentalServices();
		us.emergencyServices();
		us.dentalServices();
		us.physioServices();

	}

}
