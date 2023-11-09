package thread;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Random_Quiz {
	
	public static void main(String[] args) {
		
		Quiz q = new Quiz();
		q.start();
	}

}

class Quiz extends Thread{
	public void run() {
	quiz();
	}
	
	int cnt =1;
	
	public void quiz(){
		Random ran = new Random();
		
		long start = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		
		while(cnt <= 5) {
			int x = ran.nextInt(99)+1;
			int y = ran.nextInt(99)+1;
			
			System.out.println(x+ " + " + y + " = ");
			
			int total = 0;			
			try {
				
				total = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(" 숫자 다시 입력 !!");
				sc.nextLine();
				continue;
			}
			
		
			
			if(x+y == total) {
				System.out.println("정답!" + cnt);
				cnt++;
			}
			else { 
				System.out.println("오답! ");
			}
		}
		System.out.println(" 게임이 종료되었습니다. ");
	}

}