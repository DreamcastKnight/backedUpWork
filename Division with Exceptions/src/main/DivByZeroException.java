package main;

public class DivByZeroException extends ArithmeticException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	 public DivByZeroException(){
	        super();
	    }

	    public DivByZeroException(String message){
	        super(message);
	    }
	
}
