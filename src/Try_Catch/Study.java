package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study {
	
	 public void multiple() {
		 while (true) {
	            try {
	                int number = readNumber();
	                System.out.printf("%d에 2를 곱하면 %d 입니다.", number, number * 2);
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("[ERROR] 숫자를 입력해주세요.");
	            }
	        }
				
	 }

	    private int readNumber() {
	    	
	        System.out.print("숫자를 입력해주세요 : ");
	        Scanner scanner = new Scanner(System.in);
	        int number = scanner.nextInt();
	        return number;
	    }

}
