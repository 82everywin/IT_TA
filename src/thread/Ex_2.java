package thread;

import java.util.Scanner;

import Ex1.Scan;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("입력 : ");
		try {
		String str = sc.next();
		System.out.println(Integer.parseInt(str));
		if(Integer.parseInt(str)) {
			
		}
		System.out.println(Integer.valueOf(str));
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
