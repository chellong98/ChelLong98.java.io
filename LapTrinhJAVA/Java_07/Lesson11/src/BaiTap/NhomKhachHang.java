/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Long Nguyen Nhat
 */
public class NhomKhachHang {

    private String tenNhom;
    private ArrayList<KhachHang> nhomKhachHang = null;

    public NhomKhachHang(String tenNhom) {
        this.tenNhom = tenNhom;
        nhomKhachHang = new ArrayList<KhachHang>();
    }

    public ArrayList<KhachHang> getNhomKhachHang() {
        return nhomKhachHang;
    }

    public void setNhomKhachHang(ArrayList<KhachHang> nhomKhachHang) {
        this.nhomKhachHang = nhomKhachHang;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public void themKhachHang(KhachHang kh) {
        nhomKhachHang.add(kh);
        kh.setNhom(this);
    }
}
