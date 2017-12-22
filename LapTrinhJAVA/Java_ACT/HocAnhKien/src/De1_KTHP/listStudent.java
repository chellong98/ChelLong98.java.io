/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_KTHP;

import java.util.*;

/**
 *
 * @author Long Nguyen Nhat
 */
//thêm sinh viên, xóa sinh viên
public class listStudent {
    Scanner sc = new Scanner (System.in);
    Set<Student> set = new HashSet<>();
    
    public void add () {
        Student student = new Student();
        System.out.println("nhập họ tên: ");
        student.setHoten(sc.nextLine());
        System.out.println("nhập ngày sinh: ");
        student.setDiachi(sc.nextLine());
        System.out.println("nhập giới tính (1 là nam | 0 là nữ):");
        student.setGioitinh(sc.nextInt());
    }
}
