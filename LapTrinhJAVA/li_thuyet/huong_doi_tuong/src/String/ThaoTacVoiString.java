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
public class ThaoTacVoiString {
    public static void main (String[] args) {
        String s = "nguyen nhat long"; //1 chuỗi
        
        System.out.println("lí tự đầu tiên: " + s.charAt(0)); //hàm lấy phần tử ở vị trí nào đó trong chuỗi, ở đây lấy phần tử đầu
        
        System.out.println("kí tự cuối cùng: " + s.charAt(s.length() - 1)); //lấy phần tử cUỐI
        
        if (s.contains("long")){ // phương thức kiểm tra chuỗi con, trả về true hoặc false
            
            int index = s.indexOf("nhat");  // phương thức lấy ra vị trí bắt đầu của chuỗi con trong chuỗi lớn
            System.out.println("index = " + index);
            
            String str = s.substring(index); //hàm lấy chuỗi con bắt đầu từ vị trí index
            System.out.println(str);
            str = s.substring(index, 11); //hàm lấy chuỗi con ở vị đầu và vị trí kết thúc%
            System.out.println(str);
        }   
                
    }
}
