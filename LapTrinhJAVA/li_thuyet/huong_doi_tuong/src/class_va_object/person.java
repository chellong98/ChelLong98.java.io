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
public class person {
    String name;
    int tuoi;
    
    public void setName (String name) { //gán giá trị cho thuộc tính
        this.name = name; //từ khóa this để tham chiếu đến thuộc tính của class, khác với tham số name trong phương thức
    }
    public String getName () { //trả lại giá trị vừa gán cho hàm
        return name;
    }
    public void setTuoi (int tuoi) {
        this.tuoi = tuoi;
    }
    public int getTuoi () {
        return tuoi;
    }
    
    public void eat () {
        System.out.println("ăn uống");
    }
}
