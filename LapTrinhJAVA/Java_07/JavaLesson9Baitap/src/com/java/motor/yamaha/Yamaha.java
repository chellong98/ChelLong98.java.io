/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.motor.yamaha;

import com.java.motor.Motor;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Yamaha {
    static int menu() {
        System.out.println("1. input: ");
        System.out.println("2. display: ");
        System.out.println("3. Sort ");
        System.out.println("4. Search ");
        System.out.println("5. Thoat ");
        System.out.println("================");
        System.out.println("mời bạn nhập vào lựa chọn: ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        return choice;
    }
    public static void sortJupiter (Jupiter jupiter[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if (jupiter[j-1].getWarranty() > jupiter[j].getWarranty()) {
                    Jupiter temp = jupiter[j-1];
                    jupiter[j-1] = jupiter[j];
                    jupiter[j] = temp;
                }
            }
        }
    }
    public static void sortSirius (Sirius sirius[], int m) {
        for (int i = 0; i < m; i++) {
            for (int j = m-1; j > i; j--) {
                if (sirius[j-1].getWarranty() > sirius[j].getWarranty()) {
                    Sirius temp = sirius[j-1];
                    sirius[j-1] = sirius[j];
                    sirius[j] = temp;
                }
            }
        }
    }
    public static void sortMotor(Motor motor[], Jupiter jupiter[], Sirius sirius[], int n, int m){
        int i=0,j=0;
        for (int k = 0; k < m+n; k++) {
            if (i>=n) {
                motor[k] = (Motor)sirius[j++];
            } else if (j>=m) {
                motor[k] = (Motor)jupiter[i++];
            } else {
                if (jupiter[i].getWarranty() < sirius[j].getWarranty()) {
                    motor[k] = (Motor)jupiter[i++];
                } else {
                    motor[k] = (Motor)sirius[j++];
                }
            }
        }
    }
    public static void main(String[] args) {
        Motor[] motors = new Motor[6];
        Jupiter[] jupiter = new Jupiter[2];
        Sirius[] sirius = new Sirius[2];
        do {            
            int choice = menu();
            switch(choice) {
                
                case 1: {
                    
                    for (int i = 0; i < 4; i++) {
                        if (i<2) {
                            System.out.println("-----------jupiter-----------");
                            motors[i] = new Jupiter();
                            motors[i].inputInfor();
                        } else {
                            System.out.println("-----------sirius------------");
                            motors[i] = new Sirius();
                            motors[i].inputInfor();
                        }
                    }
                } break;
                case 2: {
                    System.out.println("in thông tin các loại motor: ");
                    for (int i = 0; i < 4; i++) {
                        motors[i].displayInfo();
                    }
                }break;
                case 3: {
                    int j=0, k = 0;
                    for (int i = 0; i < motors.length; i++) {
                        if (motors[i] instanceof Jupiter) {
                            jupiter[j++] = (Jupiter)motors[i];
                        }
                        if (motors[i] instanceof Sirius) {
                            sirius[k++] = (Sirius)motors[i];
                        }
                    }
                    sortJupiter(jupiter, jupiter.length);
                    sortSirius(sirius, sirius.length);
                    sortMotor(motors, jupiter, sirius, jupiter.length, sirius.length);
                }
            }         
        }while (true);
    }
}
