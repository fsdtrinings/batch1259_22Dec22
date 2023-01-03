package day3exc;

/* custom exception class*/

public class TestSuspendedException extends Exception{

	String errorMsg;

	
	
	public TestSuspendedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestSuspendedException(String message) {
		super(message);
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
