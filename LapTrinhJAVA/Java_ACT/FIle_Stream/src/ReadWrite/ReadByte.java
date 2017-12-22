/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author Long Nguyen Nhat
 */
public class ReadByte {

    public static void main(String[] args) {
        InputStreamReader insr = new InputStreamReader(System.in); //luồng đọc vào từ bàn phím (System.in)
        BufferedReader br = new BufferedReader(insr);//đối tượng đọc bộ đệm tham chiếu đến đối tượng đầu vào

        String hoten = "long";
        int tuoi = 0;
        try {
            System.out.println("nhập họ tên: ");
            hoten = br.readLine();//chờ nhập 1 dòng để đọc
            System.out.println("nhập tuổi: ");
            tuoi = Integer.parseInt(br.readLine());//chờ nhập 1 số
            System.out.println("họ tên: " + hoten);
            System.out.println("tuổi: " + tuoi);

            FileInputStream fis = new FileInputStream("text.txt"); //đối tượng vào file
            BufferedInputStream bis = new BufferedInputStream(fis);//đối tượng bộ đệm tham chiếu đến đối tương jfile
            int line;
            while((line=bis.read())>0) {//đọc kí tự và chuyển thành mã ASCII
                System.out.println("mã ASCII: " + line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
