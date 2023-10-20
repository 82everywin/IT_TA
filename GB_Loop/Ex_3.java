package GB_Loop;

import java.util.Scanner;

public class Ex_3 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("정수를 입력해주세요.>>");
				int num = sc.nextInt(); //입력받은 값
				 
				System.out.println(num+"의 약수");
				for(int i = 1; i <= num; i++)  {
					
					if (num % i == 0) {
						System.out.print(i+" ");
					}
					
				}
				
}

				
		
			}
                      


