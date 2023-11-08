package GB_Loop;

import java.util.Scanner;

public class Ex_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 성적을 입력할까요 ? ");
		int student = sc.nextInt();
		int total=0;
		for(int i =1; i<=student; i++) {
			System.out.print("학생 "+i+" : ");
			int grade = sc.nextInt();
			total += grade;
			
			
			
		}
		System.out.print("총점은"+total+"점이고,");
		
		
		System.out.printf("평균은 %.1f점 입니다.",(float)total / student);
		
		
	}

}
