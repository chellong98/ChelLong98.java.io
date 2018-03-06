/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ToolBar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Administrator
 */
public class Paint extends JFrame {

    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;
    public static final int OVAL = 3;
    JButton btnCircle, btnSquare, btnOval;
    JLabel lblPaint;
    public int status=-1;
    public int[] originXY = new int[2]; //toa do click chuoi
    public int[] oldXY = new int[2]; //toa do hien tai cua chuot
    boolean clickStatus = false;
    BufferedImage canvas = null;
    Graphics2D grCanvas;
    BufferedImage canvasTemp;
    String[] bangMau = {"#0B3B17", "#29220A",
        "#2A120A", "#2A0A0A",
        "#FE2E64", "#9A2EFE",
        "#F7FE2E", "#FE2E2E"};
    List<JButton> Buttons = new ArrayList<>();
    JPanel pnBangMau;
    String color="#FFFFF";
    Thread thread = new Thread() {
        @Override
        public void run() {
            while (true) {
                switch (status) {
                    case CIRCLE: {
                        if (clickStatus) { //neu bat dau ve
                            grCanvas.clearRect(0, 0, 600, 800);
                            grCanvas.drawImage(canvasTemp, 0, 0, null);

                            int length = lengthMouseMove();
                            grCanvas.setColor(Color.decode(color));
                            grCanvas.drawArc(oldXY[0] - length, oldXY[1] - length, length * 2, length * 2, 0, 360); //ve tu tam hinh tron
                        }
                    }
                    break;
                    case SQUARE: {
                        if (clickStatus) {
                            grCanvas.clearRect(0, 0, 600, 800);
                            grCanvas.drawImage(canvasTemp, 0, 0, null);

                            int length = lengthMouseMove();
                            grCanvas.setColor(Color.decode(color));
                            int[] sizesquare = sizeSquare();
                            grCanvas.drawRect(oldXY[0] - sizesquare[0] / 2, oldXY[1] - sizesquare[1] / 2, sizesquare[0], sizesquare[1]);
                        }
                    }
                    break;
                    case OVAL: {
                        if (clickStatus) {
                            grCanvas.clearRect(0, 0, 600, 800);
                            grCanvas.drawImage(canvasTemp, 0, 0, null);

                            int length = lengthMouseMove();
                            grCanvas.setColor(Color.decode(color));
                            int[] sizesquare = sizeSquare();
                            grCanvas.drawArc(oldXY[0] - sizesquare[0] / 2, oldXY[1] - sizesquare[1] / 2, sizesquare[0], sizesquare[1], 0, 360);
                        }
                    }
                    break;
                    default: {
                        if (clickStatus) {
//                            grCanvas.clearRect(0, 0, 600, 800);
//                            grCanvas.drawImage(canvasTemp, 0, 0, null);
//                            grCanvas.setColor(Color.decode(color));
//                            int length = lengthMouseMove();
//                            grCanvas.drawLine(oldXY[0], oldXY[1], originXY[0], originXY[1]);
//                            System.out.println(oldXY[0] + " | " + oldXY[1]);
                            grCanvas.fillArc(oldXY[0], oldXY[1], 10, 10, 0, 360);
                        }
                    }
                    break;
                }

                lblPaint.repaint();
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                }
            }
        }
    };

    int lengthMouseMove() {
        return (int) Math.sqrt((oldXY[0] - originXY[0]) * (oldXY[0] - originXY[0]) + (oldXY[1] - originXY[1]) * (oldXY[1] - originXY[1])); //cong thuc tinh do dai vecto khi biet toa do 2 diem
    }

    int[] sizeSquare() {
        int[] v = {(oldXY[0] - originXY[0]), (oldXY[1] - originXY[1])};
        int[] u = {1, 0};
        int canhHuyen = lengthMouseMove() * 2;
        double cosGoc = goc2Canh(u, v);
        int width = Math.abs((int) (cosGoc * canhHuyen)); //khong cho do dai bi am
        int height = Math.abs((int) Math.sqrt(canhHuyen * canhHuyen - width * width));
        System.out.println(width + " | " + height);
        int mang[] = {width, height};
        return mang;
    }

    int lengthVector(int[] vec) {
        return (int) Math.sqrt((vec[0] * vec[0] + vec[1] * vec[1]));
    }

    int nhanVoHuong(int[] u, int[] v) {
        return u[0] * v[0] + u[1] * v[1];
    }

    double goc2Canh(int[] u, int[] v) {
        return (double) (nhanVoHuong(u, v)) / (lengthVector(u) * lengthVector(v));
    }

    public Paint(String title) {
        super(title);
        addControls();
        addEvent();

    }

    public void addControls() {
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());

        JPanel pnLeft = new JPanel();
        pnLeft.setLayout(new BorderLayout());
        JToolBar toolbar = new JToolBar(JToolBar.VERTICAL);
        toolbar.setLayout(new GridLayout(6, 1));
//        toolbar.setRollover(true);
        btnCircle = new MyButton("Image//circle1.png");
        btnSquare = new MyButton("Image//square.png");
        btnOval = new MyButton("Image//oval.png");
        toolbar.add(btnCircle);
        toolbar.add(btnSquare);
        toolbar.add(btnOval);
        pnLeft.add(toolbar);

        pnBangMau = new JPanel();
        pnBangMau.setLayout(new GridLayout(2, 4));
        for (String str : bangMau) {
            JButton btnMau = new JButton(str);
//            Color color = Color.decode(str);

            btnMau.setBackground(Color.decode(str));
            pnBangMau.add(btnMau);
            btnMau.setPreferredSize(new Dimension(30, 30));
            Buttons.add(btnMau);
        }
        pnLeft.add(pnBangMau, BorderLayout.SOUTH);
//        pnLeft.setPreferredSize(new Dimension(200, 0));
//        pnLeft.setBackground(Color.red);
        con.add(pnLeft, BorderLayout.WEST);

        JPanel pnRight = new JPanel();

        canvas = new BufferedImage(600, 800, BufferedImage.TYPE_4BYTE_ABGR);

        lblPaint = new JLabel(new ImageIcon(canvas));
        lblPaint.setBackground(Color.white);
        lblPaint.setOpaque(true);
        lblPaint.setPreferredSize(new Dimension(600, 800));
        grCanvas = canvas.createGraphics();
        grCanvas.setBackground(Color.white);
        grCanvas.clearRect(0, 0, 600, 800);

        con.add(pnRight, BorderLayout.CENTER);
        pnRight.add(lblPaint);
        thread.start();
    }

    static BufferedImage deepCopy(BufferedImage bi) { //clone Bufferimage canvas vua ve xong
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }

    public void addEvent() {
        btnCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paintCircle();
            }
        });

        btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paintSquare();
            }
        });

        btnOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paintOval();
            }
        });
        lblPaint.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
              
                    oldXY[0] = e.getX(); //toa do click chuoi
                    oldXY[1] = e.getY();
                    canvasTemp = deepCopy(canvas);

                
                clickStatus = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                clickStatus = false;
                status = 0;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        lblPaint.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                originXY[0] = e.getX();
                originXY[1] = e.getY();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                originXY[0] = e.getX();
                originXY[1] = e.getY();
            }
        });
        for (JButton btn : Buttons) {
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    System.out.println(button.getText());
                    color = button.getText();
                }
            });
        }

    }

    private void paintCircle() {
        status = CIRCLE;

    }

    private void paintSquare() {
        status = SQUARE;
    }

    private void paintOval() {
        status = OVAL;
    }

    public void showWindow() {
        this.setSize(800, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
