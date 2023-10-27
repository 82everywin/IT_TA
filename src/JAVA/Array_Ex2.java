package JAVA;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Array_Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력해주세요 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i]= i+1;
			System.out.println(arr[i]);
		}
		
		//System.out.println(Arrays.toString(arr));
		
	}
}
