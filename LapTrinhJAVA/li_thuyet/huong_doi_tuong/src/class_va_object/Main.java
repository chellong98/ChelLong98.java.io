/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_va_object;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Main {
    public static void main (String[] args) {
        person p1 =  new person();
        p1.setName("nhật long"); //truyền giá trị cho hàm set
        p1.setTuoi(19);
        
        person p2 = new person();
        p2.setName("cảnh dương");
        p2.setTuoi(19);
        
        System.out.println(p1.getName() + " " + p1.getTuoi()); //in ra giá trị cuar hàm get
        p1.eat();
        System.out.println(p2.getName() + " " + p2.getTuoi());
        p2.eat();
    }
}
