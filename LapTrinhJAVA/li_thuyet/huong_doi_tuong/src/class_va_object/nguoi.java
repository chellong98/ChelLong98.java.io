/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_va_object;

public class nguoi {

    //tạo thuộc tính
    String name;
    String address;
    int tuoi;

    //tạo phương thức (hành động)
    public void travel(String name) {
        System.out.println(name + " đi lại ");
    }

    public static void main(String[] args) {
        nguoi person1 = new nguoi(); // tạo ra đối tượng người 1
        nguoi person2 = new nguoi(); //tạo đối tượng người 2
        person1.name = "nhật long"; //truy nhập đến thuộc tính name
        person2.name = "cảnh dương";

        person1.travel(person1.name); //truy nhập đến phương thức travel
        person2.travel(person2.name);
    }
}
