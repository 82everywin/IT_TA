package Class;

import java.util.Scanner;

public class PhoneBook {
	Scanner sc = new Scanner (System.in);
	
	Phone[] ph;
	public void store() {
		System.out.print("인원수를 입력하세요 >> ");
		int cnt = sc.nextInt();
		
		ph = new Phone[cnt];
		for(int i =0;i<ph.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >>> ");
			String name = sc.next();
			String tel = sc.next();
			
			ph[i]= new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	public boolean name_search(String name) {
		for(int idx =0;idx<ph.length;idx++) {
			if( name.equals(ph[idx].getName())) { // 이름 있음 
				System.out.println(name+"님의 번호는 "+ph[idx].getTel()+ "입니다. ");		
				return true;
			}
		}
		System.out.println(name+"이 없습니다.");
		return false;
	}
	
	public void search() {
		while(true) {
			System.out.print("검색할 이름 > ");
			String put_name = sc.next();
			if( put_name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			name_search(put_name);
	}
	}
	
}
