package Lamda;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		String bmistr="";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요(소수): ");
		double height = sc.nextDouble();
		double height1 = height / 100.0; // cm -> m 로 변환.
		
		System.out.print("체중를 입력하세요(소수): ");
	 double	weight = sc.nextDouble();
		
		double bmi =weight / (height1*height1);
		
		if(bmi <18.5) {
			bmistr="저체중";
		}else if(bmi >= 18.5 && bmi <23) {
			bmistr="정상";
		}else if(bmi >= 23 && bmi <25) {
			bmistr="과체중";
		}else if(bmi >= 25 && bmi <30) {
			bmistr="비만";
		}else {
			bmistr="고도비만";
		}
		
		System.out.printf("당신의 키는 %.2fcm\n몸무게는 %.2fkg\n"
				+ "BMI 지수는 %.1f\n %s 입니다.",height,weight,bmi,bmistr);
	}
}
