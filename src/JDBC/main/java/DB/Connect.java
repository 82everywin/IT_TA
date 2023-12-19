package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static void main(String[] args) {
		
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"hhs","0000"
					);
			System.out.println("접속 성공!");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("드라이버 로드 실패 : "+ e.getMessage());
		}finally{
            try {
                conn.close();
            } catch (Exception e) {}
        }
 
	}

}
