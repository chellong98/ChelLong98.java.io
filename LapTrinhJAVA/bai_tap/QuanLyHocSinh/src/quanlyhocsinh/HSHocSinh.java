/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat Nhập vào một danh sách gồm n học sinh ( n- nhập từ
 * bàn phím)
 */
public class HSHocSinh implements HSInterface {

    HoSo hs[] = null;
    private final int MAX_SIZE = 50;
    private int amount;

    public HSHocSinh() {
        hs = new HoSo[MAX_SIZE];
    }

    @Override
    public void NhapHS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số lượng hồ sơ: ");
        amount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < amount; i++) {
            System.out.println("nhập vào họ tên người thứ " + (i+1) + ": ");
            String HoTen = sc.nextLine();
            System.out.println("nhập vào năm sinh: ");
            int NamSinh = sc.nextInt();
            sc.nextLine();
            System.out.println("nhập vào quê quán: ");
            String QueQuan = sc.nextLine();

            Nguoi nguoi = new Nguoi();

            nguoi.setHoTen(HoTen);
            nguoi.setNamSinh(NamSinh);
            nguoi.setQueQuan(QueQuan);

            System.out.println("nhập vào lóp: ");
            String Lop = sc.nextLine();
            System.out.println("nhập vào khóa học: ");
            int KhoaHoc = sc.nextInt();
            System.out.println("nhập vào kì học: ");
            int KiHoc = sc.nextInt();
            sc.nextLine();
            HoSo hocsinh = new HoSo(nguoi, Lop, KhoaHoc, KiHoc);
            hocsinh.setLop(Lop);
            hocsinh.setKhoaHoc(KhoaHoc);
            hocsinh.setKiHoc(KiHoc);
            
            hs[i] = hocsinh;
        }
    }

    @Override
    public void InHS() {
        for (int i = 0; i < amount; i++) {
        System.out.println("=======Thông tin người " + (i+1) + ": ");
            System.out.println(hs[i]);
        }
    }

    @Override
    public void hienThi(int namsinh, String quequan) {
        System.out.println("thông tin nhũng người sinh năm trước " + namsinh + " và quê ở " + quequan + "la: ");
        for (int i = 0; i< amount; i++ ) {
            if (hs[i].getNguoi().getNamSinh() > namsinh && hs[i].getNguoi().getQueQuan().equalsIgnoreCase(quequan)) {
                System.out.println(hs[i]);
            }
        }
    }

    @Override
    public void hienThi(String lop) {
        System.out.println("thông tin những người học lớp " + lop + "la: ");
        for (int i = 0; i < amount; i++) {
            if (hs[i].getLop().equalsIgnoreCase(lop)) {
                System.out.println(hs[i]);
            }
        }
    }
}
