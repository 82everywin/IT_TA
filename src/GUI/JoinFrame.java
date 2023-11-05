package GUI;

package omok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//회원가입 기능을 수행하는 인터페이스
public class JoinFrame extends JFrame{
	/* Panel */
	JPanel panel = new JPanel();
	
	/* Label */
	JLabel nameL = new JLabel("이름");
	JLabel nicknameL = new JLabel("닉네임");
	JLabel idL = new JLabel("아이디");
	JLabel pwL = new JLabel("비밀번호");
	JLabel postL = new JLabel("우편번호");
	JLabel emailL = new JLabel("이메일");
	
	/* TextField */
	JTextField name = new JTextField();
	JTextField nickname = new JTextField();
	JTextField id = new JTextField();
	JPasswordField pw = new JPasswordField();
	JTextField post = new JTextField();
	JTextField email = new JTextField();
	
	/* Button */
	JButton nnolBtn = new JButton("확인");
	JButton idolBtn = new JButton("확인");
	JButton psolBtn = new JButton("확인");
	JButton postBtn = new JButton("검색");
	JButton joinBtn = new JButton("가입하기");
	JButton cancelBtn = new JButton("가입취소");
	
	Client c = null;
	
	final String joinTag = "JOIN";	//회원가입 기능 태그
	final String overTag = "OVER";	//중복확인 기능 태그
	final String pwTag = "SAFE";	//비밀번호 유효성 태그
	final String postTag = "POST";
	
	JoinFrame(Client _c) {
		c = _c;
		
		setTitle("회원가입");
		
		/* Label 크기 작업 */
		nameL.setPreferredSize(new Dimension(60, 30));
		nicknameL.setPreferredSize(new Dimension(60, 30));
		idL.setPreferredSize(new Dimension(60, 30));
		pwL.setPreferredSize(new Dimension(60, 30));
		postL.setPreferredSize(new Dimension(60, 30));
		emailL.setPreferredSize(new Dimension(60, 30));
		
		/* TextField 크기 작업 */
		name.setPreferredSize(new Dimension(210, 30));
		nickname.setPreferredSize(new Dimension(145, 30));
		id.setPreferredSize(new Dimension(145, 30));
		pw.setPreferredSize(new Dimension(145, 30));
		post.setPreferredSize(new Dimension(145, 30));
		email.setPreferredSize(new Dimension(210, 30));
		
		/* Button 크기 작업 */
		nnolBtn.setPreferredSize(new Dimension(60, 30));
		idolBtn.setPreferredSize(new Dimension(60, 30));
		psolBtn.setPreferredSize(new Dimension(60, 30));
		postBtn.setPreferredSize(new Dimension(60, 30));
		joinBtn.setPreferredSize(new Dimension(135, 30));
		cancelBtn.setPreferredSize(new Dimension(135, 30));
		
		/* Panel 추가 작업 */
		setContentPane(panel);	//panel을 기본 컨테이너로 설정
		
		panel.add(nameL);
		panel.add(name);
		
		panel.add(nicknameL);
		panel.add(nickname);
		panel.add(nnolBtn);
		
		panel.add(idL);
		panel.add(id);
		panel.add(idolBtn);
		
		panel.add(pwL);
		panel.add(pw);
		panel.add(psolBtn);
		
		panel.add(postL);
		panel.add(post);
		panel.add(postBtn);
		
		panel.add(emailL);
		panel.add(email);
		
		panel.add(cancelBtn);
		panel.add(joinBtn);
		
		/* Button 이벤트 리스너 추가 */
		ButtonListener bl = new ButtonListener();
		
		cancelBtn.addActionListener(bl);
		joinBtn.addActionListener(bl);
		
		/* Button 이벤트 추가 */
		nnolBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!nickname.getText().equals("")) {
					System.out.println(nickname.getText( ));
					System.out.println("[Client] 닉네임 중복 확인");
					c.sendMsg(overTag + "//nickname//" + nickname.getText());	//서버에 태그와 함께 닉네임 전송
				}
			}
		});
		
		idolBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!id.getText().equals("")) {
					System.out.println("[Client] 아이디 중복 확인");
					System.out.println(overTag + "//id//" + id.getText());
					c.sendMsg(overTag + "//id//" + id.getText());	//서버에 태그와 함께 아이디 전송
				}
			}
		});
		
		psolBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!pw.getPassword().toString().equals("")) {
					System.out.println("[Client] 비밀번호 유효성 확인");
					c.sendMsg(pwTag + "//pw//" +String.valueOf(pw.getPassword()));	//서버에 태그와 함께 비밀번호 전송
				}
			}
		});
		
		postBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!post.getText().equals("")) {
					System.out.println("[Client] 우편번호 확인");
					String msg;
					msg= PostZip.find(post.getText(), 10,5, null, {2});
					post.setText(msg);
				//	c.sendMsg(postTag+ "//post//" +post.getText());	//서버에 태그와 함께 비밀번호 전송
				}
			}
		});
		
		setSize(310, 300);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/* Button 이벤트 리스너 */
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			/* TextField에 입력된 회원 정보들을 변수에 초기화 */
			String uname = name.getText();
			String unick = nickname.getText();
			String uid = id.getText();
			String upass = "";
			for(int i=0; i<pw.getPassword().length; i++) {
				upass = upass + pw.getPassword()[i];
			}
			String upost = post.getText();
			String uemail = email.getText();
			
			/* 가입취소 버튼 이벤트 */
			if(b.getText().equals("가입취소")) {
				System.out.println("[Client] 회원가입 인터페이스 종료");
				dispose();	//인터페이스 닫음
			}
			
			/* 가입하기 버튼 이벤트 */
			else if(b.getText().equals("가입하기")) {
				if(uname.equals("") || unick.equals("") || uid.equals("") || upass.equals("") || upost.equals("") || uemail.equals("")) {
					//모든 정보가 입력되지 않으면 회원가입 시도 실패
					JOptionPane.showMessageDialog(null, "모든 정보를 기입해주세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
					System.out.println("[Client] 회원가입 실패 : 회원정보 미입력");
				}
				
				else if(!uname.equals("") && !unick.equals("") && !uid.equals("") && !upass.equals("") && !upost.equals("") && !uemail.equals("")) {
					//회원가입 시도 성공
					c.sendMsg(joinTag + "//" + uname + "//" + unick + "//" + uid + "//" + upass + "//" + upost + "//" + uemail);	//서버에 회원가입 정보 전송
				}
			}
		}
	}
}
