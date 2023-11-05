package Try_Catch;

public class Random_main {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			StudyUtil.study();
		} catch (SleepyException e) {
			e.printStackTrace();
		
		}
	}
}
