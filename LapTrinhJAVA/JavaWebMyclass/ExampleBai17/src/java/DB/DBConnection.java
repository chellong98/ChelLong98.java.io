/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class DBConnection {
    public static Connection createConnection () {
        Connection conn  = null;
        String username = "root";
        String password  = "longvip98";
        String url = "jdbc:mysql://localhost:81/examplebai17?characterEncoding=UTF-8&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
     public static void main(String[] args) {
        Connection conn = DBConnection.createConnection();
        if(conn!=null) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
    }
}
