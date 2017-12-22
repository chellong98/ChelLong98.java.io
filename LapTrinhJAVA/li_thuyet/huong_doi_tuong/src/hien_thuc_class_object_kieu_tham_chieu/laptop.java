/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hien_thuc_class_object_kieu_tham_chieu;

import computing.Mouse;

/**
 *
 * @author Long Nguyen Nhat
 */
public class laptop {
    double price;
    int CPU;
    int RAM;
    String name;
    
    public laptop () {// default constructor
        this (0.0, 0, 0, ""); //phương thức this gán giá trị cho biến
    }
    public laptop (double price, int CPU, int RAM, String name) { //constructor tự xậy dựng
        this.price = price; //từ khóa this để chỉ biến thuộc tính chứ k phải biến phương thức
        this.CPU = CPU;
        this.RAM = RAM;
        this.name = name;
    }
    public void connectUSBMouse (Mouse mouse) { //tạo ra hình thức kết nối giữa laptop và chuột, tham số truyền vào là loại chuột
        mouse.getInfo();
        mouse.leftButton();
        mouse.rightButton();
        mouse.scrollButton();
    }
    void supportedOS (String ... os) { //1 variable length list, giống như 1 mảng String[] os
        //cách in thứ 1
//        for (int i = 0; i < os.length; i++) { //os là 1 mảng
//            System.out.println(os[i]); //in ra các phần tử của mảng
//        }
        //cách in thứ 2
        for (String operatingSystem : os) {
            System.out.println(operatingSystem);
        }
    }
    
    double discount (int quantity, boolean isStudent) { //phương thức giảm giá, quantity: số lượng
        double discountedPrice = 0;
        if (quantity > 2) { //nếu số lượng lớn hơn 2
            discountedPrice = price*0.4; //giảm giá 60%
        } else { //mặt khác
            discountedPrice = price*0.5; //giảm giá 50%
        }
        if (isStudent) { //nếu người mua hàng là học sinh sinh viên
            discountedPrice -= 2; //giảm 2 đô
        }
        return discountedPrice;
    }
    
    double discount (int quantity) { //phương thức giảm giá nhận vòa 1 tham số
        double discountedPrice = 0;
        if (quantity > 3) {
            discountedPrice = price*0.4;
        } else {
            discountedPrice = price*0.5;
        }
        return discountedPrice;
    }
    
    double discount () { //phương thứ giảm giá không nhận vào tham số nào
        double discountedPrice = 0;
        discountedPrice = price * 0.5;
        return discountedPrice;
    }
    void run () { //phương thức chạy, in ra các thuộc tính của laptop
        System.out.println(name + " | " + CPU + " | " + RAM + " | " + price);
    }
    void start() { //phương thức khởi động
        System.out.println("Start...");
    }
    
    void shutdown () { //phương thức tắt máy
        System.out.println("Shutdown...");
    }
    
    void restart() { //phương thức khởi động lại
        System.out.println("Retart...");
    }
}


