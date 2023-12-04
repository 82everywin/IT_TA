package Lv_2_MBTI;

import java.util.InputMismatchException;

public class InputException extends InputMismatchException {
	String message; 
	
	
	
	public InputException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
