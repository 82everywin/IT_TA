package Try_Catch;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나눌 수 입력: ");
		String inputNum1 = scan.nextLine();
		System.out.print("나누어 지는 수 입력: ");
		String inputNum2 = scan.nextLine();
		
		try {
			//입력한 문자열을 정수로 변환하고
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			//num2를 num1으로 나눈 몫
			int result = num2/num1;
			//num2를 num1으로 나눈 나머지
			int result2 = num2%num1;
			
			System.out.println(num2+" 를 "+num1+" 으로 나눈 몫: "+result);
			System.out.println(num2+" 를 "+num1+" 으로 나눈 나머지: "+result2);
			
			System.out.println("작업 성공입니다.");
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}finally { //예외가 발생 하던 안하던 실행이 보장되는 블럭
			System.out.println("finally문이 정상 실행되었습니다.");
			
		}
		
		System.out.println("main 메소드가 정상적으로 작동하였습니다.");
	}
}
