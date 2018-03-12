package pccc.detaikhoahoc.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerService {
	protected Connection conn;
	
	public SQLServerService () {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectUrl = "jdbc:sqlserver://" + "localhost" + ":1433;"+"databaseName=" + "dbThuatNguPCCC;" + "integratedSecurity=true;";
			conn = DriverManager.getConnection(connectUrl);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		SQLServerService q = new SQLServerService();
		if(q.conn!=null) {
			System.out.println("kết nối thành công");
		} else {
			System.out.println("kết nối không thành công");
		}
	}
	
}
