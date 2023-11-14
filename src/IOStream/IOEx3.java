package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx3 {
	
	public static void main(String[] args) {
			try {
				FileInputStream fin1 = new FileInputStream("./input.txt");
				FileOutputStream fout1 = new FileOutputStream("./output.txt");
				
				int data;
				while((data = fin1.read()) != -1) {
					System.out.print((char)data);
					fout1.write(data);
				}
			
				fin1.close();
				fout1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
