package Programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Dice {
	public static void main(String[] args) {
		  
	//HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>() ;
	

		double re = solution(4,4,4,1);
		double re1 = solution(3, 3, 6, 6);
		double re2 = solution(3, 4, 3, 6);
		double re3 = solution(3, 3, 3, 3);
		double re4 = solution(4, 2, 6, 2);
		double re5 = solution(5, 2, 6, 1);
		
	}
	
    public static double solution(int a, int b, int c, int d) {
    	HashMap<Integer, Integer> dice = new HashMap<> ();
    	// 자동 정렬 됨. 
    	dice.put(a,dice.getOrDefault(a,0)+1);
    	dice.put(b,dice.getOrDefault(b,0)+1);
    	dice.put(c,dice.getOrDefault(c,0)+1);
    	dice.put(d,dice.getOrDefault(d,0)+1);
    	System.out.println(dice);
    	ArrayList<Integer> key = new ArrayList<>(dice.keySet());
    	System.out.println(key);
    	
    	int len = key.size();
    	//System.out.println(len);
    	int p,q,r =0;
    	switch(len) {
    	case 1:
    		 p = key.get(0);
    		return 1111*p;
    		
    	case 2:
    		// 3 : 1 인 상황
    		if(dice.get(key.get(0))==3 ||dice.get(key.get(0))==1 ) {
    			
    			 p = dice.get(key.get(0))==3 ? key.get(0):key.get(1);
    			 q = dice.get(key.get(0))==1 ? key.get(0):key.get(1);
    			 
    			 
    			 if(dice.get(key.get(0))==3) {
    				 p=key.get(0);
    				 q = key.get(1);
    			 }else {
    				 p = key.get(1);
    				 q = key.get(0);
    			 }
    			 return Math.pow((10 * p) + q,2);
    		}
    		// 2 : 2 인 상황
    		else {
    			p = key.get(0);
    			q = key.get(1);
    			return (p + q) * Math.abs(p - q);
    		}
    	case 3: // key값이 정렬이 된 것이므로, 키값 을 가져오면 안됨. 
    		int result = 1;
    		for(int i = 0; i<key.size(); i++) {
    			if (dice.get(key.get(i))!=2) {
    				 result *= key.get(i);	
    			}
    		}
    		return result;
    	case 4:
    		return key.get(0);
    	}
    	
    	
    	return 0;
    }
    
    

}
