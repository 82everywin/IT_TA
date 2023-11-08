package Ex1
;

public class Ex6_Array {
	public static void main(String[] args) {
		//향상된 for문
		//향상된 for문은 JDK1.5부터 새롭게  추가된 기능으로 배열의 모든 요소를
		//참조하기 위한 반복문이다.
		
		//for(변수 : 배열명){
		//   명령
		//{
		
		//for문을 실행할 반복 대상(배열)이 있으면 변수는 반복대상이 지닌
		//데이터의 자료형과 같은 타입으로 지정해야 한다.
		//반복 대상의 요소를 하나씩 꺼내서 변수에 대입하고, 반복 대상의 크기만큼
		//반복한다.
		
		int [] score = {90,92,93};
		
		int sum = 0;
		double avg = 0;
		
		for(int i : score) {
			sum +=i;
		}
		avg = (double)sum/3;
		
		System.out.println("총합 :" + sum+ ", 평균 : " +avg
				);
	
	}

}
