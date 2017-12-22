/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau7;


/**
 *
 * @author Long Nguyen Nhat
 */
public class CanBo extends Person {

    String CacPhongBan[] = new String[]{"Đào tạo", "Tổ chức cán bộ", "văn phòng khoa CNTT"};
    private String PhongBan;
    private double LuongThucLinh;
//    hệ số lương, lương cơ bản, thưởng, phạt 
    private int HeSoLuong;
    private double LuongCoBan;
    private double Thuong;
    private double Phat;

    public CanBo() {
    }

    public CanBo(int HeSoLuong, double LuongCoBan, double Thuong, double Phat) {
        this.HeSoLuong = HeSoLuong;
        this.LuongCoBan = LuongCoBan;
        this.Thuong = Thuong;
        this.Phat = Phat;
    }

    public boolean setPhongBan(String PhongBan) {
        for (String element : CacPhongBan) {
            if (element.equalsIgnoreCase(PhongBan)) {
                this.PhongBan = PhongBan;
                return true;
            } 
        }
        System.out.println("không có phòng ban " + PhongBan);
        return false;
    }

    public String getPhongBan() {
        return PhongBan;
    }
    
    CanBo canbo;

    public void setInfo() {

        canbo = new CanBo (2, 100000, 20000, 30000);
        String HoTen = "nguyễn nhật long";
        canbo.setHoTen(HoTen);
        String NgaySinh = "17-7-1998";
        canbo.setNgaySinh(NgaySinh);
        String DiaChi = "Hà Nội";
        canbo.setDiaChi(DiaChi);
        String GioiTinh = "Nam";
        canbo.setGioiTinh(GioiTinh);
        canbo.LuongThucLinh = canbo.getLuongThucLinh();
        canbo.setPhongBan("đào tạo");
    }

    public void getInfo() {
        System.out.println("tên: " + canbo.getHoTen());
        System.out.println("ngày sinh: " + canbo.getNgaySinh());
        System.out.println("địa chỉ: " + canbo.getDiaChi());
        System.out.println("giới tính: " + canbo.getGioiTinh());
        System.out.println("phòng ban: " + canbo.getPhongBan());
        System.out.println("lương thực lĩnh: " + canbo.getLuongThucLinh());
        
    }
    
    public double getLuongThucLinh() {//lương thực lĩnh = Lương cơ bản * hệ số + thưởng – phạt
        return LuongThucLinh = (double) (LuongCoBan * HeSoLuong + Thuong - Phat);
    }
}
