package LKW;
//입력받은 정수의 약수를 구하시오. (for문 사용)
import java.util.Scanner;
public class Ex_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 >> ");
	int a = sc.nextInt();

	for(int i =1; i<=a; i++) {
		if(a%i==0) {
			System.out.print(i);
		}
		
		}
		
		
	}
}
