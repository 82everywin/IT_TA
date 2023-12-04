package Lv_2_MBTI;

import java.util.InputMismatchException;

public class InputException extends Exception {
	String message; 
	
	public InputException(String msg) {
		message = msg;
	}
	
	public String getMessage() {
		return this.message;
	}

}
