/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.javaswing.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Long Nguyen Nhat
 */
public class MayTinhBoTuiUI extends JFrame {

    String[] ButtonText = {"AC", "+/-", "%", "/",
                            "7", "8", "9", "x",
                            "4", "5", "6", "-",
                            "1", "2", "3", "+",
                            "0", ".", " ", "="};
    ArrayList<JButton> Buttons = null;
    JLabel lblScreen;
    String num1 = "";
    String num2 = "";
    String option = "";
    boolean check = true;

    public MayTinhBoTuiUI(String title) {
        super(title);
        Buttons = new ArrayList<JButton>();
        addControls();
        addEvents();

    }

    private void addControls() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //tạo giao diện giống window
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());

        JPanel pnScreen = new JPanel();
        pnScreen.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnScreen.setPreferredSize(new Dimension(0, 120));
        con.add(pnScreen, BorderLayout.NORTH);

        JPanel pnKeyboard = new JPanel();
        pnKeyboard.setLayout(new GridLayout(5, 4));
        pnKeyboard.setBackground(Color.blue);
        con.add(pnKeyboard, BorderLayout.CENTER);

        for (String str : ButtonText) {
            JButton btnButton = new JButton(str);
            btnButton.setFont(new Font("times new roman", Font.BOLD, 20));
            Buttons.add(btnButton);
            pnKeyboard.add(btnButton);
        }

        lblScreen = new JLabel("0");
        lblScreen.setFont(new Font("times new roman", Font.BOLD, 70));
        pnScreen.add(lblScreen);
    }

    private void addEvents() {
        StringBuilder builder = new StringBuilder();

        for (JButton btn : Buttons) {
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();
                    if (source.getText().equals("+/-") && builder.toString().length() == 0) { //nếu builder =  và ấn vào nút +/-
                        builder.append("-");
                    }
                    if (source.getText().matches("[^0-9=.]")) { //nếu ấn vào các dấu không phải số và dấu bằng, tức là ấn vào toán tử
                       
//                        }
//                        else {
                            option = source.getText(); //lấy ra dấu vừa ấn
                            num1 = lblScreen.getText(); //lấy ra số trên screen
                            check = false; //cho biến kiểm tra đang nhập số bằng false
//                        }
                        

                    } else if (source.getText().matches("[\\d.]")) { //nếu ấn vào các nút số
                        if (check) {
                            xuLyHienThiLenScreen(source); //nếu đang nhập số thì nhập tiếp
                        } else {
                            builder.delete(0, builder.toString().length()); //nếu vừa +-x/ thì cho builder về 0
                            xuLyHienThiLenScreen(source);//tiếp tục hiển thị 1 số khác
                            check = true;//biến đang nhập số bằng true
                        }
                    } else if (source.getText().equals("AC")) { //nếu ấn vào nút AC
                        xuLyReset(); //reset toàn bộ
                    } else if (source.getText().equals("=")) { //nếu ấn = thì tính toán
                        if (option.equals("")) {
                            return;
                        }
                        try {
                            Caculator();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "bị lỗi gì đó, không biết! \n nhấn AC đi");
                        }

//                        for (int i = 1; i < Buttons.size(); i++) {
//                            Buttons.get(i).setEnabled(false);
//                        }
                    }
                }

                private void xuLyHienThiLenScreen(JButton source) {
                    String text = source.getText();
                    if (lblScreen.getText().equals("0") && text.equals("0")) {
                        return;
                    }

                    builder.append(text);
                    lblScreen.setText(builder.toString());
                }

                private void xuLyReset() {
                    builder.delete(0, builder.toString().length()); //xóa trắng builder
                    lblScreen.setText("0");
                    num1 = "";
                    num2 = "";
                    option = "";
                    lblScreen.setFont(new Font("times new roman", Font.BOLD, 70));
//                    for (int i = 0; i < Buttons.size(); i++) {
//                        Buttons.get(i).setEnabled(true);
//                    }
                }

                private void Caculator() {
                    num2 = builder.toString();
//                    System.out.println(num1);
//                    System.out.println(option);
//                    System.out.println(num2);
                    float ret = 0;
                    if (option.equals("+")) {
                        ret = Float.parseFloat(num1) + Float.parseFloat(num2);
                    } else if (option.equals("-")) {
                        ret = Float.parseFloat(num1) - Float.parseFloat(num2);
                    } else if (option.equals("x")) {
                        ret = Float.parseFloat(num1) * Float.parseFloat(num2);
                    } else if (option.equals("/")) {
                        ret = Float.parseFloat(num1) / Float.parseFloat(num2);
                    }
                    if (ret == (int) ret) {
                        lblScreen.setText((int) ret + "");
                    } else {
                        String str = ret + "";
                        char[] charArray = str.toCharArray();
                        if (charArray.length > 7) {
                            lblScreen.setFont(new Font("times new roman", Font.BOLD, 50));
                        }
                        lblScreen.setText(str);
                    }
                    if (option.equals("%")) {
                        int res = Integer.parseInt(num1) % Integer.parseInt(num2);
                        lblScreen.setText(res + "");
                    }
                    builder.delete(0, builder.toString().length()); //đưa builer về 0 để nhập phép tính tiếp
                }
            });
        }
    }

    public void showWindow() {
        this.setSize(300, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
