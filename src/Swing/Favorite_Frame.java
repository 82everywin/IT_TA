package Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Favorite_Frame extends JFrame{

	Shop shop =null;
	
	JPanel panel = new JPanel();
	
	ImageIcon img3 = new ImageIcon("./favorite.png");
	JButton btn4 = new JButton(img3);
	
	public Favorite_Frame(Shop shop) {
		this.shop = shop;
		
		setTitle("즐겨찾기 창");
		
		setLayout(null);
		setContentPane(panel);

		
	//	btn4.setLayout(null);
		btn4.setBounds(30, 30, 50, 40);
		btn4.setBorderPainted(true);
		panel.add(btn4);
		
	
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.out.println("메인으로 이동");
				shop.f.setVisible(true);
			}
		});			
		
		setLocation(200,200);
		setSize(480,720);
		//	setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
