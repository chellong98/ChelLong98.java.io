package pccc.detaikhoahoc.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerService {
	protected Connection conn;
	
	public SQLServerService () {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectUrl = "jdbc:sqlserver://" + "CHELLONGSCOMPUT\\SQLEXPRESS" + ":1433;"+"databaseName=" + "dbThuatNguPCCC;" + "integratedSecurity=true;";
			conn = DriverManager.getConnection(connectUrl);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
