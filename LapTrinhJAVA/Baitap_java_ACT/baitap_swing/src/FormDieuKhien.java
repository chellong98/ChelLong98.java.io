
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long Nguyen Nhat
 */
public class FormDieuKhien extends JFrame{
    JPanel pnlKhung;
    JLabel lblDieuKhien;
    JButton btnXoaDuLieu;
    JButton btnLuuLai;
    JButton btnThoat;
    
    public FormDieuKhien () {
        this.setVisible(true);
        this.setSize(600,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        
        pnlKhung = new JPanel(true);
        lblDieuKhien = new JLabel("Điều Khiển");
        btnXoaDuLieu = new JButton("Xóa Dữ Liệu");
        btnLuuLai = new JButton("Lưu Lại");
        btnThoat = new JButton("Thoát");
        
        this.setLayout(new FlowLayout());
        this.getContentPane().add(pnlKhung);
        this.getContentPane().add(lblDieuKhien);
        
        this.getContentPane().add(btnXoaDuLieu);
        btnXoaDuLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDuLieuActionPerformed(evt);
            }
        });
        this.getContentPane().add(btnLuuLai);
        btnLuuLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuLaiActionPerformed(evt);
            }
        });
        this.getContentPane().add(btnThoat);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        pack();
    }
    
    private void btnLuuLaiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        JOptionPane.showMessageDialog(this, "Có cái đéo gì mà lưu :3", "súc vật", 2);

    }                                       
    private void btnXoaDuLieuActionPerformed (java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "xóa các concac :)", "óc chó", 2);
    }
    private void btnThoatActionPerformed (java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Thoát làm cái đéo gì?", "vô học", 2);
    }
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDieuKhien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDieuKhien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDieuKhien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDieuKhien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() { //thư viện chạy
            public void run() {

                FormDieuKhien flow = new FormDieuKhien();
                flow.setLocationRelativeTo(null);
            }
        });
    }
    
}
