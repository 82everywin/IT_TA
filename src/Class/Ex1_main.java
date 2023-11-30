package Class;

public class Ex1_main {

	public static void main(String[] args) {
		TV myTV = new TV("LG",2023,50); // LG에서 만든 2017년 32인치
		myTV.show();
		
		
		TV myTV1 = new TV("LG",2017,40); // LG에서 만든 2017년 32인치
		myTV1.show();
		TV myTV2 = new TV("LG",2023,50); // LG에서 만든 2017년 32인치
		int num = myTV2.show();
		System.out.println(num);
	}
}

