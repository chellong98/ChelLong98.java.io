package Chellong.javaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestKetNoiAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String databasePath = "E:\\csdlmau.accdb";
			String strConnetion = "jdbc:ucanaccess://"+databasePath;
			Connection conn = DriverManager.getConnection(strConnetion);
			if (conn!=null) {
				System.out.println("kết nối thành công");
			} else {
				System.out.println("kết nối thất bại");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
