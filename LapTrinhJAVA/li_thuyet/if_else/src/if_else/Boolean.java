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
public class Boolean {

    public static void main(String[] args) {

        int a = 0;
        int b = 3;
        if (a < 10 && b > 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (a < 10 || b > 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // phan biet && va &
        //phan biet || va |
        //toan tu &&
        if (a++ > 10 && b-- > 5) { //vi dieu kien dau tien sai nen khong tiep tuc b--
            System.out.println("a: " + a + "b= " + b);
        } else {
            System.out.println("a: " + a + "\nb: " + b);
        }

        //toan tu ||
        if (a++ < 10 && b-- > 5) { //vi dieu kien dau tien dung nen khong tiep tuc b--
            System.out.println("a: " + a + "b= " + b);
        } else {
            System.out.println("a: " + a + "\nb: " + b);
        }
    }
}
