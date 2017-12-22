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
public class samsungMouse extends Mouse {

    public samsungMouse() {
        
    }

    public samsungMouse(String manufacturer, double price) {
        super(manufacturer, price);
    }

    @Override
    public void leftButton() {
        System.out.println("Samsung: left clicked button");
    }

    @Override
    public void rightButton() {
        System.out.println("Samsung: right clicked button");
    }

    @Override
    public void scrollButton() {
        System.out.println("Samsung: scroll clicked button");
    }

}
