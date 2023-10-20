package GB_Loop;

public class Ex_1 {
		public static void main(String[] args) {
			int x;
			int y;
			
					
			for ( x =2 ; x < 10; x++) { //단
				if( x % 2 ==1) {
					System.out.println("===" + x +"단===");
				
					for ( y = 1; y < 10; y++) { // 1~9행
						//System.out.println(x+ " × " + y + " = " + x * y);
						System.out.printf("%d × %d = %d\n",x,y,x*y);
					}
				}
				System.out.println();
			}
		
		}
}

		

