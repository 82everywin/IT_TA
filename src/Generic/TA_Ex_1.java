package Generic;

import java.util.ArrayList;
import java.util.Scanner;

public class TA_Ex_1 {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>() ;
		
		System.out.print("양의 정수를 입력해주세요 >>> ");
		while(true) {
			int n = sc.nextInt();
			
			list.add(n);
			
			if( n == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("양의 정수를 입력해주세요 >>> ");
		}
		System.out.println("저장된 리스트 : "+ list.toString());
		
		int max=list.get(0);
		for(int i =1; i<list.size();i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		System.out.println("가장 큰 수 : " + max);
	}

}
