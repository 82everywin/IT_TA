package JAVA;

import java.util.Scanner;

public class Num_Quiz {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int com = (int)(Math.random()*100 +1);
		int count = 1;
		while(true) {
			System.out.print("정수를 입력해주세요 : ");
			int user = sc.nextInt();
			
			if(com == user) {
				System.out.printf("정답입니다! %d번 만에 맞추셨네요!",count );
				break;
			}else if(com > user) {
				System.out.println("up");
			}else if(com < user) {
				System.out.println("down");
			}
			count++;
		}
		
		
	}
}
