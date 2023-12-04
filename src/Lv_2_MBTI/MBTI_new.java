package Lv_2_MBTI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


// 리팩토링을 거친 클래스
public class MBTI_new {
	
	String name ;
	LinkedHashMap<String, Integer> Pers = new LinkedHashMap<String, Integer>();
	

	
	public MBTI_new(String name) {
		this.name = name;
	}
	
	public void starttest() throws InputException {
		Scanner sc = new Scanner(System.in);
		String[] MBTI_VS = {"쉬는 시간이 생겼을 때", "엘리베이터를 탔을 때","친구가 차사고가 났다고 연락이 왔을 때","친구들과 함께 간 여행, 숙소에서 짐을 풀고 나가자! 했을 때"};
		String[] requests = {"1. 집에 혼자 있는 걸 좋아한다.  2. 나가서 사람들과 어울리는 걸 좋아한다",
				"1. 엘리베이터는 이동수단일 뿐, 중간에 서지 않고 빨리만 올라갔으면 좋겠다.  2. 사고가 나면 어떻게 탈출을 해야하지?",
				"1. 보험은 들었어?  2. 어떻게 다친 데는 없어?",
				"1. 어디가게?정하고 나갈까?  2. 일단 나가서 생각하자!"};
		
		System.out.println("==== "+ name+"님의 MBTI 검사를 진행합니다. =====");
		
		int i =0;
		int ch = 0;
		while(i<MBTI_VS.length) {
				System.out.println("질문 " +(i+1) + "번 >> "+MBTI_VS[i]);
				System.out.print("1과 2 중 선택 >>");
				try {
					ch =  sc.nextInt();
				}catch(InputException e) {
					throw new InputException("잘못입력했습니다");
				}
				
				if(i==0) Pers.put("E/I", ch); 
				else if( i==1)Pers.put("S/N", ch);
				else if(i==2) Pers.put("T/F", ch);
				else if(i==3)Pers.put("J/P", ch);
				
		}
		
	

		
	}
	
	public void result() {
		Set<String> keySet = Pers.keySet();
		
		Iterator<String> it = keySet.iterator();
		String str = "";
				
		while(it.hasNext()) {
			String key = it.next();
			int value = Pers.get(key);
			if(key.equals("E/I")) {
				if (value == 1) {
					str += "I";
				}
				else {
					str += "E";
				}
			}
			else if(key.equals("S/N")) {
				if(value ==1) {
					str += "S";
				}
				else {
					str += "N";
				}
			}

			else if(key.equals("T/F")) {
				if(value ==1) {
					str += "T";
				}
				else {
					str += "F";
				}
			}

			else if(key.equals("J/P")) {
				if(value ==1) {
					str += "J";
				}
				else {
					str += "P";
				}
			}
		}
		
		System.out.println(name+ "님의 MBTI 검사 결과는 "+ str + "입니다. ");
		
	}
}
