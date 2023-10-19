package Ex1;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		System.out.print("월을 선택해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		int result = 0;
		switch (month) {
		 
		case 1,3,5,7,8,10,12 :
			//31
			
			System.out.println(result);
			System.out.printf("%d월은 %d일 까지입니다.",month,31);
			break;
			
		case 2:
			//28
			System.out.printf("%d월은 %d일 까지입니다.",month,28);
			break;
		default:
			//30	
			System.out.printf("%d월은 %d일 까지입니다.",month,30);
			break;
		}
		
		
	}

}
