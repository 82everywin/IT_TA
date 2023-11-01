package Try_Catch;

import java.util.Random;

public class StudyUtil {
	public static void study() throws SleepyException  {
		//랜덤한 숫자를 얻어내서
		Random ran = new Random();
		int ranNum = ran.nextInt(3);
		//우연히 0이 나오면 예외를 발생시키기 
		if(ranNum==0) {
			throw new SleepyException("너무 졸려서 공부를 할 수가 없어요.");
		}
		System.out.println("랜덤 숫자 : "+
		ranNum);
		System.out.println("열심히 공부합니다!!");
	}

}

