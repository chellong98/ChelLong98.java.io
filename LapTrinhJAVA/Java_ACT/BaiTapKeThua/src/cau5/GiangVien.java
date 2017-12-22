/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau5;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GiangVien {
    private String HoTen;
    private String MaGiangVien;
    private String DiaChi;
    private String GioiTinh;
    private String Khoa;
    private final String Khoas[] = new String[]{"DTVT", "CNTT", "HTTT", "CNM", "CNPM"};

    public GiangVien() {
      
    }

    public GiangVien(String HoTen, String MaGiangVien, String DiaChi, String GioiTinh, String Khoa) {
        this.HoTen = HoTen;
        this.MaGiangVien = MaGiangVien;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Khoa = Khoa;
    }
    
    GiangVien giangvien = null;
    
    public boolean setInfo() {
        String khoa = "HTTT";
        giangvien = new GiangVien("nguyễn nhật long", "at130833", "hà nội", "nam", khoa);
        boolean flag = false;
        for (String element : Khoas) {
            if (giangvien.Khoa.equals(element)) {
                flag = true;
                break;
            } 
        }
        return flag;
    }
    
    public void getInfo () {
        if (giangvien.setInfo()) {
            System.out.println("tên: " + giangvien.HoTen);
            System.out.println("mã giảng viên: " + giangvien.MaGiangVien);
            System.out.println("địa chỉ: " + giangvien.DiaChi);
            System.out.println("giới tính: " + giangvien.GioiTinh);
            System.out.println("khoa: " + giangvien.Khoa);
        } else {
            System.out.println("không có khoa này, mời nhập lại khoa!");
        }
    }
}
