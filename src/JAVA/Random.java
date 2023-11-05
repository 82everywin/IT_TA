package JAVA;

public class Random {

	public static void main(String[] args) {
		int Port = (int)(Math.random()*10000+10000);
		System.out.println("랜덥  //"+ Port);
		System.out.println(Integer.valueOf(Port));
	}
}
