package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOEx4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		FileWriter fw =null;
		try {
			fw = new FileWriter("./phone.txt");
			System.out.println("전화번호 입력프로그램입니다. ");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String name_tel = sc.nextLine();
				if(name_tel.equals("그만")) {
					break;
				}
				fw.write(name_tel,0,name_tel.length());
				fw.write("\n");
			}
			fw.close();
			System.out.println("파일 저장을 마칩니다. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
