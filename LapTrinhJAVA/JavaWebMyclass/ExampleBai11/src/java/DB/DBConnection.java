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
    public static Connection createConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost/ExampleBai11";
        String username = "root";
        String password = "longvip98";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    

}
