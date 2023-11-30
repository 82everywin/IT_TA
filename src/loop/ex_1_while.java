package loop;

public class ex_1_while {
	
	public static void main(String[] args) {
		
		// 1~10까지의 합
		int i =1;
		
		int sum = 0;
		while(i<=10) {
			sum +=  i;  //sum = sum + i
			System.out.println(sum);
			i++;
		}
	}

}
