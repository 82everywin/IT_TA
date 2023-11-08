package Ex1;

import java.util.Scanner;

public class Ex5_Array {

	public static void main(String[] args) {
		
		//프로그램이 실행되면 배열의 크기를 몇으로 할껀지
		//키보드에서 입력받는다.
		
		//입력받은 크기만큼 알파벳 출력하기
		
		//ex)5를 입력받았다면
		//ABCDE
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의길이는몇으로?");
		int n = sc.nextInt();

		//크기가 n개인 문자형 배열
		//아직 아무런 값도 들어있지않다.
		char[] c = new char[n];
		char ch = 'A';
		for(int i = 0; i < c.length; i++) {
			System.out.print((c[i] = ch++) +" ");
		}

		
		
	}

}
