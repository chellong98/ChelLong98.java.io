/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopvadoituong;

/**
 * 2. Tạo lớp phân số PS có hai thuộc tính là tử và mẫu a. Xây dựng hai hàm khởi
 * tạo có tham số khác nhau b. Xây dựng các phương thức cộng, trừ, nhân, chia
 * phân số.
 *
 * @author Long Nguyen Nhat
 */
public class PhanSo {

    private int tu;
    private int mau;

    public PhanSo() {
        this(0, 0);
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
    
}
