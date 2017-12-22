/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long Nguyen Nhat
 */
public class JavaLesson11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("G:\\LapTrinhJAVA\\Java_07\\Lesson11\\data.txt");
        if (f.exists()) {
            try {
                //            System.out.println("path: "+f.getPath());
//            System.out.println("abs path: " +f.getAbsolutePath());
//            f.renameTo(new File("data_rename.txt"));
//            f.delete();
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream("DATA.txt");
            int size =0;
                try {
                    size = fis.available();
                } catch (IOException ex) {
                    Logger.getLogger(JavaLesson11.class.getName()).log(Level.SEVERE, null, ex);
                }
//                for (int i = 0; i < size; i++) {
//                    try {
//                        System.out.println((char)fis.read());
//                    } catch (IOException ex) {
//                        Logger.getLogger(JavaLesson11.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
                byte[] content = new byte[size];
                try {
                    fis.read(content);
                    fos.write(content);
                } catch (IOException ex) {
                }
                try {
                    fos.flush();
                    fos.close();
                } catch (IOException ex) {
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                System.out.println("không tồn tại");
                f.createNewFile();
                System.out.println("tạo file thành công");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
