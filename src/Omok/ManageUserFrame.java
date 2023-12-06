package Omok;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ManageUserFrame  extends JFrame {
	
	/* Panel */
	JPanel CbxPanel = new JPanel();
	JPanel chxPanel = new JPanel();
	JPanel SelectPanel = new JPanel();

	String[] categorys = {"이름","닉네임","아이디(ID)","비밀번호(PW)","성별"};
	JComboBox<String> category = new JComboBox<> (categorys);
	
	/* 검색 필터링 */
	JCheckBox c1 = new JCheckBox("id_no",true);
	JCheckBox c2 = new JCheckBox("name",true);
	JCheckBox c3 = new JCheckBox("nickname",true);
	JCheckBox c4 = new JCheckBox("id",true);
	JCheckBox c5 = new JCheckBox("password",true);
	JCheckBox c6 = new JCheckBox("gender",true);
	JCheckBox c7 = new JCheckBox("year",true);
	JCheckBox c8 = new JCheckBox("month",true);
	JCheckBox c9 = new JCheckBox("day",true);
	JCheckBox c10 = new JCheckBox("phone",true);
	JCheckBox c11 = new JCheckBox("post",true);
	JCheckBox c12 = new JCheckBox("road",true);
	JCheckBox c13 = new JCheckBox("detail",true);
	JCheckBox c14 = new JCheckBox("email",true);
	JCheckBox c15 = new JCheckBox("img",true);
	JCheckBox c16 = new JCheckBox("imgPath",true);
	JCheckBox c17 = new JCheckBox("role",true);
	JCheckBox c18 = new JCheckBox("win",true);
	JCheckBox c19 = new JCheckBox("lose",true);
	JCheckBox c20 = new JCheckBox("admin_code",true);
	Vector<String> Head = new Vector<String>();
	
	JTable table;
	DefaultTableModel model;
	
	/* JLabel */
	JLabel range_searchL = new JLabel("검색 컬럼");
	JLabel condition_searchL = new JLabel("검색 범위");
	
	JLabel selUserL = new JLabel("선택한 회원");
	
	/* JTextField */
	JTextField search = new JTextField();
	
	/* JButton 버튼 */
	JButton searchBtn = new JButton("검색");
	JButton detailBtn = new JButton("조건 검색");
	JButton addUBtn = new JButton("회원추가");
	JButton updateUBtn = new JButton("회원 수정");
	JButton removeBtn = new JButton("회원 삭제");
	 
	
	
	public ManageUserFrame() {
		//c = _c;
		
		setTitle ("회원 관리");
		
		search.setPreferredSize(new Dimension(100,25));
		
		// 검색 조건 
		CbxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		CbxPanel.add(range_searchL);
		CbxPanel.add(search);
		CbxPanel.add(searchBtn);
		
		chxPanel.setLayout(new FlowLayout (FlowLayout.LEFT));
		chxPanel.add(condition_searchL);
	//	chxPanel.add(c1);
		chxPanel.add(c2);
		chxPanel.add(c3);
		chxPanel.add(c4);
		chxPanel.add(c5);
		chxPanel.add(c6);
		chxPanel.add(c7);
		chxPanel.add(c8);
		chxPanel.add(c9);
		chxPanel.add(c10);
		chxPanel.add(c11);
		chxPanel.add(c12);
		chxPanel.add(c13);
		chxPanel.add(c14);
	//	chxPanel.add(c15);
		chxPanel.add(c16);
		chxPanel.add(c17);
		chxPanel.add(c18);
		chxPanel.add(c19);
		chxPanel.add(c20);
		chxPanel.add(detailBtn);
		
		
		JPanel Top = new JPanel();
		Top.setLayout(new BoxLayout(Top, BoxLayout.Y_AXIS));
		Top.add(CbxPanel);
		Top.add(chxPanel);
		
		JPanel Bottom = new JPanel();
		Bottom.setLayout(new BoxLayout(Bottom,BoxLayout.X_AXIS));
		Bottom.add(addUBtn);
		Bottom.add(updateUBtn);
		Bottom.add(removeBtn);
		
		add(Top,BorderLayout.NORTH);
		add(Bottom, BorderLayout.SOUTH);
		
		/*
		ButtonListener bl = new ButtonListener();
		
		searchBtn.addActionListener(bl);
		detailBtn.addActionListener(bl);
		addUBtn.addActionListener(bl);
		updateUBtn.addActionListener(bl);
		removeBtn.addActionListener(bl);
		
		*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		new ManageUserFrame();
	}
	
}
