/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author Administrator
 */
public class TestJframe extends JFrame{
    JTextPane areaInput;
    JButton btnSubmit;
    public TestJframe (String title) {
        super(title);
        addControl();
        addEvent();
        
    }
    
    public void addControl() {
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        
        areaInput = new JTextPane();
        
        JScrollPane scArea = new JScrollPane(areaInput);
        con.add(scArea, BorderLayout.CENTER);
        
        btnSubmit = new JButton("submit");
        con.add(btnSubmit, BorderLayout.SOUTH);
    }
    
    public void addEvent() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyCheckLoiSai();
            }
        });
    }
    public void xuLyCheckLoiSai() {
        
    }
    public void showWindow() {
        this.setSize(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestJframe ui = new TestJframe("test");
        ui.showWindow();
    }
    
}
