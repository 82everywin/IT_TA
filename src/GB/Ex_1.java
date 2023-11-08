package GB;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산기호를 입력해주세요 : ");
		char i = sc.next().charAt(0);

		int result =0;
		/**
		if(i == '+') {
			result = num1 + num2 ;
			
		} else if (i == '*') {
				result = num1 * num2 ;
		} else if (i == '/') {
			result = num1 / num2 ;
		} else if ( i== '-') {
			result = num1 -num2 ;
		}
		**/
		
		
		switch(i) {
		case '+' :
			result = num1 + num2 ;
			break;
		case '-' :
			result = num1 -num2 ;
			break;
		case '*' :
			result = num1 * num2 ;
			break;
		case '/' :
			result = num1 / num2 ;
			
		}
		System.out.println("결과 : "+num1+i+num2+"="+result);
	
	//	System.out.println(result);		
	}
			
		
}

