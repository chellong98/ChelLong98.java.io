/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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

    public ArrayList<HashMap<String, String>> ListCategory() {
        ArrayList<HashMap<String,String>>list = new ArrayList<>();
        HashMap<String, String> category = null;
        try {
            String sql = "select * from category";
            PreparedStatement preStatement = conn.prepareStatement(sql);
            ResultSet rs = preStatement.executeQuery();
            while(rs.next()) {
                category = new HashMap<>();
                category.put("CategoryId", rs.getInt(1)+"");
                category.put("CategoryName", rs.getString(2)+"");
                list.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
            
    
    public static void main(String[] args) {
        SQLService sql = new SQLService("root", "longvip98", "suckhoe");
        if (sql.conn != null) {
            System.out.println("kết nối thành công");
        } else {
            System.out.println("kết nối ko thành công");
        }
        ArrayList<HashMap<String,String>>list = sql.ListCategory();
        for(HashMap<String,String> map : list) {
            System.out.println("{");
            Iterator it = map.keySet().iterator();
            while(it.hasNext()) {
                String key = it.next()+"";
                String value = map.get(key)+"";
                System.out.println("{"+key +" : "+value+"}");
            }
            System.out.println("}");
        }
    }
}
