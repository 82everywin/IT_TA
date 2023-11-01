package Try_Catch;

public class Ex1 {

	public static void main(String[] args) {
		
		try {
		for(int i = 9; i >=0 ;i--) 			
			System.out.println(10 % i); 	
		
		}catch(Exception e) {
			System.out.println("오류 원인 : " +e);
		}finally {
			System.out.println("항상 실행되는 실행문 ");
		}
	}
}
