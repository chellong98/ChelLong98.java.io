/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Long Nguyen Nhat
 */
public class CoBanVeString {
    public static void main (String[] args) {
        
        String s1 = "hello"; // 1 vùng nhớ có địa chỉ 0x1234 đc tạo ra 
        s1 = "Hello World"; //1 vùng nhớ có địa chỉ 0x34243 đc tạo ra
        s1 = "hello";//1 vùng nhớ có địa chỉ 0x23425 dc tạo ra
        System.out.println(s1);
        String s2 = "hello"; //lúc này s1 và s2 đang tham chiếu đến vùng nhớ có giá trị hello
        if (s1 == s2) { //cho kết quả bằng nhau vì đang tham chiếu đến cùng 1 địa chỉ
            System.out.println("bằng nhau");
        } else {
            System.out.println("không bằng nhau");
        }
        s2 = new String("hello"); //tạo ra 1 vùng nhớ mới cho s2 bằng constructor mặc định của String
        if (s1 == s2) { //cho kết quả không bằng nhau vì không tham chiếu đến cùng 1 địa chỉ
            System.out.println("bằng nhau");
        } else {
            System.out.println("không bằng nhau");
        }
        if (s1.equals(s2)) { //sử dụng hàm equals đế so sánh chuỗi
            System.out.println("bằng nhau");
        } else {
            System.out.println("không bằng nhau");
        }
        if (s1.equalsIgnoreCase(s2)) { //so sánh không phân biệt chữ hoa chữ thường
            System.out.println("bằng nhau");
        }
        
        StringBuilder str = new StringBuilder("Hello "); //class giúp chỉnh sửa trên đối tượng của String mà k tạo ra vùng nhớ mới
        System.out.println(str);
        str.append("World"); //thêm chuỗi vào chuỗi gốc
        System.out.println(str);
    }
}
