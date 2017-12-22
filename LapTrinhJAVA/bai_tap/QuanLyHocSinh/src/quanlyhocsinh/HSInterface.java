/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyhocsinh;

/**
 *
 * @author Long Nguyen Nhat
 *  Nhập vào một danh sách gồm n học sinh ( n- nhập từ bàn phím)
- Hiển thị ra màn hình tất cả những học sinh sinh năm lớn hơn 1985 và quê ở Thái Nguyên
- Hiển thị ra màn hình tất cả những học sinh của lớp 10A1

 */
public interface HSInterface {
    void NhapHS();
    void InHS();
    void hienThi(int namsinh, String quequan);
    void hienThi(String lop);
}
