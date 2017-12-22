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
public class NickleDime extends Account{
    private static int withdrawCount;

    @Override
    public void rutTien(long SoTienRut, String month) {
        super.rutTien(SoTienRut, month); //To change body of generated methods, choose Tools | Templates.
        NickleDime.withdrawCount++;
        this.endMonthCharge();
    }
    
    
    @Override
    public void endMonthCharge() {
        NickleDime.balance =  NickleDime.balance - 1;
    }
    
    public static void main(String[] args) {
        NickleDime nick = new NickleDime();
        nick.napTien(100, "tháng 7");
        nick.napTien(300, "tháng 8");
        nick.rutTien(10, "tháng 7");
        nick.rutTien(50, "tháng 8");
        System.out.println("số giao dịch trong tháng: " + NickleDime.transactions);
        System.out.println("số lần rút tiền: " + NickleDime.withdrawCount);
        System.out.println("số tiền còn lại trong tài khoản: " + NickleDime.balance);
    }
}
