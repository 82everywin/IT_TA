import java.net.InetAddress;

public class Game {

	public static void main(String[] args) {
		try {
		
			System.out.println(InetAddress.getByAddress(null));
	
		}catch(Exception e) {
			e.getClass();
		}

		
	}
}