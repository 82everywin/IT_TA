package JAVA;

import java.util.Scanner;

public class stud1 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);

		int scr, sum = 0, cnt = 0;

		System.out.print("몇명의 성적을 입력받을 것입니까? ");
		int a = scn.nextInt();
		
		int i = 1;
		while(i<=5){
		
			System.out.print("학생"+i+" : ");
			scr = scn.nextInt();

			sum += scr;
			i++;
		}

		System.out.printf("총점 : %d\n평균 : %.1f", sum, (float)sum/a);
	}
}
