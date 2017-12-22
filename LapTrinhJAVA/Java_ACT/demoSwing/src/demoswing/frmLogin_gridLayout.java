/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswing;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Long Nguyen Nhat
 */
public class frmLogin_gridLayout extends JFrame {

    JLabel lblUserName;
    JLabel lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;
    JButton btnCancel;

    public frmLogin_gridLayout() {
        this.setVisible(true); //set giao diện
        this.setSize(500, 150);//size 500 //set size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//đóng chương trình
        this.setAlwaysOnTop(true);
        lblUserName = new JLabel("User Name"); //khởi tạo nhãn Username 
        txtUsername = new JTextField("điền tên của mày vào đây", 10);// khởi tạo nhãn nhập user
        lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField(10);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        this.setLayout(new GridLayout(3, 3)); //3 hàng 2 cột
        this.getContentPane().add(lblUserName);
        this.getContentPane().add(txtUsername);
        this.getContentPane().add(lblPassword);
        this.getContentPane().add(txtPassword);
        this.getContentPane().add(btnLogin);
        this.getContentPane().add(btnCancel);

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() { //thư viện chạy
            public void run() {

                frmLogin_gridLayout grid = new frmLogin_gridLayout();
                grid.setLocationRelativeTo(null);
            }
        });
//        frmLogin_gridLayout grid = new frmLogin_gridLayout();
    }

}
