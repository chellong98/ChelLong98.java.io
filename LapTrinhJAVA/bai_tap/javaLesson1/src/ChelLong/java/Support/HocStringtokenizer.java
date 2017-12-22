/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.java.Support;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Long Nguyen Nhat
 */
public class HocStringtokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("nhập vào 1 chuỗi: ");
        str = sc.nextLine();
        StringTokenizer token = new StringTokenizer(str);
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}
