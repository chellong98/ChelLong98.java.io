/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Driver;
import java.util.Hashtable;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Test_database {

    /**
     * @param args the command line arguments
     */
    public static Connection openConnection() {
        Connection conn = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Hashtable ht = readConfig();
           
            String HOST = (String) (ht.get("HOST")); //lấy ra giá trị dựa vào key
            String POST = (String) (ht.get("POST"));//key là POST
            String DATABASE = (String) (ht.get("DATABASE"));//key là  DATABASE
//            System.out.println(HOST + POST + DATABASE);
            String url = "jdbc:sqlserver://" + HOST + ":" + POST + ";databaseName=" + DATABASE;
            String username = (String) (ht.get("username"));

            String password = (String) (ht.get("password"));
            conn = DriverManager.getConnection(url, username, password); //mở kết nối tới db
        } catch (Exception e) {
        }
        if (conn != null) {
            return conn;
        } else {
            return null;
        }
    }

    public static Hashtable readConfig() {
        Hashtable hashtable = null;
        try {
            FileReader fr = new FileReader(new File("G:\\LapTrinhJAVA\\Java_ACT\\test_database\\config.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            hashtable = new Hashtable<String, String>();
            String key;
            String value;
            while ((line = br.readLine()) != null) {
                key = line.split("=")[0];
                value = line.split("=")[1];
                hashtable.put(key, value);
            }
        } catch (Exception e) {
        }
        return hashtable;
    }

    public static void closeConnection(Connection conn, Statement st, PreparedStatement ps, ResultSet rs) {
        try {
            if (conn != null) {
                conn.close();
            }
            if (st != null) {
                st.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        Connection conn = Test_database.openConnection();
        System.out.println(conn);
        Statement st = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            st = conn.createStatement();
                        System.out.println("dsfd");

            rs = st.executeQuery("select * from myProduce");
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("adress: " + rs.getString("address"));
                System.out.println("description: " + rs.getString("description"));
            }
            if (conn != null) {
                System.out.println("mở kết nối thành công");
            } else {
                System.out.println("kết nối k thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Test_database.closeConnection(conn, st, ps, rs);
        }

    }

}
