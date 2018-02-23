/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Administrator
 */
import BEAN.Account;
import DB.DBConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RegisterDAO {
    public static boolean InsertAcount(Connection conn, Account acc) {
        String sql = "insert into examplebai12.account(username, password) values(?,?)";
        PreparedStatement preStatement = null;
        String username = acc.getUsername();
        String password = acc.getPassword();
        try {
            preStatement = conn.prepareStatement(sql);
            preStatement.setString(1, username);
            preStatement.setString(2, password);
            int result = preStatement.executeUpdate();
            
            if(result!=0) {
                return true;
            }
            
            preStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
        Connection conn = DBConnection.createConnection();
        Account acc = new Account();
        acc.setUsername("long");
        acc.setPassword("longvip98");
        
        boolean check = RegisterDAO.InsertAcount(conn, acc);
        if(check) {
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
    }
}
