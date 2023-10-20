package Lamda;

public class Ex2 {
	public static void main(String[] args) {
		int num3= 30;
		
		MyCalc cal = new MyCalc() { // 지역 내부 클래스와 성격이 같다고 보면 됨. 
			
			// 원래 인터페이스의 구현은
			// 오버라이딩(Override)를 통해서 미구현된 메서드를 구현시키는 것. 
			@Override
			public int plus(int num1, int num2) {
				// num3 = 40; //변경은 불가. => 지역 내부클래스 안, 메서드 안으로 들어올 경우 상수화(final)가 되어버림. (참조하고 있음) 
				return num1+num2 + num3; //지역변수를 사용은 가능 
			} 
			
		};
		int result = cal.plus(20,30);
		System.out.println(result);
		
	}
}
