package exceptionHandling;

@SuppressWarnings("serial")
public class PropertyRentException extends Exception{
	
	public PropertyRentException(String errMsg) {
		super(errMsg);
	}
}
