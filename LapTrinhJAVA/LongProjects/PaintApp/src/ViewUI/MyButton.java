/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 *
 * @author Administrator
 */
public class MyButton extends JButton {
    Image img = null;
    public MyButton(String url) {
        try {
            img = ImageIO.read(getClass().getResource(url));
            this.setPreferredSize(new Dimension(70 , 70));
        } catch (Exception e) {
        }
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(img, 2, 2, 66, 66, null);
//        System.out.println("abc");
        
    }
}
