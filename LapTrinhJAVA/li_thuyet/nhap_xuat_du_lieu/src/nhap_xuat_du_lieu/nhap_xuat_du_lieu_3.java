/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap_xuat_du_lieu;

/**
 *
 * @author chell
 */
import java.util.Scanner;
public class nhap_xuat_du_lieu_3 {
    
    public static void rectangle (int len, int hei) {
        int i,j;
        for (i=0; i<hei; i++) {
            for (j=0; j<len; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("input length and height: ");
        m = sc.nextInt();
        n = sc.nextInt();
        rectangle(m,n);
    }
}
