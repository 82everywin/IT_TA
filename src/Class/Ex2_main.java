package Class;

import java.util.Scanner;

public class Ex2_main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
	
	
		Grade grade = new Grade(math,science,english);
		System.out.println("평균은 " + grade.avg());
		
	}
}
