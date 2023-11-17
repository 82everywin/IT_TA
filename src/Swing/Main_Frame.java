package Swing;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main_Frame extends JFrame  {
	
	Shop shop = null;
		
	JPanel panel = new JPanel(new BorderLayout());
	JPanel topPanel = new JPanel() ;
	JPanel borderPanel = new JPanel();
	
	
	// 이미지 2개 (BorderPanel) 
	ImageIcon img = new ImageIcon("./favorite.png");
	ImageIcon img2 = new ImageIcon("./cart.png");
	
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	
	
	public Main_Frame (Shop shop) {
		this.shop= shop;
		
		setTitle("메인 창");
		
		setLayout(null);
		
		topPanel.setLayout(null);
		topPanel.setBounds(0,0,480,600);
		topPanel.setBackground(Color.WHITE);
		
		borderPanel.setLayout(null);	 
		borderPanel.setBounds(0,600,480,120);
		borderPanel.setBackground(Color.LIGHT_GRAY);
		
		// 기본 컨테이너로 지정 
		setContentPane(panel);
		panel.add(topPanel);
		panel.add(borderPanel);
		
		
		// 버튼 위에 이미지
		btn1 = new JButton(img);
		btn2 = new JButton(img2);
		
		// 버튼 위치 잡기 
		btn1.setBounds(0,0,240,80);
		btn2.setBounds(230,0,240,80);
		borderPanel.add(btn1);
		borderPanel.add(btn2);
		
		// 올려두기 
		panel.add(borderPanel);
		panel.add(topPanel);
		
		
		// 장바구니		
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBorderPainted(false);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.out.println("장바구니로 이동");
				shop.f2.setVisible(true);
				
			}
		});
		

		// 즐겨찾기
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBorderPainted(false);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.out.println("즐겨찾기로 이동");
				shop.f3.setVisible(true);
			}
		});
		
		setLocation(200,200);
		setSize(480,720);
		setVisible(true);
	}
}

