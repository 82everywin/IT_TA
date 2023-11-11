package IOStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx5_2 {
	
	public static void main(String[] args) {
		
			FileReader file =null;
			try {
				// 바이너리로 읽어옴
				 file = new FileReader("./Ex1.txt");
				BufferedReader reader = new BufferedReader(file);
				String msg;
				while((msg=reader.readLine())!= null) {
					
					//String msg = reader.readLine();
					System.out.println(msg);
				}
				
	
				reader.close();
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 찾기 오류");
			}catch (IOException e) {
				System.out.println("입출력 오류");
			}
		
			
			

			
	
		
	}

}
