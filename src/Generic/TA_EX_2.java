package Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TA_EX_2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Map<String, Double> stu =new HashMap<> ();
		
		System.out.println("미래 장학금 관리 시스템입니다. ");
		
		for(int i =0; i<5;i++) {
			System.out.print("이름 >>");
			String name = sc.next();
			System.out.print("학점 >>");
			double grade = sc.nextDouble();
			
			System.out.println("=============");
			sc.nextLine();
			
			
			stu.put(name, grade);
			
		}
		System.out.println("정보 입력 종료");
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double search = sc.nextDouble();
		
		Set<Entry<String, Double>> set =stu.entrySet();
		System.out.print("장학생 명단 " );
		
		Set<String> key =stu.keySet();
	      Iterator<String> it = key.iterator();

	      System.out.print("장학생 명단 : ");

	      while(it.hasNext()){
	          String name = it.next();
	          double grade = stu.get(name);
	          if(grade >= search)
	              System.out.print(name+" ");
	      }
	}
}
