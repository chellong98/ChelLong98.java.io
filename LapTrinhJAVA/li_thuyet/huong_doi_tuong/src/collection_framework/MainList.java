/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_framework;
import java.util.*; //import thư viện java.util
/**
 *
 * @author Long Nguyen Nhat
 */
public class MainList {
    public static void main(String[] args) {
        List list = new ArrayList();//tạo 1 colection List, List là 1 interface, ArrayList là 1 hiện thực trong List
        list.add(1); //phương thức thêm 1 object vào arraylist
        list.add(5.5);
        list.add(2);
        list.add("String");
        Computer com = new Computer ("dell", 4);
        list.add(com);//thêm 1 object
        Computer com1 = new Computer ("asus", 5);
        list.set(3, com1);//thay đổi 1 phần tử, tham số truyền vào là vị trí phần tử và object
        list.remove(1);//xóa phần tử theo chỉ cố
        list.remove(com);//xóa phần tử theo object
       
        for (Object element : list) { //các phần tử trong list đều có kiểu object
            System.out.println(element);
        }
        for (int i = 0; i < list.size(); i++) { //phương thức size giống length trong mảng
            System.out.println(list.get(i));//lấy ra phần tử theo chỉ sô phần tử
        }
    }
}
