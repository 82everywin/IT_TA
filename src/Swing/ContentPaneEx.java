package Swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	
	public ContentPaneEx () {
		setTitle("컨텐트팬");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		
		contentPane.setBackground(Color.gray);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,40,0));
		
		contentPane.add(new Button("OK"));
		contentPane.add(new Button("Cancel"));
		contentPane.add(new Button("Ignore"));
		
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
