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
public class appleMouse extends Mouse implements USBinterface, WirelessUSBinterface { //khả năng có thể kết nối với cả USB và WirelessUSB

    public appleMouse() {

    }

    public appleMouse(String manufacturer, double price) {
        super(manufacturer, price);
    }

    @Override
    public void leftButton() {
        System.out.println("Apple: left clicked");
    }

    @Override
    public void rightButton() {
        System.out.println("Apple: right clicked");
    }

    @Override
    public void scrollButton() {
        System.out.println("Apple: scroll clicked");
    }

    @Override
    public void connectUSBport() { //các đối tượng thực hiện hợp đồng ấy
        System.out.println("Apple mouse: connect to USB port");
    }

    @Override
    public void connectWirelessUSBport() {
        System.out.println("apple mouse connect to WirelessUSB port");
    }

}
