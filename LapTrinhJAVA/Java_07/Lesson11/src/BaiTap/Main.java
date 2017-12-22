/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {

    public static void testLuuFile() {
        NhomKhachHang nhom = new NhomKhachHang("nhóm 1");
        nhom.themKhachHang(new KhachHang("n1", "long", "long@gmail.com"));
        nhom.themKhachHang(new KhachHang("n2", "hùng", "hung@gmail.com"));
        nhom.themKhachHang(new KhachHang("n3", "hiếu", "hieu@gmail.com"));
        
        System.out.println("nhập vào đường dẫn file: ");
        String fileName = new Scanner(System.in).nextLine();
        
        if (TextFileFactory.luuFile(nhom.getNhomKhachHang(), fileName)) {
            System.out.println("lưu file thành công");
        } else {
            System.out.println("lưu file thất bại");
        }
    }

    public static void main(String[] args) {
        testLuuFile();
    }
}
