package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Cart_Frame extends JFrame{
	
	Shop shop=null;
	
	JPanel panel = new JPanel();
	JButton btn3 = new JButton(new ImageIcon("./cart.png"));
	
	
	public Cart_Frame(Shop shop) {
		this.shop = shop;
		
		setTitle("장바구니 창");
		setLayout(null);

		setContentPane(panel);  // 기본 컨테이너 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btn3.setBounds(30, 30, 50, 40);
		btn3.setBorderPainted(true);
		panel.add(btn3);
		

		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				System.out.println("메인으로 이동");
				shop.f.setVisible(true);
			}
		});
		
		setLocation(200,200);
		setSize(480,720);

	}
	
	
}


