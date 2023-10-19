package Lamda;

public class Ex1 {
	public static void main(String[] args) {

		// 객체를 따로 생성하지 않고 ( 즉, new를 통해서 메모리를 생성x) 
		// 바로 인터페이스의 메서드를 재정의 함. 
		
		// 여기서 인터페이스의 메서드가 여러개일 경우에는, 매개변수의 순서 등 혼란이 올 수 있기 때문에
		// 인터페이스1개, 메서드1개만 한정해
		MyCalc mycalc = (int num1, int num2)-> {
			return num1 + num2;			
		};
		
		int result = mycalc.plus(20,30);
		System.out.println(result);
		
	}
	
}
