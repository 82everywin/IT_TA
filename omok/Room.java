package omok;

import java.util.*;

//멀티룸을 지원하기 위한 기능을 구현할 클래스.
//각 Room들을 객체로 관리. Room 객체는 제목, 인원수, 클라이언트 객체 배열을 필드로 가지며 이들을 관리한다.
public class Room {
	Vector<CCUser> ccu;
	String title;
	int count = 0;
	
	Room() {	//Room 객체 생성 시 접속(입장)한 클라이언트 객체에 대한 정보를 Room에 저장한다.
		ccu = new Vector<>();
	}
}