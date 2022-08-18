package com.cg.exceptionhandling;
@SuppressWarnings("serial")
class CustomException extends Exception {
	private int detail;
	//parameterized constructor
	public CustomException(int detail) {
		super();
		this.detail=detail;
	}
	public CustomException(String message) {
		super(message);
	}
	@Override
	public String toString() {
		return "CustomException [detail=" + detail + "]";
	}
}
public class UserException {
	private static String e;

	static void accept(int a) throws CustomException {
		System.out.println("CALLED COMPUTE");
		if(a>10) 
			throw new CustomException(e);
		System.out.println("NO EXCEPTION");
	}

	public static void main(String[] args) {
		try {
			accept(22);
		} catch (CustomException e) {
			System.out.println("SANDESH "+e);
		}

	}

}
