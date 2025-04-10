package stringconcept;

public class stringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hi this my java code and i am so happy";
		System.out.println(str.length());
		System.out.println(str.charAt(3)); //SIOB
		System.out.println(str.indexOf('m'));
		System.out.println(str.indexOf(2, 'j'));
		
		
		//trim
		String sr="    helllo selenium   ";
		System.out.println(sr.trim());
	}

}
