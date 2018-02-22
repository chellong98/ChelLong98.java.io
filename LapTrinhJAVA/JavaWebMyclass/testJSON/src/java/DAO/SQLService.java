/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class SQLService {

    Connection conn = null;

    public SQLService(String username, String password, String databaseName) {
        String sql = "jdbc:mysql://localhost:3306/" + databaseName + "?userUnicode=true&characterEncoding=utf-8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(sql, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SQLService sql = new SQLService("root", "longvip98", "suckhoe");
        if (sql.conn != null) {
            System.out.println("kết nối thành công");
        } else {
            System.out.println("kết nối ko thành công");
        }
        
    }
}
