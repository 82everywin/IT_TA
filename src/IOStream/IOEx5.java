package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx5 {
	
	public static void main(String[] args) {
		
		try {
			FileReader fd = new FileReader("./phone.txt");
			char[] n =new char[1024*10];
		
			int c;
			while((c=fd.read())!=-1) {
				System.out.print((char)c);
			}
			fd.close();
		
			//System.out.println(fd.read(n));

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
