package Lamda;

public class Ex3 {
	public static void main(String[] args) {
		// int num1, int num2 -> num1, num2 로 자료형 생략 가능 ( 인터페이스 통해서 정해짐(확인가능==유추가능))
		
		MyCalc calc=(num1, num2) -> {
			return num1 + num2;
		};
		
		// return 유추 가능 -> 생략가능
		// 단, 중괄호도 제외
		MyCalc calc2 = (num1, num2)-> num1 + num2;
	
		// 길게 num1, num2 -> 짧게 x, y
		MyCalc calc3 = (x,y) -> x+y ;
		
		// 매개 변수 1개일 경우, 괄호 생략 가능
		// 단, 자료형 표기 할 때에는 괄호 생략 불가 
		// 매개변수의 변수명은 변경 가능 ! 
		MyFunction myfunc  = x -> x*2;
		
		MyFunction2 myfunc2 = x -> System.out.println(x);

		//매개 변수가 1개일 때는 충분히 예상 가능 
		// (int num) -> System.out.println(x);
		// System.out::println;
		MyFunction2 myfunc3 = System.out::println ;
		
		
		
		System.out.println(calc.plus(2,3));
		System.out.println(calc2.plus(3, 3));
		System.out.println(myfunc.method(3));
		myfunc2.Method(10);
		myfunc3.Method(30);
		
	}

}
