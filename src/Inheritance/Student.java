package Inheritance;

public class Student extends Person{
	
	int kor;
	int math;
	int eng;
	
	//생성자(Constrouct)
	public Student(String name, int age, int kor, int math, int eng){
	super.name = name; //부모 필드
	super.age = age; //부모 필드
	this.kor = kor;
	this.math = math;
	this.eng=eng;
	}

	
	//메소드(Method)
	public void printScore() {
	System.out.println("국어성적 : " + kor);
	System.out.println("수학성적 : " + math);
	System.out.println("영어성적 : " + eng);
	}
	
}

	

	