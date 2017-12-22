/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Fee extends Account{ //lớp tài khoản thường

    @Override
    public void endMonthCharge() {
//        this.Blance();
        Fee.balance = Fee.balance - 5;
    }
    public static void main(String[] args) {
        Fee acc = new Fee();
        acc.napTien(100, "tháng 7");
        acc.napTien(20, "tháng 8");
        acc.endMonthCharge();
        System.out.println("số tiền còn lại trong tài khoản: " + Fee.balance);
        System.out.println("số giao dich: " + acc.transactions);
        
    }

   

}
