package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m ;
		while(true) {
			System.out.print("행의 크기 : ");
			 m = sc.nextInt();
			if ( m <1  || m >10 ) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			System.out.printf("%d × %d 행렬\n\n",m,m);
			break;
		}
		int[][] arr = new int[m][m];
		
		for(int i=0;i<m;i++){
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]= (int)((Math.random()*90)+10);
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}
		

	}
}
