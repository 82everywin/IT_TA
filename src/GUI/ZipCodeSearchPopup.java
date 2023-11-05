package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZipCodeSearchPopup extends JFrame {

    public ZipCodeSearchPopup() {
        setTitle("우편번호 검색");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ZipCodeTable table = new ZipCodeTable();

        JLabel example = new JLabel("도로명 주소[도로명/건물명] 또는 지번주소(동/읍/면/리) 입력");
        JLabel searchL = new JLabel("검색어 :");
        JTextField search = new JTextField();
        JButton searchButton = new JButton("검색");
        
        searchL.setPreferredSize(new Dimension(70,20));
        search.setPreferredSize(new Dimension(140,20));
        searchButton.setPreferredSize(new Dimension(60,20));

        panel.add(example);
        panel.add(searchL);
        panel.add(search);
        panel.add(searchButton);
        
        JFrame f = new JFrame();
        f.add(table);
        f.setSize(350,500);
        f.setVisible(true);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 여기에 우편번호 검색을 위한 코드 작성
                // 검색 결과를 사용자에게 보여주거나 다른 처리를 수행
                String zipCode =search.getText();
                PostZip.find(zipCode,1,50);
                JOptionPane.showMessageDialog(ZipCodeSearchPopup.this, "검색된 우편번호: " + zipCode);
            }
        });

        getContentPane().add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ZipCodeSearchPopup());
    }
}
