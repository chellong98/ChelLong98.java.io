/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLesson12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class CustomManage {

    private List<Customer> dsKhachHang = null;

    public List<Customer> getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(List<Customer> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    public CustomManage() {
        dsKhachHang = new ArrayList<Customer>();
    }

    public boolean load(String file) {
        try {
            File f = new File(file);
            if (!f.exists()) {
                return false;
            }
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            setDsKhachHang((List<Customer>)data);
            return true;
        } catch (Exception e) {
            System.out.println("lỗi: " + e.toString());
        }
        return false;
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào tên: ");
        String name = (sc.nextLine());
        System.out.println("nhập vào địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("nhập vào tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        Customer cus = new Customer(name, id, address, age);
        if (dsKhachHang.add(cus)) {
            System.out.println("đã thêm 1 khách hàng vào list!");
        }

    }

    public Customer search(int id) {

        for (Customer cus : dsKhachHang) {
            if (cus.getId() == id) {
                return cus;
            }
        }
        return null;
    }

    public boolean save() {
        System.out.println("nhập vào file path: ");
        String filePath = new Scanner(System.in).nextLine();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.getDsKhachHang());
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            System.out.println("lỗi: " + e.toString());
        }
        return false;
    }

}
