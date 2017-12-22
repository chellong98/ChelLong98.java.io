/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8DaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void run();
    
    public abstract  void prinInfo(String name);
}
