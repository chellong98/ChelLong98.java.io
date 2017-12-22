/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Nguyen Nhat
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionFactory {
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";// jdbc:oracle:thin:@(DESCRIPTION
																			// =(ADDRESS
																			// =
																			// (PROTOCOL=
																			// TCP)(Host=
																			// 127.0.0.1)(Port=
																			// 1521))(CONNECT_DATA
																			// =
																			// (sid
																			// =
																			// XE)))
	public static final String USER = "MOBIuser_V2";
	public static final String PASS = "mobipass";
        
        public void writePropertiesFile () {
            try {
                 Properties properties = new Properties();
                 properties.setProperty("USER", USER);
                 properties.setProperty("PASS", PASS);
                 
                 File file = new File ("account.properties");
                 FileOutputStream fileOut = new FileOutputStream(file);
                 properties.store(fileOut, "my account");
                 fileOut.close();
                 
            } catch (FileNotFoundException e) {
                System.out.println("exception: " + e.getMessage());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        public static void DataInput () {
            try {
                FileInputStream fileIn = new FileInputStream("G:\\LapTrinhJAVA\\duAnThayTuan\\testing");
                DataInputStream data = new DataInputStream(fileIn);
                
                String s = data.readLine();
                
                fileIn.close();
                data.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	// private static Connection mConnection;

	/**
	 * Get a connection to database
	 * 
	 * @return Connection object
	 */
//	public static Connection getConnection() {
//		 try {
//		 if (mConnection == null || mConnection.isClosed()) {
//		Connection pConnection = null;
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			pConnection = DriverManager.getConnection(URL, USER, PASS);
//		} catch (SQLException ex) {
//			throw new RuntimeException("Error connecting to the database", ex);
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Error ClassNotFoundException", e);
//		}
//		 }
//		 } catch (SQLException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }
//
//		//return ConnectionManager.getConnection();
//
//	}

	/**
	 * Test Connection
	 */
	public static void main(String[] args) {
//		for
//		Connection connection = ConnectionFactory.getConnection();
            ConnectionFactory connect = new ConnectionFactory();
            connect.writePropertiesFile();
	}
}
