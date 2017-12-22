/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodepad.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author Long Nguyen Nhat
 */
public class nodepad extends JFrame{
    
    JMenuBar bar;
    JMenu mnuFile, mnuEdit;
    JMenuItem itemNew, itemOpen, itemSave, itemExit,
            itemCopy, itemCut, itemPaste;
    JTextArea txtArea;
    
    JFileChooser chooser = new JFileChooser();
    public nodepad(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        bar = new JMenuBar();
        this.setJMenuBar(bar);
        
        mnuFile = new JMenu("File");
        bar.add(mnuFile);
        mnuEdit = new JMenu("Edit");
        bar.add(mnuEdit);
        
        itemNew = new JMenuItem("New");
        mnuFile.add(itemNew);
        itemNew.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        itemOpen = new JMenuItem("Open");
        mnuFile.add(itemOpen);
        itemSave = new JMenuItem("Save");
        mnuFile.add(itemSave);
        mnuFile.addSeparator();
        itemExit = new JMenuItem("Exit");
        mnuFile.add(itemExit);
        
        itemCut = new JMenuItem("Cut");
        itemCopy = new JMenuItem("Copy");
        itemPaste = new JMenuItem("Paste");
        mnuEdit.add(itemCut);
        mnuEdit.add(itemCopy);
        mnuEdit.add(itemPaste);
        
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        
        txtArea = new JTextArea();
        JScrollPane scArea = new JScrollPane(txtArea, 
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(scArea, BorderLayout.CENTER);
    }

    private void addEvents() {
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        itemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
            }
        });
        
        itemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
                    File selectedFile = chooser.getSelectedFile();
                    try {
                        BufferedReader br = new BufferedReader(
                                new InputStreamReader(
                                        new FileInputStream(selectedFile), "UTF-8"));
                        String line = br.readLine();
                        StringBuilder builder = new StringBuilder();
                        while(line!=null) {
                            builder.append(line+"\n");
                            line = br.readLine();
                            
                        }
                        br.close();
                        txtArea.setText(builder.toString());
                     } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    
                }
            }
        });
    }
    
    public void showWindow() {
        this.setSize(900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
