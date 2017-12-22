/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswing;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Nguyen Thai Son
 */
public class frmMyNodePad extends JFrame{
    JMenuBar menuBar;
    JMenu mnFile;
    JMenu mnEdit;
    JMenuItem mniNew;
    JMenuItem mniOpen;
    JMenuItem mniSave;
    public frmMyNodePad() {
        this.setVisible(true);
        this.setSize(200,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        mnFile= new JMenu("File");
        mnFile.setMnemonic(KeyEvent.VK_F);
        mnEdit= new JMenu("Edit");
        menuBar.add(mnFile);
        mniNew = new JMenuItem("New");
        mniOpen = new JMenuItem("Open");
        mniSave = new JMenuItem("Save");
        mnFile.add(mniNew);
        mnFile.add(mniOpen);
        mnFile.add(mniSave);
        menuBar.add(mnEdit);
        
        //this.getContentPane().add(menuBar);
    }
    public static void main(String[] args) {
        new frmMyNodePad();
    }
}
