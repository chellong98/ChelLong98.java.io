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
public class sonyMouse extends Mouse implements USBinterface {//thừa kế từ class mouse

    public sonyMouse() { //default constructor
        super("", 0.0);
    }

    public sonyMouse(String manufacturer, double price) { //constructor tự định nghĩa
        super(manufacturer, price);
    }

    @Override //không cần để ý cái này
    public void leftButton() { //hiện thực lại phương thức leftButton
        System.out.println("Sony: left clicked");
    }

    @Override
    public void rightButton() {
        System.out.println("Sony: right clicked");
    }

    @Override
    public void scrollButton() {
        System.out.println("Sony: scroll clicked");
    }

    @Override
    public void connectUSBport() { //các đối tượng thực hiện hợp đồng ấy
        System.out.println("Sony mouse: connect to USBport");
    }
}
