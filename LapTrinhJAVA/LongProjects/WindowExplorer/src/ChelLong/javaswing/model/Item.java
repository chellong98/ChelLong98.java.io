/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.javaswing.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Item extends JPanel{
    JLabel lblItem;
    File file;
    public Item(File file, ImageIcon icon) {
        this.setLayout(new BorderLayout());
        lblItem = new JLabel(file.getName(), icon, JLabel.LEADING);
        this.add(lblItem);
        this.file = file;
        
//        Border border = BorderFactory.createLineBorder(Color.BLUE);
//     this.setBorder(border);
    }

    public JLabel getLblItem() {
        return lblItem;
    }

    public void setLblItem(JLabel lblItem) {
        this.lblItem = lblItem;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    
}
