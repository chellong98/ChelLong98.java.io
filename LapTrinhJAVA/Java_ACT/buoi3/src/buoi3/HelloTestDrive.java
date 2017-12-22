/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

/**
 *
 * @author Long Nguyen Nhat
 */
class Hello {

    public static String message = "Hello , World";

    public static void sayHello() {
        System.out.println(message);
    }

    public void sayHello(String msg) {
        System.out.println(msg);
    }
}

public class HelloTestDrive {

    public static void main(String[] args) {
        Hello.message = "Hello";
        Hello.sayHello();
        System.out.println(Hello.message);
        Hello h = new Hello();
        h.sayHello();
        h.sayHello("Hello , World");
    }
}
