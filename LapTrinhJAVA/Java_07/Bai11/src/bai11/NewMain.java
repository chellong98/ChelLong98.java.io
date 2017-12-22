/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DSSV ds = new DSSV();
        SinhVien svvv1 = new SinhVien("Nguyen van b", 23, 10);
        SinhVien svv2 = new  SinhVien("Haheh", 12, 34);
        Scanner scan = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Hien thi danh sach sih vien");
        System.out.println("3. Tìm kiem sinh vien");
        System.out.println("4. THoat");
        System.out.println("=====================");
        int chon;
        do {
            System.out.print("Moi ban chon:");
            chon = scan.nextInt();
            switch (chon) {
                case 1: {
                    ds.nhapdssv();
                    break;
                }
                case 2: {
                    //ds.xuatdssv();
                    System.out.println(svvv1.getHoTen())2;
                    break;
                }
                case 3: {
                    String timten;
                    System.out.print("Nhap ten sinh vien can tim:");
                    scan.nextLine();
                    timten = scan.nextLine();
                    ds.timKiem(timten);
                    break;
                }
                case 4: {
                    System.out.println("Thoat");
                    break;
                }
            }
        } while (chon != 4);
    }

}
