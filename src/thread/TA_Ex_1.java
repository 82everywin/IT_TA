package thread;

import java.util.Random;
import java.util.Scanner;

public class TA_Ex_1  {
	
	public static void main(String[] args) {
		Test th1 = new Test("학생1");
		Test th2 = new Test("학생2");
		try {
		th1.start();
		th2.start();
		
		// 쓰레드 자신이 하던 작업을 잠시 멈추고 다른 쓰레드가 지정된 시간동안
		// 작업을 수향하도록 할 때 join()을 사용한다.
		th1.join();
		th2.join();
		
		System.out.println("********* 학생 1 총합 : "+th1.sum+ "***********");
		System.out.println("********* 학생 1 총합 : "+th2.sum+ "***********");
		if(th1.sum>th2.sum)
		{
			System.out.println("학생 1의 합이 더 큽니다.");
		}
		else if(th1.sum < th2.sum)
		{
			System.out.println("학생 2의 합이 더 큽니다.");
		}
		else
		{
			System.out.println("두 수의 합이 같습니다.");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

