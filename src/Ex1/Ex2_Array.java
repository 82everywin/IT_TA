package Ex1;

public class Ex2_Array {

	public static void main(String[] args) {
		//배열의 초기값
		//배열은 생성과 동시에 데이터 자료형별로 기본값이 주어진다.
		//정수 : 0  int
		//실수 : 0.0  float
 		//문자형 :'' char
		//객체형 :null
		
		float[] intArray = new float[5];
		
		String[] strArray = new String[5];
		strArray[1]="str";
		int[] varArray = {1,2,3,4,5};
		
		System.out.println("intArray[0] :"+ intArray[0]);
		System.out.println("intArray[1] :"+ intArray[1]);
		
		System.out.println("strArray[0] :"+ strArray[0]);
		System.out.println("strArray[1] :"+ strArray[1]);
		
		System.out.println("varArray[0] :"+ varArray[0]);
		System.out.println("varArray[1] :"+ varArray[1]);
		
		
		

	}

}
