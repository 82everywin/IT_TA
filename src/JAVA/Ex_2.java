package JAVA;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num!=0) {
			for (int i =1; i<=num;i++) {
				if(num%i==0) {
					System.out.printf(i+" ");
				}
			}
			System.out.println();
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
		}
	}
}
