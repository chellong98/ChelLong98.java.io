/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThuaVaDaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Animal {
    protected String name;
    public static int population;
    public Animal () {
        
    }
    
    
   
    public Animal (String name)  {
        this.name = name;
    }
    public abstract void makeASound();
    public abstract void introduce();
    public abstract void giveBirth();
}
