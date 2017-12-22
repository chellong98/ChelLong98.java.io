/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vong_lap;

/**
 *
 * @author chell
 */
public class vong_lap_3 {

    public static void main(String[] args) {
        boolean bool = 3 < 4;
        System.out.println(bool);
        while (bool) {
            System.out.println("Hello World");
            bool = 3 > 4;
        }
        int k;
        for (k = 0; k < 5; k++) {
            System.out.println("Hello World: " + k);
        }
    }
}
