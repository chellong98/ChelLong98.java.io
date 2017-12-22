/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopvadoituong;

/**
 *
 * @author Long Nguyen Nhat
 */
import java.util.Scanner;

public class LopVaDoiTuong {

    /**
     * 1. Tạo một lớp MyDate có 3 thuộc tính ngày, tháng, năm [ myDate(int date,
     * mouth, year) ] a. Xây dựng hai phương thức khởi tạo (một phương thức
     * không có tham số và một phương thức có tham số có kiểu là chính lớp đó)
     * b. Tạo một phưong thức nhập từ bàn phím và in ra màn hình 2. Tạo lớp phân
     * số PS có hai thuộc tính là tử và mẫu a. Xây dựng hai hàm khởi tạo có tham
     * số khác nhau b. Xây dựng các phương thức cộng, trừ, nhân, chia phân số.
     */
    Mydate mydate = new Mydate();

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ngày: ");
        int day = sc.nextInt();
        System.out.println("nhập vào tháng: ");
        int month = sc.nextInt();
        System.out.println("nhập vào năm: ");
        int year = sc.nextInt();
        mydate.setDay(day);
        mydate.setMonth(month);
        mydate.setYear(year);
    }

    public void outPut() {
        System.out.println("thông tin của Mydate: ");
        System.out.println(mydate);
    }

    PhanSo ps = new PhanSo();

    public static void nhapPhanSo(PhanSo ps) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tử: ");
        int tu = sc.nextInt();
        ps.setTu(tu);
        System.out.println("nhập vào mẫu: ");
        int mau = sc.nextInt();
        ps.setMau(mau);
    }

    public static int BCNN(int a, int b) {
        int tich = a*b;
        int bcnn = tich / UCLN(a,b);
        return bcnn;
    }
    public static int UCLN(int a, int b) {
        int du;
        int tich = a * b;
        while (b != 0) {
            du = a % b;
            a = b;
            b = du;
        }
        return a;
    }

    public void cong() {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("nhập vào số lượng phân số: ");
        count = sc.nextInt();
        LopVaDoiTuong.nhapPhanSo(ps); //nhập vào phân số đầu tiên
        int sumTu = ps.getTu(); //tổng tử bằng phân số đầu tiên
        int sumMau = ps.getMau();//tổng mẫu bằng ps đầu tiên
        for (int i = 0; i < count - 1; i++) { //vì đã nhập 1 ps nên count - 1
            System.out.println("nhập phân số tiếp theo: ");
            LopVaDoiTuong.nhapPhanSo(ps);
            int mauSo = sumMau; //lấy ra mẫu số của ps cũ
            sumMau = LopVaDoiTuong.BCNN(sumMau, ps.getMau()); //tính mẫu số chung của 2 ps
            sumTu = (sumMau / mauSo) * sumTu + (sumMau / ps.getMau()) * ps.getTu(); //tính tổng tử số 2 ps
        }
        ps.setTu(sumTu);
        ps.setMau(sumMau);
        int gianUoc = LopVaDoiTuong.UCLN(ps.getTu(), ps.getMau()); //tìm số giản ước của tử và mẫi
        System.out.println("tổng 2 phân số là: " + ps.getTu()/gianUoc + "/" + ps.getMau()/gianUoc);
    }

    public void hieu () {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("nhập vào số lượng phân số: ");
        count = sc.nextInt();
        LopVaDoiTuong.nhapPhanSo(ps); //nhập vào phân số đầu tiên
        int sumTu = ps.getTu(); //tổng tử bằng phân số đầu tiên
        int sumMau = ps.getMau();//tổng mẫu bằng ps đầu tiên
        for (int i = 0; i < count - 1; i++) { //vì đã nhập 1 ps nên count - 1
            System.out.println("nhập phân số tiếp theo: ");
            LopVaDoiTuong.nhapPhanSo(ps);
            int mauSo = sumMau; //lấy ra mẫu số của ps cũ
            sumMau = LopVaDoiTuong.BCNN(sumMau, ps.getMau()); //tính mẫu số chung của 2 ps
            sumTu = (sumMau / mauSo) * sumTu - (sumMau / ps.getMau()) * ps.getTu(); //tính hiệu tử số 2 ps
        }
        ps.setTu(sumTu);
        ps.setMau(sumMau);
        int gianUoc = LopVaDoiTuong.UCLN(ps.getTu(), ps.getMau()); //tìm số giản ước của tử và mẫi
        System.out.println("hiệu 2 phân số là: " + ps.getTu()/gianUoc + "/" + ps.getMau()/gianUoc);
    }
    
    public static void main(String[] args) {
        LopVaDoiTuong object = new LopVaDoiTuong();
//        object.inPut();
//        object.outPut();
//        object.cong();
        object.hieu();
    }

}
