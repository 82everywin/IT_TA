package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Event_listener extends JFrame{
	public Event_listener() {
		setTitle("익명클래스_이벤트리스터");
		
		JPanel pan = new JPanel();
		pan.setLayout(null);
		
		JButton btn = new JButton("액션!!");
		btn.setSize(100,40);
		btn.setLocation(50,50);
		pan.add(btn);
		pan.setSize(100,100);
	
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(btn.getText().equals("액션!!")){
					btn.setText("Action");
				}else {
					btn.setText("몰라!!!");
				}
				
				setTitle(btn.getText());
				
			}
		});
		
		setContentPane(pan);
		
		setSize(350,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	}
	
	public static void main (String [] args) {
		new Event_listener();
	}
}
