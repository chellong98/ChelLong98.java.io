/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerClass;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main (String[] args) {
        
        Computer com = new Computer (10.9, 4, "my computer", 8);
        Computer.laptop dell = com.new laptop (); //tạo đốitượng của lóp con
        dell.print();
        
        Mouse mouse = new Mouse ("my mouse", 9.8) {
            @Override
            public void leftbutton() {
                System.out.println("left clicked");
            }

            @Override
            public void rightbutton() {
                System.out.println("right clicked");
            }

            @Override
            public void scrollbutton() {
                System.out.println("scroll clicked");
            }
        };
        
        mouse.getInfo();
        mouse.leftbutton();
        mouse.rightbutton();
        mouse.scrollbutton();
        
        Computer asus = new Computer (6.7, 4, "ASUS", 4);
        System.out.println(asus); //in ra chuỗi đại diện cho đối tượng
        Computer mac = new Computer (3.4, 6, "MAC OS", 4);
        System.out.println(mac);
        
        if (asus.equals(mac) == true) { //so sánh đối tượng này với đối tượng khác
            System.out.println("bằng nhau");
        } else {
            System.out.println("không bằng nhau");
        }
    }
}
