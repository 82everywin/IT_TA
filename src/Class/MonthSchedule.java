package Class;

import java.util.Scanner;

public class MonthSchedule {
	int Month;
	int day ;
	String to_do;
	
	Scanner sc = new Scanner(System.in);
	 

	public MonthSchedule(int Month) {
		this.Month = Month;
	}
	
	//Day[] month = new Day[];
	
	//할일 입력
	public void input() {
		System.out.print("할일(빈칸없이 입력)");
		to_do = sc.next();
		
	}
	
	public void view() {
		System.out.println(day+"의 할 일은 "+to_do+"입니다.");
	}
	
    
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램 ");
		System.out.print("할일 (입력:1, 보기:2, 끝내기:3) >> ");
		int num = sc.nextInt();
		while (num ==1 || num == 2) {
			System.out.print("날자(1일~30일)");
			day = sc.nextInt();
			//month[day]= ;
			
			System.out.print("할일 (입력:1, 보기:2, 끝내기:3) >> ");
			num = sc.nextInt();
		}
		
	}
}
