package IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx6 {

	public static void main(String[] args) {
		
		try {
			FileReader file = new FileReader("C:/windows/system.ini");
			System.out.println("===========파일 내용을 출력합니다=========\n");
			
			BufferedReader in = new BufferedReader(file);
			
			int line_nu=1;
			String msg ;
			while((msg=in.readLine())!= null) {
				System.out.printf("%2d : ",line_nu);
				System.out.println(msg);
				line_nu++;
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 찾기 오류!");
		}catch(IOException e) {
			System.out.println("파일을 읽어들일 수 없습니다. ");
		}
	}
}
