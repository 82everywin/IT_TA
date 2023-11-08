package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_1 {
	public static void main(String[] args) {
		int[][] queries = {{2, 3}, {0, 7},{5, 9}, {6, 10}};
		solution("rermgorpsam",queries);
		
	}
	
	public static String solution(String my_string, int[][] queries) {
        String answer = "";
         
        String[] arr = my_string.split("");
        ArrayList<String> arrli = new ArrayList<>(Arrays.asList(arr));
        
        for(int i =0;i<queries.length;i++) {
        	String[] tmp = new String[queries[i][1]-queries[i][0]+1];
        	int idx =0;
        	for(int j = queries[i][0]; j<=queries[i][1]; j++) {
        		
        		tmp[idx]= arrli.get(j);
        		idx++;
        	}
        	int idx2= tmp.length-1;
        	for (int t = queries[i][0];t<=queries[i][1]; t++) {
	        		arrli.set(t,tmp[idx2--]);
	        	}
        	System.out.println(arrli);
        }
        for (int s = 0;s<arrli.size();s++) {
        	answer+=arrli.get(s);
        }
        System.out.println(answer);
		return answer;
    }

}
