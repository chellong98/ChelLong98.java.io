/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long Nguyen Nhat
 */
public class DemoThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // TODO code application logic here
            ThreadInA A = new ThreadInA();
            
            
            Thread c = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        try {
                            System.out.println("C");
                            Thread.sleep(1000);
                        } catch (Exception e) {
                        }
                    }
                }
            });
            ThreadInB B = new ThreadInB();
            A.setPriority(1);
            A.start();
            
            
            B.setPriority(2);
            B.start();
            
            
            c.setPriority(3);
            c.start();
            
    }
    
}
