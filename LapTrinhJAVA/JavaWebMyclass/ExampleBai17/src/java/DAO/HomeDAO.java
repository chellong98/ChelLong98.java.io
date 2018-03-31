/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.EMP;
import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class HomeDAO {
    public static List<EMP> totalEMP() {
        List<EMP> list = new ArrayList<>();
        Connection conn = DBConnection.createConnection();
        String sql = "select * from examplebai17.emp";
        try {
            PreparedStatement preStatement = conn.prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            while (result.next()) {
                EMP emp = new EMP();
                emp.setId(result.getInt("id"));
                emp.setName(result.getString("name"));
                emp.setSalary(result.getFloat("salary"));
                list.add(emp);
            }
            conn.close();
        } catch (Exception e) {
        }
        
        return list;
    }
    public static List<EMP> displayEMP(int start, int count) {
        List<EMP> list = new ArrayList<>();
        Connection conn = DBConnection.createConnection();
        String sql = "select * from examplebai17.emp limit "+start+","+count+"";
        try {
            PreparedStatement preStatement = conn.prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            while (result.next()) {
                EMP emp = new EMP();
                emp.setId(result.getInt("id"));
                emp.setName(result.getString("name"));
                emp.setSalary(result.getFloat("salary"));
                list.add(emp);
            }
            conn.close();
        } catch (Exception e) {
        }
        
        return list;
    }
    public static void main(String[] args) {
        List<EMP> list = displayEMP(1, 7);
        for(EMP em : list) {
            System.out.println(em);
        }
    }
}

