package exception;

public class employee {
	//throws keyword only passing the exception one method its caller method
	//throw-> to throw your own custom exception.
	//exception is coming or not its always  come to inside finally block
	//error->stack overflow error ,out of memory error, verify error,assertion error
	//stack over flow error create when infinite calling happen
	//we can handle exception and error  with try and catch block
	//error vs exception -->throwable->object
	//exception ->run time exception and compile time exception
	//RT(checked) exception->AIOB,null point exception, AE
	//compile(unchecked) exception :IO(file not found exception),interrupted exception(thread.sleep)
 //exception:we have written wrong code 9/0, reference is pointing to null
	//error is coming due to infrastructure stack overflow error ,memory leakage
	public static void main(String[] args) {

     System.out.println("a");
     System.out.println("a");
     System.out.println("a");
     try {
     int i=9/0;
     }catch(ArithmeticException e) {
    	 //report 
    	 System.out.println("AE is coming");
    	e.printStackTrace(); //provide complete history about the the exception 
     }
     System.out.println("byhsdd");
     System.out.println();
	}

}
