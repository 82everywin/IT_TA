package project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Cart_Frame extends JFrame{
	
	//Shop shop;
	
	private String name; 
	
	JPanel panel = new JPanel();
	
	ImageIcon img3 = new ImageIcon("./src/project/back.jpg");
	JButton btn3 = new JButton();
	
	
	
	public Cart_Frame(String name) {
		this.name = name;
		
		setContentPane(panel);  // 기본 컨테이너 
		
		
		
		
		setLayout(null);
		setLocation(200,200);
		setSize(480,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn3.setLayout(null);
		btn3.setBounds(30, 30, 50, 40);
		btn3.setBorderPainted(true);
		panel.add(btn3);
		

		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				
				System.out.println("메인으로 이동");
				//shop.f.setVisible(true);
			}
		});
		
		setLayout(null);
		setLocation(200,200);
		setSize(480,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	
}


