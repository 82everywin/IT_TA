package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02_Select {
	
	public static void main(String[] args) {
		
		String url	 ="jdbc:oracle:thin:@localhost:1521:xe"; 
		String user ="hhs";
		String password ="0000";
		String driver ="oracle.jdbc.driver.OracleDriver";
	
		
		Connection conn=null; 	
		PreparedStatement pstmt=null;  
		ResultSet rs=null;		

		try {
			Class.forName(driver);
			
			conn =DriverManager.getConnection(url,user,password);
			System.out.println("Oracle DB 서버 연결 성공 ");
			
			String sql= "SELECT * FROM student";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("s_no"));
				System.out.print(rs.getString("s_name"));
				System.out.print(rs.getString("s_major"));
				System.out.println();
			}
		}catch(Exception e){
			System.out.println("실패" + e.getMessage());
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
			}catch(Exception e){
				e.printStackTrace();
			}
		}//try end
	}

}
