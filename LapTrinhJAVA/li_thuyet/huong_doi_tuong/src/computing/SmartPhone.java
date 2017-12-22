/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computing;

/**
 *
 * @author Long Nguyen Nhat
 */
public class SmartPhone extends Computer { //kế thừa các thuộc tính, phương thức từ lớp Computer
    public SmartPhone (double price, int CPU,  int RAM, String name) {
        super (price, CPU, RAM, name);
    }
    
    public SmartPhone () {
//       super (0.0, 0, 0, "");
    }
    
    @Override
    public void run () { //phương thức overreading (viết lại), tên phương thức giống phương thức của class cha, nhg thân hàm là của class con
        System.out.println("thông tin SmartPhone: ");
//        System.out.println(price + " | " + CPU + " | " + RAM + " | " + name);
        super.run(); //kế thừa phương thức run từ lớp cha
    }
}
