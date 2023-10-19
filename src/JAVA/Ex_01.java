package JAVA;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산기호");
		String str = sc.next();
		String sss = sc.next();
		System.out.println(System.identityHashCode(sss));
		String str1 = "+";
		System.out.println(str==str1);
		String str2 = "+";
		System.out.println(str1==str2);
				
		System.out.println("str 주소값 : "+ System.identityHashCode(str));
		System.out.println("str1 주소값 : "+System.identityHashCode(str1));
		System.out.println("str2 주소값 : "+System.identityHashCode(str2));

		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str2));
		
		
		char ch = sc.next().charAt(0);
		
		System.out.println("ch 주소값 : "+System.identityHashCode(ch));
		
		char ch1 = '+';
		System.out.println("ch1 주소값 : "+System.identityHashCode(ch1));
		System.out.println(ch==ch1);
		
		char ch2 = '+';
		System.out.println("ch2 주소값 : "+ System.identityHashCode(ch2));
	
	//	char ch3 = new char('+');
	}
}
