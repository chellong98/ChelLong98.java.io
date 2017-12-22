/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan;

/**
 *
 * @author Long Nguyen Nhat
 * Số thành viên trong hộ ( số người)
 */
public class HoDan extends KhuPho{
    private int amount;
    private Nguoi nguoi[];
    private int Nindex = 0;

    public HoDan () {
        
    }
    
    public HoDan (int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        this.nguoi = new Nguoi[amount]; //mỗi lần set 1 amount thì tạo ra 1 mảng người
    }

    public Nguoi getNguoi(int index) {
        return this.nguoi[index];
    }

    public void setNguoi(Nguoi nguoi) {
        //this.nguoi[this.Nindex] = new Nguoi(); 
        this.nguoi[this.Nindex++] = nguoi; //?sao đâu a
    }

   
   
   
}
