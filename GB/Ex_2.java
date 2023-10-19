package GB;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :  ");
		int score = sc.nextInt();
		
		char grade=' ';
		if(score>0 && score<=100) {
			// 0~100점 까지의 점수
			if (score >=90) {
				grade= 'A';
				
			}else if(score >=80) {			
				grade= 'B';
			
			}else if (score >=70) {
				grade= 'C';
	
			}else if (score >=60) {
				grade= 'D';
			
			}else 
			{System.out.println('F');
			
			}
			System.out.println("학생 A의 등급은 " +grade+"등급입니다.");
		}
		else { // 0~100 이외의 점수
			System.out.println("점수가 잘못 입력되었습니다");
		}
		
	}
}
