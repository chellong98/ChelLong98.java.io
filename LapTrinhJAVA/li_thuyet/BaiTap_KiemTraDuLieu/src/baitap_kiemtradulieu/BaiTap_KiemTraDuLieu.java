package baitap_kiemtradulieu;

import java.util.Scanner;

public class BaiTap_KiemTraDuLieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int number = 0;
        boolean flag;

        do {
            System.out.println("nhập vao 1 chuỗi: ");
            name = sc.nextLine();
        } while (name.length() < 2 || name.length() > 10); //phương thức của lớp String, length() trả về độ dài chuỗi

        do {
            System.out.println("nhập vào 1 số nguyên");
            flag = sc.hasNextInt(); //phương thức kiểm tra xem số nhập vào có là số nguyên không
            if (flag == true) {
                //number = sc.nextInt();
            } else {
                System.out.println("vui lòng nhập số!");
                sc.nextLine();//đọc nốt chuỗi vừa nhập vào
            }
        } while (flag == false);
    }

}
