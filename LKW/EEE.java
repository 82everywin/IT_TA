package LKW;
import java.util.Scanner;
public class EEE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int computer =  (int)(Math.random() *100 +1);
		
		int n = 1;
		while(computer != a) {
				n++;
			if(computer > a) {
				System.out.println(" UP ");
		
			}else if(computer < a) {
				System.out.println(" DOWN ");
			}
				System.out.print("정수를 입력하세요 : ");
				a = sc.nextInt();
		}
		if(computer == a) {
			System.out.printf("정답입니다 %d 번 만에 맞추셨네요 !",n);
		}

	}
}
