/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Lesson11.BaiTap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Fuction {

    public void duyetFile() {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào đường dẫn folder: ");
        fileName = sc.nextLine();
        try {
            File file = new File(fileName);
            File[] fileObjects = null;
            if (file.isDirectory()) {
                fileObjects = file.listFiles();
            }
            for (int i = 0; i < fileObjects.length; i++) {
                if (fileObjects[i].isFile()) {
                    System.out.println("file: " + fileObjects[i].getCanonicalPath());
                } else {
                    System.out.println("folder: " + fileObjects[i].getCanonicalPath());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xoaFile() {
        String fileName;
        System.out.println("nhập vào tên file: ");
        fileName = new Scanner(System.in).nextLine();
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("tạo file thành công");
            } else {
                file.delete();
                System.out.println("xóa file thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void taoFile() {
        System.out.println("nhập tên file: ");
        String fileName = new Scanner(System.in).nextLine();
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("tạo file thành công");
            }
            PrintWriter pw = new PrintWriter(file);
            System.out.println("nhập nội dung file: ");
            String nd = "";
            while(!nd.equals("exit")) {
                nd = new Scanner(System.in).nextLine();
                pw.println(nd);
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doiTenFile() {
        System.out.println("nhập vào tên file: ");
        String fileName = new Scanner(System.in).nextLine();
        File file1 = new File(fileName);
        System.out.println("nhập vào tên file mới: ");
        String fileNameNew = new Scanner(System.in).nextLine();
        File file2 = new File(fileNameNew);
        if (file1.renameTo(file2)) {
            System.out.println("đổi tên file thành công");
        }
    }
}
