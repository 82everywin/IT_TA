package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOEx2 {

	public static void main(String[] args) throws IOException{
		char ch1 = 'A';
		char ch2 = 'B';
		
		Writer out = new FileWriter("hyper.txt");
		out.write(ch1);
		out.write(ch2);
		out.close();
	}
}
