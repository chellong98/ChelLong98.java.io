/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Lesson14;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Long Nguyen Nhat
 */
public class MyFrame extends JFrame{

    public MyFrame() {
        super("MyFrame");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        addControls();
    }

    private void addControls() {
        JLabel lbl = new JLabel("Hello world");
        lbl.setForeground(Color.BLUE);
        lbl.setFont(new Font(null, Font.ITALIC, 100));
        
        JButton btn = new JButton();
        add(lbl);
    }
    
}
