package GUI;


import java.awt.Color;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import kisti.module.database.KissManDatabase;

/**
 * <pre>
 * kisti.gui.CDF
 *   |_ WorkerNodeStatus.java
 *
 * </pre>
 *
 * Desc : Display status of workernodes 
 * @Company : KISTI
 * @Author :grkim
 * @Date   :2011. 7. 12. 오후 1:56:58
 * @Version:
 *
 */
public class CDFJobTable extends JPanel{

    private JTable table;
    
    /**
     * 
     * Desc : Constructor of WorkerNodeStatus.java class
     */
	public CDFJobTable() {
		// TODO Auto-generated constructor stub
		KissManDatabase db = new KissManDatabase();
		Object obj = db.requestDataFromDataBase("CDFJobTable");

		Vector vector = (Vector) obj;
		String jobTableheader[] = { "Month", "Period", "Users", "Jobs(Total)",
				"Success", "RatioSucessJob", "Wall Time(Hours)", "Status" };
		String jobTablecells[][] = new String[vector.size()][8];
		vector.copyInto(jobTablecells);

		table = new JTable(jobTablecells, jobTableheader);
		table.setBackground(new Color(255, 255, 204));

		

		/**
		 * 셀 간격 조정
		 */
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		DefaultTableCellRenderer celAlignRight = new DefaultTableCellRenderer();
		celAlignRight.setHorizontalAlignment(JLabel.RIGHT);
		
		/**
		 *  각 셀의 넓이 와 정렬20
		 */
		table.getColumn("Month").setPreferredWidth(10);
		table.getColumn("Month").setCellRenderer(celAlignCenter);
		table.getColumn("Period").setPreferredWidth(150);
		table.getColumn("Period").setCellRenderer(celAlignCenter);
		table.getColumn("Users").setPreferredWidth(10);
		table.getColumn("Users").setCellRenderer(celAlignCenter);
		table.getColumn("Jobs(Total)").setPreferredWidth(10);
		table.getColumn("Jobs(Total)").setCellRenderer(celAlignRight);
		table.getColumn("Success").setPreferredWidth(30);
		table.getColumn("Success").setCellRenderer(celAlignRight);
		table.getColumn("RatioSucessJob").setPreferredWidth(10);
		table.getColumn("RatioSucessJob").setCellRenderer(celAlignRight);
		table.getColumn("Wall Time(Hours)").setPreferredWidth(10);
		table.getColumn("Wall Time(Hours)").setCellRenderer(celAlignRight);
		table.getColumn("Status").setPreferredWidth(10);		
		//table.getColumn("Status").setCellRenderer(celAlignCenter);


 		// 행간을 조절한다.
		//tbl.setRowHeight(25);

		
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		JScrollPane jspWN = new JScrollPane(table);
		jspWN.setBounds(0, 0, 569, 206);
		this.add(jspWN);// JScrollPanel을 사용하지 않으면 헤더가 보이지 않는다!!
	}

    /**
     * @param args
     */
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            JFrame f = new JFrame();
            CDFJobTable w = new CDFJobTable();
            f.add(w);
            f.setSize(650,400);
            f.setVisible(true);
    }
}

