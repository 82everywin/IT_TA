package Lv_2_MBTI;

import java.util.InputMismatchException;

public class MainTest {

	
	public static void main(String[] args) {
		
		
		MBTI mbti = new MBTI("홍길동");
		try {
			
			mbti.starttest();
			mbti.result();
		}catch (InputException e) {
		System.out.println(e.getMessage());
		}
	}
}
