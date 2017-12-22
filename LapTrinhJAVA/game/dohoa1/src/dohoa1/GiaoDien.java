/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoa1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GiaoDien extends JFrame {
    public int a;
    private JLabel lbltieude = new JLabel();
    public JTextField txtkhung = new JTextField();
    public JButton btnChao = new JButton();
    public JButton btnXoa = new JButton();
    public JButton btnThoat = new JButton();
    
    public JButton btnRed = new JButton();
    public JButton btnBlue = new JButton();
    public JButton btnGreen = new JButton();

    public GiaoDien() {
        
        this.init();
        
        btnChao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chao();
            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xoa();
            }
        });
       btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thoat();
            }
        });
       btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });
       btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });
       btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });
    }

    public void init() {
        this.setSize(500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        /*tiêu đề*/
        this.getContentPane().setLayout(null); //set layout
        lbltieude.setBackground(Color.CYAN); //cấp màu cho khung
        lbltieude.setOpaque(true);
        lbltieude.setBounds(new Rectangle(200, 60, 100, 30));//cột dòng dài rộng
        lbltieude.setText("      Lớp AT13i");
        this.getContentPane().add(lbltieude);
        /*khung text*/
        txtkhung.setOpaque(true);
        txtkhung.setBounds(new Rectangle(120, 150, 250, 30));
        this.getContentPane().add(txtkhung);
        /*button  chào*/
        btnChao.setBackground(Color.yellow);
        btnChao.setOpaque(true);
        btnChao.setBounds(new Rectangle(100, 200, 80, 30));
        btnChao.setText("   Chào");
        this.getContentPane().add(btnChao);
        /*button xóa*/
        btnXoa.setBackground(Color.yellow);
        btnXoa.setOpaque(true);
        btnXoa.setBounds(new Rectangle(200, 200, 80, 30));
        btnXoa.setText("   Xóa");
        this.getContentPane().add(btnXoa);
        /*button thoát*/
        btnThoat.setBackground(Color.yellow);
        btnThoat.setOpaque(true);
        btnThoat.setBounds(new Rectangle(300, 200, 80, 30));
        btnThoat.setText("   Thoát");
        this.getContentPane().add(btnThoat);
        /*button red*/
        btnRed.setBackground(Color.red);
        btnRed.setOpaque(true);
        btnRed.setBounds(new Rectangle(100, 250, 80, 30));
        btnRed.setText("    red");
        this.getContentPane().add(btnRed);
        /*button blue*/
        btnBlue.setBackground(Color.blue);
        btnBlue.setOpaque(true);
        btnBlue.setBounds(new Rectangle(200, 250, 80, 30));
        btnBlue.setText("    blue");
        this.getContentPane().add(btnBlue);
        /*button green*/
        btnGreen.setBackground(Color.green);
        btnGreen.setOpaque(true);
        btnGreen.setBounds(new Rectangle(300, 250, 80, 30));
        btnGreen.setText("    green");
        this.getContentPane().add(btnGreen);
    }
     public void chao () {
        String text = txtkhung.getText();
        JOptionPane.showMessageDialog(rootPane, "chào " +text);
    }
     public void xoa () {
        txtkhung.setText("");
        txtkhung.setBackground(Color.white);
        txtkhung.setOpaque(true);
    }
    public void red () {
        txtkhung.setBackground(Color.red);
        txtkhung.setOpaque(true);
    }
    public void blue () {
        txtkhung.setBackground(Color.blue);
        txtkhung.setOpaque(true);
    }
    public void green () {
        txtkhung.setBackground(Color.green);
        txtkhung.setOpaque(true);
    }
    public void thoat () {
        System.exit(0);
    }
    public static void main(String[] args) {
        
        GiaoDien view = new GiaoDien();
        
    }
}
