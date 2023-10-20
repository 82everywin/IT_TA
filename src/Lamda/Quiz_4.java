package Lamda;

import java.util.Scanner;

public class Quiz_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값을 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 값을 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.print("연산기호");
		char ch = sc.next().charAt(0);
		
		int result ;
		if(ch=='+') {
			result = num1 + num2;
		}else if(ch=='-') {
			result = num1-num2;
		}else if(ch == '*') {
			result = num1 * num2;
		}else {
			result = num1 / num2;
		}
		
		System.out.println("연산 결과 : "+ result);
		
	}

}
