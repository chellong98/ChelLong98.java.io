package pccc.quanlytailieu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageBackground extends JPanel{
	private BufferedImage image;
	public ImageBackground(String pathImage) {
	       try {                
	          image = ImageIO.read(new File(pathImage));
	       } catch (IOException ex) {
	            // handle exception...
	    	   ex.printStackTrace();
	       }
	       this.setBackground(Color.white);
	       
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 50, 20, null);          
	    }
}
