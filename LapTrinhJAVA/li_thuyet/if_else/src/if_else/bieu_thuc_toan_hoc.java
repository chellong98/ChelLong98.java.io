/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

/**
 *
 * @author chell
 */
public class bieu_thuc_toan_hoc {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int result;

        result = a + b;
        System.out.println(result);
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));

        //cung ap dung cho String
        String country = "Viet Nam";
        country = country + " tuoi dep";
        System.out.println(country);

        //dung thu vien Math
        System.out.println(Math.min(4, 5)); //min cua 2 so
        System.out.println(Math.PI); // so pi
        System.out.println(Math.random()%10.13);
        char character = 'e';
        System.out.println((char) character);
    }
}
