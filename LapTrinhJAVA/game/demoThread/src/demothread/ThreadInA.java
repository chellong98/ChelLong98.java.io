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
public class ThreadInA extends Thread{
    public void run () {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("A");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadInA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
