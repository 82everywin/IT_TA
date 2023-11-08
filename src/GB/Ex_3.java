package GB;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("노동 시간을 입력하세요 :");
		int lavor = sc.nextInt();
		int pay = 10000;
		int time = 15;
		
		if (lavor <=15) {
			System.out.println(pay * lavor);
		}
		else if (lavor > 15) {
			System.out.println("총 임금은 "+(int)((15 * pay) + (1.5 * pay * (lavor - 15)))+"원 입니다.");
		}
		
		
		
	}

}
