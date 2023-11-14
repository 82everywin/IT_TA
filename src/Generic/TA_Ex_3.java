package Generic;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator; 

public class TA_Ex_3 {

	public static void main(String[] args) {
		
		Map <String, Integer> manage = new HashMap<>();
		Scanner sc = new Scanner( System.in);
		
		System.out.println("고객 포인트 관리 프로그램입니다. ");
		while (true) {
			System.out.print("고객 이름 >>");
			String name = sc.next();
			
			if(name.equals("종료")) {		// 프로그램 종료 
				break;
			}
			
			System.out.print(name + "님 포인트 입력 >>");
			int point = sc.nextInt();
			
			if(manage.containsKey(name)) {
				point += manage.get(name);
			}
			
			manage.put(name, point);
			
			Set<String> p_name = manage.keySet();
			Iterator<String> names = p_name.iterator();
		
			while(names.hasNext()) {
				String getName = names.next();
				System.out.print("["+getName+","+manage.get(getName)+"]");
				
			}
			System.out.println();
			//System.out.println(manage.toString());
			
		}
		Set<String> p_name = manage.keySet();
		Iterator<String> names = p_name.iterator();
	
		System.out.println("고객 포인트 관리 정보입니다. \n\n");
		while(names.hasNext()) {
			String getName = names.next();
			System.out.println("["+getName+","+manage.get(getName)+"]");
			
		}
		//System.out.println(manage.toString());
	}
	
	
}
