package main;

public class DivWithZeroException extends ArithmeticException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivWithZeroException(){
        super();
	   }

	public DivWithZeroException(String message){
	        super(message);
	    }

}