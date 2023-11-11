package IOStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IO {
	public static void main(String[] args) {
		
		//File file = new File("../../1111.txt");
		int i ;
		try {
			FileInputStream fis = new FileInputStream("./input.txt");
			
			byte[] bs = new byte[20];
			while((i = fis.read())!= -1) {
			
					
					System.out.print((char)i);
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
