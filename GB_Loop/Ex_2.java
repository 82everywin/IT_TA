package GB_Loop;

public class Ex_2 {

	public static void main(String[] args) {
		 char star = '*';
		 
		 int x; 
		 int y;
		 
		 for (x = 1; x <= 5; x++) {
			 
			 for ( y = 5; y >= x; y--) {
				 System.out.print(star);
			 }
			 System.out.println();
		 }
		 
		 
		 
	}
}
