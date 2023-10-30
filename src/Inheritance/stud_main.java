package Inheritance;

public class stud_main {

	public static void main(String[] args) {
		Student student = new Student("홍길동", 18, 100, 90, 80);
		student.printMyself(); //부모 메소드 호출
		student.printScore(); //자식 메소드 호출
		
		
		Student student1 = new Student("이순신", 17, 90, 45, 100);
		student1.printMyself(); //부모 메소드 호출
		student1.printScore(); //자식 메소드 호출
	
	}
}

	