/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Long Nguyen Nhat
 */
public class TextFileFactory {

    public static boolean luuFile(ArrayList<KhachHang> nhomKhachHang, String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
            } 
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            for (KhachHang kh : nhomKhachHang) {
                String line = kh.getMa() + ";" + kh.getTen() + ";" + kh.getEmail();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
