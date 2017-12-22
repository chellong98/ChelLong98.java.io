/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
public class frmLogin_flowLayout extends JFrame{
    JLabel lblUserName;
    JLabel lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;
    JButton btnCancel;

    public frmLogin_flowLayout() {
        this.setVisible(true);
        this.setSize(500,100);//size 500
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        lblUserName = new JLabel("User Name");
        txtUsername = new JTextField(10);
        lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField(10);
         btnLogin = new JButton("Login");
         btnCancel = new JButton("Cancel");
           
         this.setLayout(new FlowLayout());
         this.getContentPane().add(lblUserName);
         this.getContentPane().add(lblPassword);
         this.getContentPane().add(txtUsername);
         this.getContentPane().add(txtPassword);
         this.getContentPane().add(btnLogin);
         this.getContentPane().add(btnCancel);
    }
    
    public static void main(String[] args) {
        frmLogin_flowLayout flow = new frmLogin_flowLayout();
    }
    
}
