package JAVA;

public class Star {

	public static void main(String[] args) {
		
		char star = '*';
		
		for (int i =1 ; i<=5;i++) {
			for ( int j = 1; j<=i;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
