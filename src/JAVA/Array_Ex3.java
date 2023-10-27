package JAVA;

public class Array_Ex3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int k =1;
		for (int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = k++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
