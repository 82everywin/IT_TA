package Ex1;

public class Ex4_Array {



	public static void main(String[] args) {
		//배열 arr에 담겨있는 모든 값의 합을 출력하세요  : 1~10 까지의 ㅎㅂ
		//int으로 이루어진 배열 , 크기 : 10
		//결과 : XXX
		
		int [] ar = new int[10];


		int sum = 0;
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = i+1;
		}
		
		for(int j = 0; j <ar.length ; j++) {
			sum += ar[j];
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
