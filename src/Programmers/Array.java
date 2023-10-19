package Programmers;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0; i<5;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println(list.size());
		
		int num = list.get(list.size()-1);
		System.out.println(num);
		
		Integer[] arr = list.toArray(new Integer[list.size()]);

		System.out.println(arr);
	    for (int i = 0; i < list.size(); i++) {
	        System.out.println(arr[list.get(i)]);
	    }
	    
	    System.out.println(arr[3]);
	}
}
