package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Sub_String {
	public static void main(String[] args) {
		String my_string ="cvsgiorszzzmrpaqpe";
		int[] idx= {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		String re = solution(my_string, idx);
		System.out.println(re);
	}
    public static String solution(String my_string, int[] index_list) {
        String answer = "";
      //  Arrays.sort(index_list);
       // ArrayList<Integer> idx= new ArrayList<>();
		//for(int i :index_list) {
		//	idx.add(i);
	//	}
	//	System.out.println(idx);
       String[] str = my_string.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str));
        
        for (int i =0; i<index_list.length;i++){
            answer += list.get(index_list[i]);
       }
        
        return answer;
    }
	
}
