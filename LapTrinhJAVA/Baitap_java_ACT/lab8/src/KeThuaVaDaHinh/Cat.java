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
public class Cat extends Animal{

    private static int population = 0;
    public Cat (String name) {
        super(name);
        System.out.println("đẻ ra 1 con mèo!");
        population++;
    }

    public int getPopulation() {
        return population;
    }
    
    @Override
    public void makeASound() {
        System.out.println("Make A sound: Meow Meow");
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm " + this.name);
        this.makeASound();
    }

    @Override
    public void giveBirth() {
        Cat catBaby = new Cat(this.name + "s baby");
        catBaby.introduce();
    }
    
}
