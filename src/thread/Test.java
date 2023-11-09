package thread;

public class Test extends Thread{
//  학생과 상관없이 30번쨰까지 추출하는 것
//  그 값들을 더하는 계산식 

// main
// 학생 1, 학생 2를 지정
// 각 쓰레드가 겹치지 않도록 join()
// 합계를 출력시키면 될 듯.
// 누가 더 합계가 큰지 계산. 

	String name; 
	int sum =0;
	
	public Test(String name) {  // 학생 1,2 넣어주는 생성자 -> 학생초기화 해줌 
		this.name = name;
	}
	
	public void run() {
	//  학생과 상관없이 30번쨰까지 추출하는 것
			for(int i=0;i<30;i++) {
				int k =(int)(Math.random()*20)+1;
				System.out.println((i+1)+"번째 추출_ "+name +" : "+ k);
				sum +=k;   //  그 값들을 더하는 계산식 
			}
			System.out.println("총합 : "+sum);
		
		}
}
