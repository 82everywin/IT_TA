package Generic;

import java.util.HashSet;
import java.util.Scanner;

public class TA_EX_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> lotto = new HashSet<>();
		
		System.out.println("로또 생성 프로그램을 시작합니다. ");
		while(true) {
			System.out.println("[1] > lotto 생성, [2] > 종료");
			System.out.print("번호를 선택해주세요 >> ");
			int choice = sc.nextInt();
			if(choice ==1) {
				System.out.println("지금부터 로또를 생성합니다.");
				// 한줄 생성
				System.out.println("추첨된 로또번호는 다음과 같습니다.");
				for(int i =0; i<6;i++) {
					while(lotto.size()< 6) {
						int num = (int)(Math.random()*45 +1);
						
						lotto.add( num);
					}
					System.out.println(lotto);						
					lotto.removeAll(lotto);
				}
				System.out.println();
				
			}
			/*
			else if(choice == 2) {
				System.out.println("사용자가 번호 6개를 입력해주세요");
				for(int i =0; i<6;i++) {
					int num = sc.nextInt()	;	
				}
				System.out.println("입력을 종료합니다.");
				
			}*/
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
