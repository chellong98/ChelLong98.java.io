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
public class AnimalTest {

    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat("cat");//tạo 1 con 
        cat.introduce();
        Cat cat1 = new Cat("cat1");
        cat1.introduce();//giới thiệu
        Cat cat2 = new Cat("cat2");
        cat2.introduce();
        cat.giveBirth();//đẻ con
        
        System.out.println("số con mèo: " + cat.getPopulation());
        System.out.println();

        Dog dog = new Dog("dog");
        dog.introduce();
        Dog dog1 = new Dog("dog1");
        dog1.introduce();
        System.out.println("số con chó: " + dog.getPopulation());
        System.out.println();

        Cow cow = new Cow("cow");
        cow.introduce();
        System.out.println("số con bò: " + cow.getPopulation());
        System.out.println();

        Animal.population = cat.getPopulation() + dog.getPopulation() + cow.getPopulation();
        System.out.println("số lượng con vật là: " + Animal.population);
    }

}
