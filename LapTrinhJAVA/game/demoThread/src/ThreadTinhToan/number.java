/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTinhToan;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Long Nguyen Nhat
 */
public class number {

    static MyData data;

    //flag = 0 là không ai đc dùng tài nguyên
    //flag = 1 A đc dùng tài nguyên
    //flag = 2 B đc dùng tài nguyên
    //flag = 3 thì C dc dùng tài nguyên
    public static void main(String[] args) {
        data = new MyData();
        data.setFlag(1);
        Thread a = new Thread(new Runnable() { //luồng a
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (data) { //kiểm soát dữ liệu, tại 1 thời điểm chỉ có 1 luồng chạy
                        if (data.getFlag() == 1) {
                            try {
                                int soA = new Random().nextInt(100);
                                data.setSoA(soA);
                                System.out.println("A= " + soA);
                                Thread.sleep(1000);
                                data.setFlag(2);
                                data.notifyAll();
                            } catch (Exception e) {
                            }

                        } else {
                            try {
                                data.wait();//chờ dữ liêu
                            } catch (InterruptedException ex) {
                            }
                        }
                    }
                }
            }
        });

        Thread b = new Thread(new Runnable() { //luồng b
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (data) { //kiểm soát dữ liệu
                        if (data.getFlag() == 2) {
                            try {
                                int soB = new Random().nextInt(100);
                                data.setSoB(soB);
                                System.out.println("B= " + soB);
                                Thread.sleep(1000);
                                data.setFlag(3);
                                data.notifyAll();//đánh thức các thread
                            } catch (Exception e) {
                            }
                        } else {
                            try {
                                data.wait();
                            } catch (InterruptedException ex) {
                            }
                        }
                    }
                }
            }
        });

        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (data) {
                        if (data.getFlag() == 3) {
                            try {
                                System.out.println("Tong A+B= : " + (data.getSoA() + data.getSoB()));
                                Thread.sleep(1000);
                                data.setFlag(1);
                                data.notifyAll();
                            } catch (Exception e) {
                            }
                        } else {
                            try {
                                data.wait();
                            } catch (InterruptedException ex) {
                            }
                        }
                    }
                }
            }
        });
        a.start();
        b.start();
        c.start();

    }
}
