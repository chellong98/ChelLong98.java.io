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
public class ThayTheChuoiCon {
    public static void main (String[] args) {
        String s = "This Is StrIng wIth some type!"; // 1 chuỗi có các chữ i viết sai thành I
        s = s.replace("I", "i"); //hàm replace (string1, string2) thay thế 1 bằng 2
        System.out.println("thay thế kí tự: " + s);
        
        s = "This Is34 Str34Ing 234wIth some234 type!"; //1 chuỗi cầ bỏ đi các số thừa
        s = s.replaceAll("\\d", ""); //hàm replaceAll cho phép thay thế 1 mẫu bằng 1 kí tự khác (ở ví dụ này là thay thế số)
        System.out.println("thay thế 1 mẫu: " + s);
        s = s.replace("I", "i");//sau khi xóa số thì thay I - i
        System.out.println(s);
        
        s = "This is$@$@ String *(&^*with some!#! type!"; //1 chuỗi có các kí tự đặc biệt
        s = s.replaceAll("[^\\w ]", "");// thay thế tất cả các kí tự ngoại trù a-z, 0-9 và dấu " "
        System.out.println("thay thế kí tự đặc biệt: " + s);
    }
}
