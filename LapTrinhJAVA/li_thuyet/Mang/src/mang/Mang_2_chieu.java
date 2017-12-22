/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

/**
 *
 * @author chell
 */
public class Mang_2_chieu {
    public static void main (String[] args) {
        int a[][] = new int[3][4];
        a[0][0] = 1;
        a[2][3] = 9;
        a[1][2] = 5;
        
        int i,j;
        for (i=0; i < a.length; i++) {
            for (j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
