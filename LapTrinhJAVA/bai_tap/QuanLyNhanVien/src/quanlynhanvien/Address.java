/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Address  { //địa chỉ
    private String tenDuong; //địa chỉ gồm có tên đường
    
    public Address () {
        
    }
    
    public Address (String tenDuong) { //constructor
        this.tenDuong = tenDuong;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }
    
}
