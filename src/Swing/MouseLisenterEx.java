package Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseLisenterEx extends JFrame{

	private JLabel la = new JLabel("hello");
	
	public MouseLisenterEx() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		
		con.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		con.add(la);
		
		con.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				la.setLocation(x,y);
			}
		});
		
		setSize(250,250);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new MouseLisenterEx();
	}
}
