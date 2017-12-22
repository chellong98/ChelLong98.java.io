/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computing;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Mouse { //class trừu tượng

    private String manufacturer; // nhà sản xuất
    private double price;

    public abstract void leftButton(); //phương thức trừu tượng, chỉ có kiểu dữ liệu, tên và danh sách tham số

    public abstract void rightButton();

    public abstract void scrollButton();

    public Mouse() { //default constructor
        this("", 0);
    }

    public Mouse(String manufacturer, double price) { //constructor tự định nghĩa
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void getInfo() {
        System.out.println(manufacturer + " | " + price);
    }
}
