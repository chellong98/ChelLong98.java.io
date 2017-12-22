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
public class Dog extends Animal {

    private static int population = 0;

    public Dog(String name) {
        super(name);
        System.out.println("đẻ ra 1 con chó!");
        population++;
    }

    public Dog() {
        
    }
    public int getPopulation() {
        return population;
    }

    
    @Override
    public void makeASound() {
        System.out.println("Make A Sound: gogogogo");
    }

    @Override
    public void introduce() {
        System.out.println("Hi! i'm " + this.name);
        this.makeASound();
    }

     @Override
    public void giveBirth() {
        Dog dogBaby = new Dog(this.name + "s baby");
        dogBaby.introduce();
    }
}
