/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Teacher extends Person {

    private String rank;

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public Teacher() {
    }

    public Teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Teacher{" + "rank=" + rank + ", " + super.toString() + "}";
    }

    public void input() {
        super.input();
        System.out.println("nhập rank: ");
        Scanner sc = new Scanner(System.in);
        this.setRank(sc.nextLine());
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.input();
        System.out.println(teacher);
    }
}
