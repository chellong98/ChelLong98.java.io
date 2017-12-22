package testconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestKetNoiAccess {

	public static void main(String[] args) {
		try
		{
			String databasePath="C:\\Users\\Long Nguyen Nhat\\Desktop\\Database11.accdb";
			String strConnection="jdbc:ucanaccess://"+databasePath;
			Connection conn=DriverManager.getConnection(strConnection);
			if(conn!=null)
			{
				System.out.println("Kết nối tới CSDL csdlmau.accdb thành công");
			}
			else
			{
				System.out.println("Kết nối tới CSDL csdlmau.accdb thất bại");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
