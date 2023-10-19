package Ex1;

import java.io.InputStream;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력을 받을 함수
		System.out.print("국어 : ");
		int kor = sc.nextInt(); //정수로 입력받음
		System.out.println(kor);
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.println(eng);
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println(math);
		
		int kor1 = 80;
	
		int sum;
		sum = kor + eng + math;
		
		System.out.println("합계 : "+sum);
		
		float avg = sum/3f;
		
		System.out.println( "평균 : " + avg);
		
		
		String result = ((kor>=40)&&(eng>=40)&&(math>=40)&&(avg>=60))?"합격" :"불합격";
		System.out.println(result);
	}


	
}
