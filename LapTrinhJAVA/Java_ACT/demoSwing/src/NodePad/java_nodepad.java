/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodePad;

import java.awt.BorderLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;
import javafx.stage.FileChooser;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author Long Nguyen Nhat
 */
public class java_nodepad extends JFrame {

    JTextArea mainarea;
    JMenuBar mbar;
    JMenu mnuFile, mnuEdit, mnuFormat, mnuHelp;
    JMenuItem itmNew, itmOpen, itmSave, itmSaveas, itmExit, itmCopy, itmCut, itmPaste;
    String fileName;
    JFileChooser jc;
    String fileContent;

    public java_nodepad() {
        this.initComponent();
        itmSave.addActionListener(new ActionListener() { //tạo sự kiện click vào save
            @Override
            public void actionPerformed(ActionEvent e) {// khi có hành động save
                save();
            }
        });
        itmSaveas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAs();
            }
        });
        itmOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });
        itmNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open_new();
            }
        });
        itmExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "bye bye :)", "cảm ơn đã sử dụng", 3);
                System.exit(0);
            }
        });
        itmCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainarea.copy();
            }
        });
        itmCut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainarea.cut();
            }
        });
        itmPaste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainarea.paste();
            }
        });
    }

    private void initComponent() { //hàm khởi tạo giao diện
        jc = new JFileChooser(".");
        mainarea = new JTextArea();//tạo ra 1 khoảng text
        this.getContentPane().add(mainarea); //thêm khoảng text đó vào giao diện
        this.getContentPane().add(new JScrollPane(mainarea), BorderLayout.CENTER); //đảm bảo khoảng trống text luôn ở giữa ứng dụng và có thanh kéo
        this.setTitle("MY Nodepad");
        //menubar
        mbar = new JMenuBar();
        //menu
        mnuFile = new JMenu("File");
        mnuEdit = new JMenu("Edit");
        mnuFormat = new JMenu("Format");
        mnuHelp = new JMenu("Help");

        //add shortcut
        //menu Item
        itmNew = new JMenuItem("New          Ctr + N");
        itmOpen = new JMenuItem("Open...        Ctr + O");
        itmSave = new JMenuItem("Save        Ctr + S");
        itmSaveas = new JMenuItem("Save As...   ");
        itmExit = new JMenuItem("               Exit.");
        itmCopy = new JMenuItem("Copy        Ctr + C");
        itmCut = new JMenuItem("Copy        Ctr + X");
        itmPaste = new JMenuItem("Copy        Ctr + V");
        
        itmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK)); //tạo phím tắt cho New
        itmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));///tạo phím tắt cho Open
        itmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));///tạo phím tắt cho Save
        itmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));///tạo phím tắt cho copy
        itmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));///tạo phím tắt cho cut
        itmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));///tạo phím tắt cho paste

        //add menu item File
        mnuFile.add(itmNew);
        mnuFile.add(itmOpen);
        mnuFile.add(itmSave);
        mnuFile.add(itmSaveas);
        mnuFile.addSeparator();
        mnuFile.add(itmExit);
        
       //add menu item edit
        mnuEdit.add(itmCopy);
        mnuEdit.add(itmCut);
        mnuEdit.add(itmPaste);
        //add menu item to menu bar
        mbar.add(mnuFile);
        mbar.add(mnuEdit);
        mbar.add(mnuFormat);
        mbar.add(mnuHelp);

        //add menu bar to frame
        this.setJMenuBar(mbar);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //căn giữa màn hình

    }
    //method

    PrintWriter fout = null; //dùng để tham chiếu đến save và saveAs

    private void save() {
//        int check = 0;
        try {

            if (fileName == null) { //nếu file chưa tồn tại, giả sử như đã Open 1 file thì fileName != null
                saveAs();
            } else {
                fout = new PrintWriter(new FileWriter(fileName));
                String s = mainarea.getText();
                StringTokenizer stk = new StringTokenizer(s, System.getProperty("line.separator")); //ngắt chuỗi theo system.getProperty , đọc thêm ở https://www.tutorialspoint.com/java/lang/system_getproperty_string.htm
                while (stk.hasMoreElements()) { //kiểm tra xem còn phần tử trong chuỗi hay k
                    fout.println(stk.nextToken()); // ghi vào file
                }
                JOptionPane.showMessageDialog(this, "Lưu rồi nhé!", "thông báo nè!", 3);//in ra hộp thoại thông báo
                fileContent = mainarea.getText();
            }
        } catch (IOException e) {

        } finally {
            fout.close();
        }
    }

    private void saveAs() { //lưu thành 1 file mới
        int check = 0;
        try {
            check = jc.showSaveDialog(this); //hiện ra bảng hộp thoại save, để chọn 1file nào đó để ghi
            if (check == JFileChooser.APPROVE_OPTION) { //nếu chọn 1 hộp thoại
                fout = new PrintWriter(new FileWriter(jc.getSelectedFile())); //chọn file đó
            } else if (check == JFileChooser.CANCEL_OPTION) {
                return; //???????????????
            }
            String s = mainarea.getText();
            StringTokenizer stk = new StringTokenizer(s, System.getProperty("line.separator")); //ngắt chuỗi theo system.getProperty , đọc thêm ở https://www.tutorialspoint.com/java/lang/system_getproperty_string.htm
            while (stk.hasMoreElements()) { //kiểm tra xem còn phần tử trong chuỗi hay k
                fout.println(stk.nextToken()); // ghi vào file
            }
            JOptionPane.showMessageDialog(this, "Lưu rồi nhé!", "thông báo nè!", 3);//in ra hộp thoại thông báo
            fileContent = mainarea.getText();
            fileName = jc.getSelectedFile().getName(); //đặt lại tên file
            this.setTitle(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fout.close();
        }
    }

    private void open() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            int retval = jc.showOpenDialog(this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                mainarea.setText(null);
                fr = new FileReader(jc.getSelectedFile()); //đối tượng tham chiếu đến file đã chọn
                br = new BufferedReader(fr); //lưu đọc vào bộ đệm
                String line;
                while ((line = br.readLine()) != null) { //đọc từng dòng
                    mainarea.append(line + "\n"); //nối dòng và kí tự \n
                }
                fileName = jc.getSelectedFile().getName(); //đặt lại tên file
                this.setTitle(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void open_new() {
        if (!mainarea.getText().equals("") && !mainarea.getText().equals(fileContent)) { //nếu đoạn text đang viết trong file đã được lưu khác với đoạn text cu của file đó
            if (fileName == null) { //nếu file chưa tồn tại
                int check = JOptionPane.showConfirmDialog(rootPane, "Có muốn lưu File lại hem? :)", "hỏi????????", 1);
                if (check == 0) { //nếu chọn có
                    saveAs(); //thì save file
                } else if (check == 2) {

                } else { //nếu chọn không
                    clear(); //xóa đoạn vừa viết đi
                }
            } else { //nếu file đã có rồi
                int check = JOptionPane.showConfirmDialog(rootPane, "Có muốn lưu File lại hem? :)", "hỏi????????", 1);
                if (check == 0) { //nếu chọn có
                    save(); //thì save file
                    clear();//xóa text vừa viết
                } else if (check == 2) {

                } else { //nếu chọn không
                    clear(); //xóa đoạn vừa viết đi
                }
            }
        } else {
            clear();
        }

    }

    private void clear() {
        mainarea.setText(null);
        this.setTitle("Untitled File");
        fileName = null;
        fileContent = null;
    }

    public static void main(String[] args) {
        java_nodepad nodepad = new java_nodepad();
    }
}
