package omok;

import java.net.*;
import java.io.*;
import javax.swing.*;

//서버와의 연결과 각 인터페이스를 관리하는 클래스.
public class Client {
	Socket mySocket = null;
	
	/* 메시지 송신을 위한 필드 */
	OutputStream os = null;
	DataOutputStream dos = null;

	
	/* 각 프레임을 관리할 필드 */
	MainFrame mf = null;
	LoginFrame lf = null;
	JoinFrame jf = null;
	RankingFrame rf = null;
	InfoFrame inf = null;
	CInfoFrame cinf = null;
	GameFrame gf = null;
	SRankFrame srf = null;
	
	public static void main(String[] args) {
		Client client = new Client();
		
		try {
			//서버에 연결
			client.mySocket = new Socket("localhost", 1228);
			System.out.println("[Client] 서버 연결 성공");
			
			client.os = client.mySocket.getOutputStream();
			client.dos = new DataOutputStream(client.os);
			
			/* 프레임 생성 */
			client.mf = new MainFrame(client);
			client.lf = new LoginFrame(client);
			client.jf = new JoinFrame(client);
			client.rf = new RankingFrame(client);
			client.inf = new InfoFrame(client);
			client.cinf = new CInfoFrame(client);
			client.gf = new GameFrame(client);
			client.srf = new SRankFrame(client);
			
			MessageListener msgListener = new MessageListener(client, client.mySocket);
			msgListener.start();	//스레드 시작
		} catch(SocketException e) {
			System.out.println("[Client] 서버 연결 오류 > " + e.toString());
		} catch(IOException e) {
			System.out.println("[Client] 입출력 오류 > " + e.toString());
		}
	}
	
	/* 서버에 메시지 전송 */
	void sendMsg(String _m) {
		try {
			dos.writeUTF(_m);
		} catch(Exception e) {
			System.out.println("[Client] 메시지 전송 오류 > " + e.toString());
		}
	}
}

//서버와의 메시지 송수신을 관리하는 클래스.
//스레드를 상속받아 각 기능과 독립적으로 동작할 수 있도록 한다.
class MessageListener extends Thread{
	Socket socket;
	Client client;
	
	/* 메시지 수신을 위한 필드 */
	InputStream is;
	DataInputStream dis;
	
	String msg;	//수신 메시지 저장
	
	/* 각 메시지를 구분하기 위한 태그 */
	final String loginTag = "LOGIN";	//로그인
	final String joinTag = "JOIN";		//회원가입
	final String overTag = "OVER";		//중복확인
	final String viewTag = "VIEW";		//회원정보조회
	final String changeTag = "CHANGE";	//회원정보변경
	final String rankTag = "RANK";		//전적조회(전체회원)
	final String croomTag = "CROOM";	//방생성
	final String vroomTag = "VROOM";	//방목록
	final String uroomTag = "UROOM";	//방유저
	final String eroomTag = "EROOM";	//방입장
	final String cuserTag = "CUSER";	//접속유저
	final String searchTag = "SEARCH";	//전적조회(한명)
	final String omokTag = "OMOK";		//오목
	final String blackTag = "BLACK";	//검은색 돌
	final String whiteTag = "WHITE";	//흰색 돌
	final String winTag = "WIN";		//승리
	final String loseTag = "LOSE";		//패배
	final String rexitTag = "REXIT";	//방퇴장
	final String recordTag = "RECORD";	//전적업데이트
	
	MessageListener(Client _c, Socket _s) {
		this.client = _c;
		this.socket = _s;
	}
	
	public void run() {
		try {
			is = this.socket.getInputStream();
			dis = new DataInputStream(is);
			
			while(true) {
				msg = dis.readUTF();	//메시지 수신을 상시 대기한다.
				
				String[] m = msg.split("//");	//msg를 "//"로 나누어 m[]배열에 차례로 집어넣는다.
				
				// 수신받은 문자열들의 첫 번째 배열(m[0])은 모두 태그 문자. 각 기능을 분리한다.
				
				/* 로그인 */
				if(m[0].equals(loginTag)) {
					loginCheck(m[1]);
				}
				
				/* 회원가입 */
				else if(m[0].equals(joinTag)) {
					joinCheck(m[1]);
				}
				
				/* 회원정보 조회 */
				else if(m[0].equals(viewTag)) {
					viewMyInfo(m[1], m[2], m[3]);
				}
				
				/* 전체 전적 조회 */
				else if(m[0].equals(rankTag)) {
					viewRank(m[1]);
				}
				
				/* 회원정보 변경 */
				else if(m[0].equals(changeTag)) {
					changeInfo(m[1]);
				}
				
				/* 방 생성 */
				else if(m[0].equals(croomTag)) {
					createRoom(m[1]);
				}
				
				/* 접속 유저 */
				else if(m[0].equals(cuserTag)) {
					viewCUser(m[1]);
				}
				
				/* 방 목록 */
				else if(m[0].equals(vroomTag)) {
					if(m.length > 1) {	//배열크기가 1보다 클 때
						roomList(m[1]);
					} else {	//배열크기가 1보다 작다 == 방이 없다
						String[] room = {""};	//방 목록이 비도록 함
						client.mf.rList.setListData(room);
					}
				}
				
				/* 방 입장 */
				else if(m[0].equals(eroomTag)) {
					enterRoom(m[1]);
				}
				
				/* 방 인원 */
				else if(m[0].equals(uroomTag)) {
					roomUser(m[1]);
				}
				
				/* 전적 조회 */
				else if(m[0].equals(searchTag)) {
					searchRank(m[1]);
				}
				
				/* 오목 */
				else if(m[0].equals(omokTag)) {
					inputOmok(m[1], m[2], m[3]);
				}
				
				/* 패배 */
				else if(m[0].equals(loseTag)) {
					loseGame();
				}
				
				/* 승리 */
				else if(m[0].equals(winTag)) {
					winGame();
				}
				
				/* 전적 업데이트 */
 				else if(m[0].equals(recordTag)) {
					dataRecord(m[1]);
				}
			}
		} catch(Exception e) {
			System.out.println("[Client] Error: 메시지 받기 오류 > " + e.toString());
		}
	}
	
	/* 로그인 성공 여부를 확인하는 메소드 */
	void loginCheck(String _m) {	
		if(_m.equals("OKAY")) {	//로그인 성공
			System.out.println("[Client] 로그인 성공 : 메인 인터페이스 열림 : 로그인 인터페이스 종료");
			client.mf.setVisible(true);
			client.lf.dispose();
		}
		
		else {				//로그인 실패
			System.out.println("[Client] 로그인 실패 : 회원정보 불일치");
			JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다", "로그인 실패", JOptionPane.ERROR_MESSAGE);
			client.lf.id.setText("");
			client.lf.pw.setText("");
		}
	}
	
	/* 회원가입 성공 여부를 확인하는 메소드 */
	void joinCheck(String _m) {
		if(_m.equals("OKAY")) {	//회원가입 성공
			JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
			client.jf.dispose();
			System.out.println("[Client] 회원가입 성공 : 회원가입 인터페이스 종료");
			client.jf.name.setText("");
			client.jf.nickname.setText("");
			client.jf.id.setText("");
			client.jf.pw.setText("");
			client.jf.email.setText("");
		}
		
		else {				//회원가입 실패
			JOptionPane.showMessageDialog(null, "닉네임이나 이름이 중복되었는지 확인하세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
			System.out.println("[Client] 회원가입 실패");
			client.jf.name.setText("");
			client.jf.nickname.setText("");
			client.jf.id.setText("");
			client.jf.pw.setText("");
			client.jf.email.setText("");
		}
	}
	
	/* 내 정보를 확인하는 메소드 */
	void viewMyInfo(String m1, String m2, String m3) {
		if(!m1.equals("FAIL")) {	//회원정보 조회 성공
			System.out.println("[Client] 회원 정보 조회 성공");
			client.inf.name.setText(m1);
			client.inf.nickname.setText(m2);
			client.inf.email.setText(m3);
		}
		
		else {					//회원정보 조회 실패
			System.out.println("[Client] 회원 정보 조회 실패");
		}
	}
	
	/* 전적을 출력하는 메소드 */
	void viewRank(String _m) {
		if(!_m.equals("FAIL")) {	//전적 조회 성공
			System.out.println("[Client] 전적 조회 성공");
			String[] user = _m.split("@");
			
			client.rf.rank.setListData(user);
		}
	}
	
	/* 회원정보 변경 여부를 확인하는 메소드 */
	void changeInfo(String _m) {
		if(_m.equals("OKAY")) {	//회원정보 변경 성공
			System.out.println("[Client] 변경 성공");
			JOptionPane.showMessageDialog(null, "정상적으로 변경되었습니다", "회원정보변경", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {				//회원정보 변경 실패
			System.out.println("[Client] 이름 변경 실패");
			JOptionPane.showMessageDialog(null, "변경에 실패하였습니다", "회원정보변경", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/* 방 생성 여부를 확인하는 메소드 */
	void createRoom(String _m) {
		if(_m.equals("OKAY")) {	//방 생성 성공
			System.out.println("[Client] 방 생성 성공");
			client.gf.setVisible(true);
			client.mf.setVisible(false);
			client.gf.setTitle(client.mf.roomName);
			client.gf.dc = blackTag;	//방을 생성한 사람은 검은 돌
			client.gf.enable = true;	//돌 놓기 가능하게 바꿈
		}
	}
	
	/* 접속 인원을 출력하는 메소드 */
	void viewCUser(String _m) {
		if(!_m.equals("")) {
			String[] user = _m.split("@");
			
			client.mf.cuList.setListData(user);
		}
	}
	
	/* 방 목록을 출력하는 메소드 */
	void roomList(String _m) {
		if(!_m.equals("")) {
			String[] room = _m.split("@");
			
			client.mf.rList.setListData(room);
		}
	}
	
	/* 방 입장 여부를 확인하는 메소드 */
	void enterRoom(String _m) {
		if(_m.equals("OKAY")) {	//방 입장 성공
			System.out.println("[Client] 방 입장 성공");
			client.gf.setVisible(true);
			client.mf.setVisible(false);
			client.gf.setTitle(client.mf.selRoom);
			client.gf.dc = whiteTag;	//방에 입장한 사람은 흰 돌
			client.gf.enable = false;	//돌 놓기 불가능하게 바꿈
		}
		
		else {				//방 입장 실패
			System.out.println("[Client] 방 입장 실패");
			JOptionPane.showMessageDialog(null, "이미 2명이 찬 방이므로 입장할 수 없습니다", "방입장", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/* 방 인원 목록을 출력하는 메소드 */
	void roomUser(String _m) {
		if(!_m.equals("")) {
			String[] user = _m.split("@");
			
			client.gf.userList.setListData(user);
		}
	}
	
	/* 전적 조회 메소드 */
	void searchRank(String _m) {
		if(!_m.equals("FAIL")) {	//전적 조회 성공
			client.srf.setVisible(true);
			client.srf.l.setText(_m);
		}
	}
	
	/* 상대 오목을 두는 메소드 */
	void inputOmok(String m1, String m2, String m3) {
		if(!m1.equals("") || !m2.equals("") || !m3.equals("")) {
			int n1 = Integer.parseInt(m1);
			int n2 = Integer.parseInt(m2);
			
			if(m3.equals(blackTag)) {	//검은 돌 태그면 1
				client.gf.omok[n2][n1] = 1;
			} else {					//흰 돌 태그면 2
				client.gf.omok[n2][n1] = 2;
			}
			
			client.gf.repaint();
			client.gf.enable = true;	//돌을 놓을 수 있도록 함
			client.gf.enableL.setText("본인 차례입니다.");
		}
	}
	
	/* 패배를 알리는 메소드 */
	void loseGame() {
		System.out.println("[Client] 게임 패배");
		JOptionPane.showMessageDialog(null, "게임에 패배하였습니다", "패배", JOptionPane.INFORMATION_MESSAGE);
		client.gf.remove();	//화면을 지움
		client.gf.dispose();
		client.mf.setVisible(true);
	}
	
	/* 승리를 알리는 메소드 */
	void winGame() {
		System.out.println("[Client] 게임 승리");
		JOptionPane.showMessageDialog(null, "게임에 승리하였습니다", "승리", JOptionPane.INFORMATION_MESSAGE);
		client.gf.remove();	//화면을 지움
		client.gf.dispose();
		client.mf.setVisible(true);
	}
	
	/* 전적 업데이트 여부를 알리는 메소드 */
	void dataRecord(String _m) {
		if(_m.equals("NO")) {			//전적 업데이트 안함
			System.out.println("[Client] 데이터 미반영 : 상대가 없음");
			JOptionPane.showMessageDialog(null, "게임 상대가 없어 전적을 반영하지 않았습니다", "전적반영", JOptionPane.INFORMATION_MESSAGE);
			client.sendMsg(rexitTag + "//");
		} else if(_m.equals("OKAY")) {	//전적 업데이트 성공
			System.out.println("[Client] 데이터 반영 성공");
			JOptionPane.showMessageDialog(null, "전적 반영이 정상적으로 완료되었습니다", "전적반영", JOptionPane.INFORMATION_MESSAGE);
			client.sendMsg(rexitTag + "//");
		} else if(_m.equals("FAIL")) {	//전적 업데이트 실패
			System.out.println("[Client] 데이터 반영 실패");
			JOptionPane.showMessageDialog(null, "시스템 장애로 인하여 전적 반영에 실패하였습니다", "전적반영", JOptionPane.INFORMATION_MESSAGE);
			client.sendMsg(rexitTag + "//");
		}
	}
}