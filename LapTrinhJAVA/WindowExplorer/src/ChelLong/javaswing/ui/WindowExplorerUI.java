/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.javaswing.ui;

import ChelLong.javaswing.model.Node;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Long Nguyen Nhat
 */
public class WindowExplorerUI extends JFrame {

    public static final String path = "G:\\LapTrinhJAVA";
    DefaultMutableTreeNode root = null;
    JTree tree;
    DefaultMutableTreeNode nodeSelected = null;
    Node fileSelected = null;
    JPanel pnRight = null;
    File[] listFiles = null;
    ImageIcon icon = null;

    public WindowExplorerUI(String title) {
        super(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());

        JPanel pnLeft = new JPanel();
        pnLeft.setLayout(new BorderLayout());
        pnLeft.setPreferredSize(new Dimension(250, 0));
        pnRight = new JPanel();
        JScrollPane scRight = new JScrollPane(pnRight);
        JSplitPane spMain = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, scRight);
        spMain.setOneTouchExpandable(true);
        con.add(spMain, BorderLayout.CENTER);

        Node file = new Node(path);//node extends từ lớp FIle
        root = new DefaultMutableTreeNode(file);
        tree = new JTree(root);
        addNode(file, root);
        JScrollPane scTree = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnLeft.add(scTree, BorderLayout.CENTER);

        pnRight.setLayout(new GridLayout(5, 5));

    }

    private void addNode(Node file, DefaultMutableTreeNode node) { //truyền vào file đó và thư chứa nó

        if (file.isFile()) {  //nếu đó là file 
            DefaultMutableTreeNode n = new DefaultMutableTreeNode(file);//tạo node cho file đó

            node.add(n);//add vào node file chứ file này
            return;
        }
        if (file.isDirectory()) { //nếu đó là thư mục
            File[] listFile = file.listFiles(); //lấy ra các thư mụccon

            for (File f : listFile) { //duyệt thư mục
                Node subNode = new Node(f.getPath());//mỗi file tạo ra 1 đối tượng Node
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(subNode); //tạo các node cho mỗi thư mục
                node.add(n); //add vào node file chứ các file này
                addNode(subNode, n); //lặp lại
            }
        }
    }

    private void addEvents() {
        tree.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showWindow();
                if (e.getClickCount() == 2) { //nếu kích 2 phát
                    pnRight.removeAll(); //remove all các phần tử ở panel phải 
                    showWindow();//show lại giao diện
                    nodeSelected = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();//chọn ra node vừa kích
                    if (nodeSelected != null) { //nếu node đó k rỗng
                        fileSelected = (Node) nodeSelected.getUserObject();//lấy ra đối tượng file của node đó
                        if (fileSelected.isFile()) {//nếu là file
                            icon = new ImageIcon("images//document.png");
                            JLabel lblFile = new JLabel(fileSelected.getName(), icon, JLabel.CENTER);
//                            showWindow();
                            pnRight.add(lblFile);//thêm vào panel
                            showWindow();//show lại giao diện
                        }
                        if (fileSelected.isDirectory()) { //nếu là thư mục
                            listFiles = fileSelected.listFiles();//lấy ra các thư mục con
                            for (File file : listFiles) {
                                if (file.isFile()) {//nếu là file
                                    icon = new ImageIcon("images//document.png");
                                }
                                if (file.isDirectory()) {//nếu là doccument
                                    icon = new ImageIcon("images//folder.png");
                                }
                                JLabel lblFile = new JLabel(file.getName(), icon, JLabel.CENTER);
                                pnRight.add(lblFile);//thêm các file vào panel
                                showWindow();
                            }
                        }
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public void showWindow() {
        this.getContentPane().repaint();//vẽ lại frame
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
