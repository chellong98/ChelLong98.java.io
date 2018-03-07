/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class MyColor extends JLabel{
    BufferedImage img = null;
    int color;
    Graphics2D grColor = null;
    public MyColor(String url) {
        try {
            img = ImageIO.read(getClass().getResource(url));
            this.setPreferredSize(new Dimension(120 , 120));
            grColor = img.createGraphics();
            
            
        } catch (Exception e) {
        }
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int X = e.getX();
                int Y = e.getY();
                color = img.getRGB(X, Y);
                System.out.println(color);
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
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(img, 2, 2, 116, 116, null);
        
//        System.out.println("abc");
    }
    public Color getColor() {
        
        return new Color( color);
    }
    
    
}
