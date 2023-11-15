package project;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Shop {
	
 Main_Frame f = null;
	static Cart_Frame f2 = null;
	static Favorite_Frame f3 = null;
	
	
	
	public static void main(String[] args) {
		
		try {
			 Main_Frame f = new Main_Frame("메인 창");
			f2 = new Cart_Frame("장바구니 창");
			f3 = new Favorite_Frame("즐겨찾기 창");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}

}
