/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xu_ly_ngoai_le;

import java.io.FileNotFoundException;
import static xu_ly_ngoai_le.GioiThieuExceptionHandling.operation;

/**
 *
 * @author Long Nguyen Nhat
 */
public class BatNhieuException {
     public static void main(String[] args) {
        int ar[] = {1, 2, 3};
        try {
            int a = 3;
            int b = 0;
            int c = a/b;
            ar[4] = 2;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException abe) { //cú phát bắt nhiều lỗi với 1 catch
            System.out.println("exception: " + abe.getMessage()); //in ra thông tin lỗi
        }
        

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
