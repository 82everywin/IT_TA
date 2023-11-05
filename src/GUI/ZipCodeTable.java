package GUI;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ZipCodeTable extends JPanel {
	
	private JTable table;
	
	public ZipCodeTable() {
		String header[] = {"우편번호","주소"};
		String cells[][] = new String[8][header.length];
		
		table = new JTable(cells,header);

		
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer celAlignleft = new DefaultTableCellRenderer();
		celAlignleft.setHorizontalAlignment(JLabel.LEFT);
	
	
		table.getColumn("우편번호").setPreferredWidth(10);
		table.getColumn("우편번호").setCellRenderer(celAlignCenter);
		table.getColumn("주소").setPreferredWidth(80);
		table.getColumn("주소").setCellRenderer(celAlignleft);
		
		
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		JScrollPane jspWN = new JScrollPane(table);
		jspWN.setBounds(0, 0, 569, 206);
		this.add(jspWN);// JScrollPanel을 사용하지 않으면 헤더가 보이지 않는다!!
	}

}
