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
public class Cow extends Animal{
        private static int population = 0;

     public Cow (String name) {
        super(name);
         System.out.println("đẻ ra 1 con bò!");
         population++;
    }

    
     public int getPopulation() {
        return population;
    }
     
    
    @Override
    public void makeASound() {
        System.out.println("Make A Sound: bofffff");
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm " + this.name);
        this.makeASound();
    }

     @Override
    public void giveBirth() {
        Cow cowBaby = new Cow(this.name + "s baby");
        cowBaby.introduce();
    }
}
