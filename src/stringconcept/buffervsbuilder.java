package stringconcept;

public class buffervsbuilder {

	public static void main(String[] args) {
		
		//string,stringbuilder and stringbuffer --classes implements charsequence
		//stringbuilder and buffer both are mutable
		StringBuilder sb=new StringBuilder("hello"); //it is mutable 
		sb.append("automation");
		System.out.println(sb);
		
		StringBuffer sf=new StringBuffer("hi"); //mutable
		sf.append("cypress");
		System.out.println(sf);
		
		String s="bye";  //immutable
		s.concat("trstting");
		System.out.println(s);

	}

}
