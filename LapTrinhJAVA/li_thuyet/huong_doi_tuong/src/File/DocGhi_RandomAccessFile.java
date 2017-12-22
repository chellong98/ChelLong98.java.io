/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.RandomAccessFile;

/**
 *
 * @author Long Nguyen Nhat
 */
public class DocGhi_RandomAccessFile {

    public static void main(String[] args) {
        String fileName = "G:\\LapTrinhJAVA\\li_thuyet\\huong_doi_tuong\\src\\File\\text2.txt";

        try {
            RandomAccessFile raf = new RandomAccessFile (fileName, "rw"); //khởi tạo đối tượng lớp randomaccessfile , tham số truyền vào là (tên file, chế độ)
            char c = 'c';
            String str = "String with binary";
            int i = 3;
            double d = 3.5;
            
            raf.writeChar(c); //ghi 1 kí tự
            raf.writeUTF(str);//ghi 1 chuỗi
            raf.writeInt(i);//ghi 1 số nguyên
            raf.writeDouble(d);//ghi 1 số thực
            
            raf.seek(0); //chuyển con trỏ về đầu file
            /**
             *đọc lần lượt như lúc ghi file để in ra
             */
            System.out.println(raf.readChar());//đọc từ char
            System.out.println(raf.readUTF());//đọc string
            System.out.println(raf.readInt());//đọc số nguyên
            System.out.println(raf.readDouble());//đọc số thực
            
            raf.close();//đóng file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
