package project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main_Frame extends JFrame  {
	
	Shop shop;
	
	private String name;
	
	JPanel panel = new JPanel(new BorderLayout());
	JPanel topPanel = new JPanel() ;
	JPanel borderPanel = new JPanel();
	
	
	// 이미지 2개 (BorderPanel) 
	ImageIcon img = new ImageIcon("./src/project/cart11.jpg");
	ImageIcon img2 = new ImageIcon("./src/project/star4.jpg");
	
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	
	
	public Main_Frame (String name) {
		this.name = name;
		
		
		setLayout(null);
		setLocation(200,200);
		setSize(480,720);
		panel.setVisible(true);
		
		topPanel.setLayout(null);
		topPanel.setBounds(0,0,480,600);
		topPanel.setBackground(Color.WHITE);
		
		setContentPane(panel);
		panel.add(topPanel);
		panel.add(borderPanel);
		
		
		borderPanel.setLayout(null);
		borderPanel.setBounds(0,600,480,120);
		btn1.setBounds(0,0,240,80);
		btn2.setBounds(230,0,240,80);
		borderPanel.setBackground(Color.LIGHT_GRAY);
		borderPanel.add(btn1);
		borderPanel.add(btn2);
		
		panel.add(borderPanel);
		panel.add(topPanel);
		
		
		// 장바구니
		btn1 = new JButton(img);
		
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
		btn2 = new JButton(img2);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBorderPainted(false);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.out.println("즐겨찾기로 이동");
			//	shop.f3.setVisible(true);
			}
		});
		
	}
}
