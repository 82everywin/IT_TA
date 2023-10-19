package Lamda;

@FunctionalInterface // 람다식 전용 인터페이스임을 명시
public interface MyCalc {
	

	int plus(int num1, int num2);
	
	// 위 애너테이션을 넣는 순간, 1개의 인터페이스에서는 하나의 메서드만을 생성할 수 있게 제한. 
	// int minus(int num1, int num2);
}
