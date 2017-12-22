/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 *
 * @author Long Nguyen Nhat
 */
public class BaiTap_RandomAccessFile {

    public static void main(String[] args) throws IOException {
        String fileName;
        try {
            System.out.println("nhập vào đường dẫn file: ");
            InputStreamReader isr = new InputStreamReader(System.in); //dòng vào từ bàn phím
            BufferedReader br = new BufferedReader(isr);//đọc từ bộ đêm, dòng vào bộ đệm từ bàn phím
            fileName = br.readLine();//trả về 1 String
            
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
               System.out.println("nhập vào 1 chuỗi: ");
               String str = br.readLine(); // 1 chuỗi văn bản
               RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
               raf.writeUTF(str);//ghi chuỗi vào file
               
               raf.seek(0);//đưa con trỏ về đầu file
               
                System.out.println(raf.readUTF());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
