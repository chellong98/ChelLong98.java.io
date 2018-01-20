/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.javaswing.model;

import java.io.File;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Node extends File{
    public Node(String path) {
        super(path);
    }


    @Override
    public String toString() {
        return this.getName(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
