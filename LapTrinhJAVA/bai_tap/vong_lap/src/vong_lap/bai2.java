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
public class bai2 {

    public static void main(String[] args) {
        int i;
        System.out.println("cac so hexa la");
        System.out.print("=========================");
        for (i = 0; i <= 255; i++) {
            if (i % 16 == 0) {
                System.out.printf("\n%02x ", i);
            } else {
                System.out.printf("%02x ", i);
            }
        }
    }
}
