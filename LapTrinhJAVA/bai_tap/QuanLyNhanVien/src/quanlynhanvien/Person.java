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
public class Person { //người
    private String name; //tên
    private Address address; //địa chỉ
    private final double LUONG_CO_BAN = 2000000;
            
    public Person () {
        
    }
    
    public Person (String name) { //constructor
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    
    public double luong () {
        return LUONG_CO_BAN;
    }
}
