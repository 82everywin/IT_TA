package omok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class GameFrame extends JFrame{
	/* Panel */
	JPanel basePanel = new JPanel(new BorderLayout());
	JPanel centerPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	
	/* List */
	JList<String> userList = new JList<String>();
	
	/* Label */
	JLabel la1 = new JLabel();
	JLabel la2 = new JLabel();
	JLabel la3 = new JLabel();
	JLabel userListL = new JLabel("참가자 목록");
	JLabel enableL = new JLabel();
	
	/* Button */
	JButton searchBtn = new JButton("전적검색");
	JButton chatBtn = new JButton("전송");
	JButton loseBtn = new JButton("기권하기");
	
	String selUser;	//선택된 사용자
	
	String dc = "";	//돌 색깔
	int col;		//돌 색깔
	
	int omok[][] = new int[20][20];	//오목 위치 배열
	boolean enable = false;	//돌을 둘 수 있는지 여부
	
	Client c = null;
	
	final String searchTag = "SEARCH";	//전적 조회 기능 태그
	final String rexitTag = "REXIT";	//방 퇴장 기능 태그
	final String omokTag = "OMOK";		//오목 기능 태그
	final String blackTag = "BLACK";	//검정색 돌 태그
	final String whiteTag = "WHITE";	//흰색 돌 태그
	final String winTag = "WIN";		//승리 태그
	final String loseTag = "LOSE";		//패배 태그
	
	/* Socket과 입출력 스트림 */
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;
	
	GameFrame(Client _c) {
		c = _c;
		
		/* List 크기 작업 */
		userList.setPreferredSize(new Dimension(140, 50));
		
		/* Label 크기 작업 */
		la1.setPreferredSize(new Dimension(250, 10));
		userListL.setPreferredSize(new Dimension(80, 20));
		userListL.setHorizontalAlignment(JLabel.LEFT);
		la2.setPreferredSize(new Dimension(155, 10));
		enableL.setPreferredSize(new Dimension(235, 100));
		enableL.setHorizontalAlignment(JLabel.CENTER);
		enableL.setForeground(Color.RED);
		la3.setPreferredSize(new Dimension(250, 10));
		
		/* Button 크기 작업 */
		searchBtn.setPreferredSize(new Dimension(90, 50));
		chatBtn.setPreferredSize(new Dimension(60, 30));
		loseBtn.setPreferredSize(new Dimension(235, 30));
		
		/* Panel 추가 작업 */
		setContentPane(basePanel);	//panel을 기본 컨테이너로 설정
		
		centerPanel.setPreferredSize(new Dimension(625, 652));
		centerPanel.setLayout(new FlowLayout());
		
		eastPanel.setPreferredSize(new Dimension(250, 652));
		eastPanel.setLayout(new FlowLayout());
		
		centerPanel.setBackground(new Color(206,167,61));
		centerPanel.setLayout(null);
		
		basePanel.add(centerPanel, BorderLayout.CENTER);
		basePanel.add(eastPanel, BorderLayout.EAST);
				
		eastPanel.add(la1);
		eastPanel.add(userListL);
		eastPanel.add(la2);
		eastPanel.add(userList);
		eastPanel.add(searchBtn);
		eastPanel.add(enableL);
		eastPanel.add(la3);
		
		// 채팅창 생성
		JTextArea chatTextArea = new JTextArea();
		chatTextArea.setEditable(false); // 편집 불가능하도록 설정

		// JScrollPane으로 채팅창 감싸기
		JScrollPane scrollPane = new JScrollPane(chatTextArea);
		scrollPane.setPreferredSize(new Dimension(250, 300)); // 크기 설정

		// 패널에 스크롤 패널 추가
		eastPanel.add(scrollPane);
		
		// 채팅 입력 칸 생성
		JTextField chatInput = new JTextField();
		chatInput.setPreferredSize(new Dimension(160, 30)); // 크기 조정

		// 채팅 입력 칸과 전송 버튼을 담을 패널 생성
		JPanel chatPanel = new JPanel();
		chatPanel.setLayout(new FlowLayout());
		chatPanel.add(chatInput);
		chatPanel.add(chatBtn);
		eastPanel.add(chatPanel);
		
		eastPanel.add(chatBtn);
		eastPanel.add(loseBtn);
		
		// 클라이언트 소켓 초기화
        try {
        	socket = new Socket("localhost", 1228); // 서버 주소와 포트번호를 실제 값으로 변경
           	reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);
            // 서버와 연결한 후 스트림 초기화
       	} catch (IOException e) {
       		e.printStackTrace();
       	}

        // 채팅 전송 버튼 리스너
        chatBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(chatInput.getText());
                chatInput.setText(""); // 입력 필드 지우기
            }
	
			private void sendMessage(String message) {
				if (!message.isEmpty()) {
	                // 메시지를 서버로 전송
	                writer.println("CHAT//" + message);
	                chatInput.setText(""); // 입력 필드 초기화
	                // 채팅창에 보낸 메시지 표시
	                chatTextArea.append("나: " + message + "\n");
	            }
			}
        });
        
        // 채팅 수신 스레드
        new Thread(new Runnable() {
            @Override
            public void run() {
                String message;
                try {
                    while ((message = reader.readLine()) != null) {
                        // 서버로부터 수신한 메시지를 처리 (예: 화면에 표시)
                        chatTextArea.append("상대방: " + message + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
		
		/* Button 이벤트 리스너 추가 */
		ButtonListener bl = new ButtonListener();
		loseBtn.addActionListener(bl);
		chatBtn.addActionListener(bl);
		searchBtn.addActionListener(bl);
		
		/* Mouse 이벤트 리스너 추가 */
		DolAction da = new DolAction();
		centerPanel.addMouseListener(da);
		
		/* Mouse 이벤트 추가 */
		userList.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!userList.isSelectionEmpty()) {
					String[] m = userList.getSelectedValue().split(" : ");
					selUser = m[0];
				}
			}
			public void mousePressed(MouseEvent e) { }
			public void mouseReleased(MouseEvent e) { }
			public void mouseEntered(MouseEvent e) { }
			public void mouseExited(MouseEvent e) { }
			
		});
		
		setSize(885, 652);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	@Override
	public void paint(Graphics g) {	//panel에 그리기 작업
		super.paintComponents(g);
		g.setColor(Color.BLACK);
		
		for(int i=1; i<=20; i++) {
			g.drawLine(30, i*30+20, 30*20, i*30+20);	//가로 줄 그리기
			g.drawLine(i*30, 50, i*30, 30*20+20);	//세로 줄 그리기
		}
		
		drawdol(g);	//돌 그리기
	}
	
	void drawdol(Graphics g) {	//돌 그리기 작업
		for(int i=0; i<20; i++){
			for(int j=0;j<20;j++){
				if(omok[j][i]==1) {			//1일 때 검정 돌
					g.setColor(Color.BLACK);
					g.fillOval((i+1)*30-12, (j)*30+37, 25, 25);
				}
				else if(omok[j][i]==2) {	//2일 때 흰 돌
					g.setColor(Color.WHITE);
					g.fillOval((i+1)*30-12, (j)*30+37, 25, 25);
				}
			}
		}
	}
	
	void remove() {	//돌 초기화 작업
		for(int i=0; i<20; i++) {
			for(int j=0;j<20;j++) {
				omok[i][j] = 0;
			}
		}
		repaint();
	}
	
	/* Button 이벤트 리스너 */
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			/* 전적검색 버튼 이벤트 */
			if(b.getText().equals("전적검색")) {
				if(selUser != null) {	//selUser가 null이 아니면 서버에 "태그//닉네임" 형태의 메시지를 전송
					c.sendMsg(searchTag + "//" + selUser);
				} else {				//selUser가 null이면 전적검색 시도 실패
					JOptionPane.showMessageDialog(null, "검색할 닉네임을 선택해주세요", "검색 실패", JOptionPane.ERROR_MESSAGE);
				}
			}
			
			/* 기권하기 버튼 이벤트 */
			else if(b.getText().equals("기권하기")) {
				c.sendMsg(loseTag + "//");	//서버에 패배 태그 전송
				dispose();					//인터페이스 닫음
				c.mf.setVisible(true);
			}
		}
	}
	
	/* Mouse 이벤트 리스너 : 돌 올릴 위치 선정 */
	class DolAction implements MouseListener{
		@Override
		public void mousePressed(MouseEvent e) {
			if(!enable) return;		//누를 수 없으면 return
			
			//각 좌표 계산
			int x = (int)(Math.round(e.getX() / (double)30) - 1);
			int y = (int)(Math.round(e.getY() / (double)30) - 1);
			
			if(x<0 || x>19 || y<0 || y>19) return;			//둘 수 없는 위치면 return
			if(omok[y][x] == 1 || omok[y][x] == 2) return;	//다른 돌이 있으면 return
			
			System.out.println("[Client] 돌을 (" + x + ", " + y + ")에 두었습니다");	//돌을 둔 위치를 알림

			if(dc.equals(blackTag)) {	//검정색 태그면 1
				omok[y][x] = 1;
				col = 1;
			} else {					//흰색 태그면 2
				omok[y][x] = 2;
				col = 2;
				
			}
			c.sendMsg(omokTag + "//" + x + "//" + y + "//" + dc);	//서버에 오목 태그, 좌표, 돌 색깔을 전송
			
			repaint();
			
			if(check(new Point(x, y), col)) {	//이겼는지 확인. true면 서버에 승리 태그 전송
				c.sendMsg(winTag + "//");
				JOptionPane.showMessageDialog(null, "게임에 승리하였습니다", "승리", JOptionPane.INFORMATION_MESSAGE);
				remove();
				dispose();	//인터페이스 닫음
				c.mf.setVisible(true);
			}
			
			enable = false;	//돌을 두면 false로 바꿈
			enableL.setText("상대가 두기를 기다리는 중...");	//본인 차례인지 아닌지 알려줌
		}
		
		public void mouseClicked(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
		public void mouseEntered(MouseEvent e) { }
		public void mouseExited(MouseEvent e) { }
	}
	
	//승리 여부를 확인하는 메소드. 승리 시 true, 승리가 아니면 false를 반환
	boolean check(Point p, int c) {
		/* 돌을 올린 위치의 가로, 세로, 대각선에 같은 색의 돌이 연달아 4개가 있으면 true를 반환 */
		if(count(p, 1, 0, c) + count(p, -1, 0, c) == 4) {	//가로
			return true;
		}
		
		if(count(p, 0, 1, c) + count(p, 0, -1, c) == 4) {	//세로
			return true;
		}
		
		if(count(p, -1, -1, c) + count(p, 1, 1, c) == 4) {	//오른쪽 대각선
			return true;
		}
		
		if(count(p, 1, -1, c) + count(p, -1, 1, c) == 4) {	//왼쪽대각선
			return true;
		}
		
		return false;
	}
	
	//특정 위치에 같은 색의 돌이 있는지 확인하는 메소드.
	int count(Point p, int _x, int _y, int c) {
		int i=0;
		//omok[p.y+(i+1)*_y][p.x+(i+1)*_x]==c가 true면 i가 무한대로 증가한다.
		for(i=0; omok[p.y+(i+1)*_y][p.x+(i+1)*_x]==c; i++);
		return i;
	}
}