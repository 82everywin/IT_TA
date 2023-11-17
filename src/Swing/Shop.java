package Swing;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Shop {
	
	Main_Frame f = null;
	Cart_Frame f2 = null;
	Favorite_Frame f3 = null;


	public static void main(String[] args) {
		Shop shop = new Shop();
		
		try {
			shop.f = new Main_Frame(shop);
			shop.f2 = new Cart_Frame(shop);
			shop.f3 = new Favorite_Frame(shop);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}

}
