/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.util.Scanner;
import java.util.Date;


/**
 *
 * @author Long Nguyen Nhat
 */
public class Bai_tap_file {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhập vào tên file: ");
            String fileName = sc.nextLine();
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println("kích thước file: " + file.length());//length lấy ra kích thước file hiện tại tính theo byte
                System.out.println("có thể đọc file: " + file.canRead());
                System.out.println("có thể ghi file: " + file.canWrite());
                System.out.println("thư mục cha: " + file.getParent());
                System.out.println("last modified: " + file.lastModified());// 1 số kiểu long biểu thị trừu tượng cho thời gian lần cuối chỉnh sửa
                Date date = new Date(file.lastModified());////truyền số long đó và date
                System.out.println("ngày chỉnh sửa gần nhất: " + date);//in ra time
            }
            if (!file.exists()) {
                System.out.println("tạo file: " + file.createNewFile());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
