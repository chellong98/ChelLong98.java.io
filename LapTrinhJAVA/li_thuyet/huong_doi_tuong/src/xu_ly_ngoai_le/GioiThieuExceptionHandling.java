/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xu_ly_ngoai_le;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GioiThieuExceptionHandling {

    public static void main(String[] args) {
        int ar[] = {1, 2, 3};
        try {
            operation();
            ar[4] = 2;
        }
        catch (ArrayIndexOutOfBoundsException abe) { //tạo ra 1 đối tượng đối với lỗi vượt quá giá trị phần tử mảng
            System.out.println("exception: " + abe.getMessage()); //in ra thông tin lỗi
            abe.printStackTrace(); //in ra thông báo lỗi
        }
        catch (FileNotFoundException ae) {
            System.out.println("exception: " + ae.getMessage());
        }
         catch (Exception e){
             System.out.println(e.getMessage());
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    static void operation() throws FileNotFoundException, Exception { //phải throws lỗi FileNotFoundException vì đây là lỗi checked, còn các lỗi ArithmeticException và ArrayIndexOutOfBoundsException là lỗi runtime nên không cần throws
        File f = new File("C:\\file.txt"); //đọc 1 file 
        if (!f.exists()) { //nếu file đó không tồn tại
            throw new FileNotFoundException ("không có file"); //từ khóa throw cho phép in ra thông báo lỗi tự định nghĩa
        }
        FileInputStream fis = new FileInputStream(f);
        
        int a = 5;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException ("mẫu  bằng 0");// in ra lỗi luôn không cần catch
        }
        int c = a / b;
            
    }
}
