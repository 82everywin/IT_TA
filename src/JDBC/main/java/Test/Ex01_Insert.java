package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01_Insert {
	public static void main(String[] args) {
				//오라클DB서버 접근 기본 정보  =>> context.xml 작성 대신 
				String url	 = "jdbc:oracle:thin:@localhost:1521:xe";    //포트번호 1521, 본인지칭 아이피 : 27.0.0.1 이나 localhost
				String user = "hhs";
				String password = "0000";
				String driver = "oracle.jdbc.driver.OracleDriver";
				
				Connection conn=null; 				//DB연결
				PreparedStatement pstmt=null;    //SQL변환
				ResultSet rs=null;		
				
				try {
					// Context --> 아래와 같이 드라이버 연결로 사용합니다..
					Class.forName(driver);
					
					// DB oracle  서버 연결 
					conn = DriverManager.getConnection(url, user,password);
					System.out.println("[Server] 오라클 DB 서버 연결 성공");
					
					// SQL 쿼리문 작성 
					int no = 07;
					String name = "칠칠";
					String major = "코딩";
					
					String sql ="INSERT INTO student(s_no,s_name,s_major) VALUES(?,?,?)";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, no);
					pstmt.setString(2, name);
					pstmt.setString(3, major);
					int cnt = pstmt.executeUpdate();
					if(cnt == 0) {
						System.out.println("Insert 실패");
					}else {
						System.out.println("Insert 성공");
					}
			
				}catch(Exception e) {
					System.out.println("[Server] 실패");
				}finally{  //자원반납
					try{
						if(rs!=null){
							rs.close();
						}
					
						if(pstmt!=null){
							pstmt.close();
						}
						if(conn!=null){
							conn.close();
						}
					}catch(Exception e) {
						e.printStackTrace();
						
					}
					
				}
	}

}
