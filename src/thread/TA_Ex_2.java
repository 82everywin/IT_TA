package thread;

public class TA_Ex_2 {
	public static void main(String[] args) {
		Ex2_Test test =new Ex2_Test();
		test.start();
		
	}
 
}

class Ex2_Test extends Thread{
	
	public void run() {
		System.out.println(" *** 실행 시작 *** ");
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			return;
		}
		System.out.println(" *** 실행 종료 *** ");
	}
}
