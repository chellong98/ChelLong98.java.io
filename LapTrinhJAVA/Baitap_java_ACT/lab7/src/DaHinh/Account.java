/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

import java.util.*;

/**
 *
 * @author Long Nguyen Nhat
 */
public abstract class Account {
    protected static long balance = 0;
    protected static int transactions = 0;
    
    List<RutTien> list = new ArrayList<>();
    public void rutTien (long SoTienRut, String month) {
        RutTien ruttien = new RutTien(SoTienRut, month);
        System.out.println(ruttien);
        list.add(ruttien);
        balance -= SoTienRut;
        transactions++;
    }
    List<NapTien> list1 = new ArrayList<>();
    public void napTien(long SoTienNap, String month) {
        NapTien naptien = new NapTien(SoTienNap, month);
        System.out.println(naptien);
        list1.add(naptien);
        balance += SoTienNap;
        transactions++;
    }
//    public void Blance () { 
//        long InBalance = 0; //biến tính số tiền nạp vào
//        long OutBalance = 0;//biến tính sô tiền rút ra
//        for (int i = 0; i < list1.size(); i++) {
//            long element = list1.get(i).getSoTienNap();
////            System.out.println(list1.get(i));
//            InBalance += element;
//        }
//        for (int i = 0; i < list.size(); i++) {
//            long element = list.get(i).getSoTienRut();
////            System.out.println(list.get(i));
//            OutBalance += element;
//        }
//        balance = InBalance - OutBalance ; //số tiền trong tài khoản hiện tại bằng số tiền nạp trừ số tiền rút và thêm bớt)(nếu có)
//        if (balance < 0) {
//            return ;
//        }
//    }


//    public int getTransactions() {
//        return transactions;
//    }
    
    public abstract void endMonthCharge();
//    public static void main(String[] args) {
//        Account acc = new Account();
////        Account acc1 = new Account();
//        acc.napTien(10000000, "tháng 7");
//        acc.napTien(3000000, "tháng 8");
//        acc.rutTien(5000000, "tháng 9");
//          acc.setBalance();
//        System.out.println("số tiền hiện có trong tài khoản là: " + acc.getBlance());
//        System.out.println("số lần giao dịch là: " + Account.transactions);
//    }
}
