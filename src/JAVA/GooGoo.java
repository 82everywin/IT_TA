package JAVA;

public class GooGoo {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			if(i%2 !=0) {
			System.out.println("=== "+ i+"단 ===");
			for (int j=1;j<=9;j++) {
				System.out.printf("%d × %d = %d\n",i,j,i*j);
			}
			System.out.println();
			}
		}
	}
}
