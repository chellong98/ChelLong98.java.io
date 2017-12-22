/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

import java.util.Scanner;

/**
 Để quản lý hồ sơ học sinh của trường THPT, người ta cần quản lý những thông tin như sau:
- Các thông tin về : lớp, khoá học, kỳ học, và các thông tin cá nhân của mỗi học sinh.
- Với mỗi học sinh, các thông tin cá nhân cần quản lý gồm có: Họ và tên, ngày sinh, quê quán.
1. Hãy xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi học sinh.
2. Xây dựng lớp HSHocSinh (hồ sơ học sinh) để quản lý lý các thông tin về mỗi học sinh.
3. Xây dựng các phương thức : nhập, hiển thị các thông tin về mỗi cá nhân.
4. Cài đặt chương trình thực hiện các công việc sau:
- Nhập vào một danh sách gồm n học sinh ( n- nhập từ bàn phím)
- Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên
- Hiển thị ra màn hình tất cả những học sinh của lớp 10A1

 */
public class Main {

    public static int Menu () {
        System.out.println("================");
        System.out.println("1. nhập hồ sơ ");
        System.out.println("2. in hồ sơ ");
        System.out.println("3. hiển thị 1");
        System.out.println("4. hiển thị 2");
        System.out.println("0. thoát");
        System.out.println("================");
        int choice;
        Scanner sc = new Scanner (System.in);
        choice = sc.nextInt();
        return choice;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HSInterface work = new HSHocSinh();
        int choice;
        do {
            choice = Menu();
            switch(choice) {
                case 1: work.NhapHS(); break;
                case 2: work.InHS(); break;
                case 3: work.hienThi(1985, "thai nguyen");break;
                case 4: work.hienThi("10a1");break;
                case 0: return; 
                default: System.out.println("mời bạn nhập lại lệnh!");
            }
        }while(true);
    }
    
}
