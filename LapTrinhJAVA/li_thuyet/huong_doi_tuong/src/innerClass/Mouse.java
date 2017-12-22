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
public abstract class Mouse {
    private String manufacturer;
    private double price;
    
    public Mouse () {
        this ("", 0.0);
    }
    public Mouse (String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }
    
    public abstract void leftbutton ();
    public abstract void rightbutton ();
    public abstract void scrollbutton ();
    
    public void getInfo () {
        System.out.println(manufacturer + " | " + price);
    }
}
