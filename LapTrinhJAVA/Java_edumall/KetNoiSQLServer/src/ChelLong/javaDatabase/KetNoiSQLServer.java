package ChelLong.javaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiSQLServer {
	
	public static Connection getConnection(String strServer, String strDatabase) {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://"+strServer+":1433;databaseName="+strDatabase+";integratedSecurity=true;";
			conn = DriverManager.getConnection(connectionUrl);
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL exception: " + e.toString());
		} catch (ClassNotFoundException ex) {
			// TODO: handle exception
			System.out.println("Class not found exception: " + ex.toString());
		}
		return conn;
	}
 	
	
	public static void main(String[]args) {
		Connection conn = getConnection("CHELLONGSCOMPUT\\SQLEXPRESS", "dbKhachHang");
		if (conn!=null) {
			System.out.println("kết nối database thành công");
		} else {
			System.out.println("kết nối database thất bại");
		}
	}
}
