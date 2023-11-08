package Ex1;

public class Ex3_Array {
	public static void main(String[] args) {
		int[] iArr = new int[4];
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (i+1)*100;
		}
		for(int j =0;j<iArr.length;j++) {
		System.out.println(iArr[j]);
		}
	}

}
