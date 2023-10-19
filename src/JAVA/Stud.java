package JAVA;

import java.util.Scanner;

public class Stud {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int i, scr, sum = 0, cnt = 0;

		System.out.print("몇명의 성적을 입력받을 것입니까? ");
		int a = scn.nextInt();

		for( i=1; i<=a; i++)
		{
			System.out.print("학생"+i+" : ");
			scr = scn.nextInt();

			sum += scr;
		}

		System.out.printf("총점 : %d\n평균 : %.1f", sum, (float)sum/a);
		
	}
}
