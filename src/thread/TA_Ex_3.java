package thread;

import java.util.Scanner;

public class TA_Ex_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex3_Test th = new Ex3_Test();
	
		th.start();
		
		while(true) {
			
			int s = sc.nextInt();
			
			break;
		}
		th.interrupt();
		
	}
}


class Ex3_Test extends Thread{
	
	
	public void run() {
		System.out.println("10초 내로 숫자를 입력해주세요.");
		
		int i =0;
		while(i<10 && !isInterrupted()) {
			System.out.println((i+1)+"초가 지났습니다.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				interrupt();
				System.out.println("사용자가 입력하였으므로 종료합니다.");
			}
			i++;
		}
		
		System.out.println("끝!!! 종료합니다.");
		
	}
	
}