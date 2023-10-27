package JAVA;

public class Array_Ex1 {
	
 public static void main(String[] args) {
	
	 int[] score = { 85, 76, 90, 60, 100, 45, 83, 54, 95, 30 };
	 
	 int total = 0;
	 for(int i=0;i<score.length;i++) {
		 total += score[i];
	 }
	 
	 System.out.printf("총합 : %d점\n평균 : %.2f 점",total, (float)(total/score.length));

}
}
