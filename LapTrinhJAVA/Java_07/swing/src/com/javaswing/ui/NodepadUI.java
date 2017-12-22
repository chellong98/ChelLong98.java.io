/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Long Nguyen Nhat
 */
public class NodepadUI extends JFrame {

    private JTextArea txtArea;
    private JMenuBar bar;
    private JMenu mnuFile, mnuEdit, mnuHelp, mnuFormat, mnuView;
    private JMenuItem itemNew, itemOpen, itemSave, itemExit, itemCopy, itemCut, itemPaste, itemUndo;

    private JFileChooser chooser;
    
    protected UndoManager undoManager = new UndoManager();

    public NodepadUI(String title) {
        super(title);
        addControls();
        addEvents();

    }

    private void addControls() {
        try {//tạo giao diện giống window
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        txtArea = new JTextArea();
        txtArea.setWrapStyleWord(true);//xuống dòng nguyên 1 từ
        txtArea.setLineWrap(true);//tự động xuống dòng
        JScrollPane scArea = new JScrollPane(txtArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        con.add(scArea, BorderLayout.CENTER);

//        tạo menubar
        bar = new JMenuBar();
        this.setJMenuBar(bar);

//        tạo các item menu
        mnuFile = new JMenu("File");
        bar.add(mnuFile);
        mnuEdit = new JMenu("Edit");
        bar.add(mnuEdit);
        mnuFormat = new JMenu("Format");
        bar.add(mnuFormat);
        mnuView = new JMenu("View");
        bar.add(mnuView);
        mnuHelp = new JMenu("Help");
        bar.add(mnuHelp);

//        tạo các sub item menu cho File
        itemNew = new JMenuItem("New");
        itemNew.setAccelerator(//tạo phím tắt cho các nút lệnh
                KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        itemNew.setIcon(new ImageIcon("images//new.png"));
        mnuFile.add(itemNew);

        itemOpen = new JMenuItem("Open");
        itemOpen.setAccelerator(
                KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        itemOpen.setIcon(new ImageIcon("images//open.png"));
        mnuFile.add(itemOpen);

        itemSave = new JMenuItem("Save");
        itemSave.setAccelerator(
                KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        itemSave.setIcon(new ImageIcon("images//save.png"));
        mnuFile.add(itemSave);

        mnuFile.addSeparator();//tạo ngăn cách
        itemExit = new JMenuItem("Exit");
        itemExit.setIcon(new ImageIcon("images//exit.png"));
        mnuFile.add(itemExit);

//        tạo các sub item menu cho Edit
        itemUndo = new JMenuItem("Undo");
        itemUndo.setAccelerator(
                KeyStroke.getKeyStroke('Z', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        mnuEdit.add(itemUndo);

        mnuEdit.addSeparator();

        itemCut = new JMenuItem("Cut");
        itemCut.setAccelerator(
                KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        mnuEdit.add(itemCut);

        itemCopy = new JMenuItem("Copy");
        itemCopy.setAccelerator(
                KeyStroke.getKeyStroke('C', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        mnuEdit.add(itemCopy);

        itemPaste = new JMenuItem("Paste");
        itemPaste.setAccelerator(
                KeyStroke.getKeyStroke('V', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        mnuEdit.add(itemPaste);

        chooser = new JFileChooser(); //tạo ra Jfilechooser
    }

    private void addEvents() {
        itemUndo.setEnabled(false);
        itemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyFileMoi();
            }
        });

        itemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyLuu();
            }
        });
        itemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyMoFile();
            }

        });
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyThoatPhanMem();
            }
        });
        itemCut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.cut();
            }
        });
        itemCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.copy();
            }
        });
        itemPaste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.paste();
            }
        });
        txtArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
                updateButtons();
            }
        });
        itemUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    undoManager.undo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                updateButtons();
            }
        });
    }

    private void updateButtons() {
        
        itemUndo.setEnabled(undoManager.canUndo());// undo đc thì mới 
    }
    
    private void xuLyFileMoi() {
        int ret = JOptionPane.showConfirmDialog(null, 
                "bạn có muốn lưu file này không?",
                "hộp thoại hỏi tạo mới",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if(ret == JOptionPane.NO_OPTION) {
            txtArea.setText("");
        } else if(ret == JOptionPane.YES_OPTION){
            xuLyLuu();
        } else {
            return;
        }
    }

    private void xuLyLuu() {
        String data = txtArea.getText();
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            if (selectedFile.exists()) {//nếu file đã tồn tại
                int ret = JOptionPane.showConfirmDialog(null, "bạn có muốn ghi đề file này không?", "hỏi Lưu file", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            try {
                PrintWriter pw = new PrintWriter(new FileOutputStream(selectedFile));
                pw.println(data);
                pw.close();
                JOptionPane.showMessageDialog(null, "lưu file thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void xuLyMoFile() {

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile(); //lấy ra file đc chọn
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(selectedFile), "UTF-8"));
                String line = br.readLine();
                StringBuilder builder = new StringBuilder();
                while (line != null) {
                    builder.append(line + "\n");
                    line = br.readLine();
                }
                txtArea.setText(builder.toString());
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void xuLyThoatPhanMem() {
        int ret = JOptionPane.showConfirmDialog(null, "bạn có muốn thoát không?", "xác nhận thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void showWindow() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
