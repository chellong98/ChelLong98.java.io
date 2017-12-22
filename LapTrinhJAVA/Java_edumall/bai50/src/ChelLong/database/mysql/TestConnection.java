package ChelLong.database.mysql;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String strConn = "jdbc:mysql://localhost/dbtaisan";
			Properties pro = new Properties();
			pro.put("user", "root");
			pro.put("password", "");
			Driver driver = new Driver();
			Connection conn = driver.connect(strConn, pro);
			if (conn!=null) {
				System.out.println("kết nối thành công");
			} else {
				System.err.println("kết nối thất bại");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
