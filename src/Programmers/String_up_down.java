package Programmers;

import java.util.Arrays;
import java.util.Random;

public class String_up_down {
	public static void main(String[] args) {
		
	
	Random ran =new Random() ;
	
	int[] arr  =new int[10];
	
    for(int i =0;i<arr.length;i++) {
    	
    	arr[i]= ran.nextInt(10);
    	
    	for (int j =0;j<i;j++) {
    		if (arr[i]==arr[j]) {
    			i--;
    			break;
    		}
    	}
		
		
	}
	System.out.println(Arrays.toString(arr));
}

}
