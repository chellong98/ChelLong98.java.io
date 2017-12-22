/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoa2;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GiaoDien extends JFrame{
    JLabel tieude = new JLabel();
    JLabel hesoA = new JLabel();
    JLabel hesoB = new JLabel();
    JLabel ketqua = new JLabel();
    
    JTextField txtKhungHesoA = new JTextField();
    JTextField txtKhungHesoB = new JTextField();
    JTextField txtKhungKetqua = new JTextField();
    
    JButton btnThuchien = new JButton();
    JButton btnXoa = new JButton();
    JButton btnThoat = new JButton();
    
    public GiaoDien () {
        init();
    }
    public void init () {
        /*khởi tạo khung*/
        this.getContentPane().setLayout(null);
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        /*tiêu đề*/
        tieude.setBackground(Color.cyan);
        tieude.setOpaque(true);
        tieude.setBounds(190, 60, 140, 30); //cột dòng dài rộng
        tieude.setText("Giải phương trình bậc 1");
        this.getContentPane().add(tieude);
        
        /*hệ số A*/
        hesoA.setBounds(90, 110, 140, 30);
        hesoA.setText("Hệ số A");
        this.getContentPane().add(hesoA);
        /*khung hệ số A*/
        txtKhungHesoA.setBounds(150, 115, 40, 20);
        this.getContentPane().add(txtKhungHesoA);
        
        /*hệ số B*/
        hesoB.setBounds(90, 140, 140, 30);
        hesoB.setText("Hệ số B");
        this.getContentPane().add(hesoB);
        /*khung hệ số B*/
        txtKhungHesoB.setBounds(150, 145, 40, 20);
        this.getContentPane().add(txtKhungHesoB);
        
        /*kết quả*/
        ketqua.setBounds(90, 170, 140, 30);
        ketqua.setText("Kết quả");
        this.getContentPane().add(ketqua);
        /*khung kết quả*/
        txtKhungKetqua.setBounds(150, 175, 160, 20);
        this.getContentPane().add(txtKhungKetqua);
        
        /*button thực hiện*/
        btnThuchien.setBackground(Color.yellow);
        btnThuchien.setOpaque(true);
        btnThuchien.setBounds(100, 200, 100, 30);
        btnThuchien.setText("Thực hiện");
        this.getContentPane().add(btnThuchien);
        
        /*button xóa*/
        btnXoa.setBackground(Color.yellow);
        btnXoa.setOpaque(true);
        btnXoa.setBounds(220, 200, 80, 30);
        btnXoa.setText("Xóa");
        this.getContentPane().add(btnXoa);
        
        /*button Thoát*/
        btnThoat.setBackground(Color.yellow);
        btnThoat.setOpaque(true);
        btnThoat.setBounds(320, 200, 80, 30);
        btnThoat.setText("Thoát");
        this.getContentPane().add(btnThoat);
    }
    
    public static void main(String[] args) {
        new GiaoDien();
    }
}
