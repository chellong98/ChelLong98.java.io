/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Long Nguyen Nhat
 */
public class TextFileFactory {

    public static boolean ghiFile(List<Student> list, String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }

    public static ArrayList<Student> docFile(String path) {
        ArrayList<Student> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("không tìm thấy file");
            }
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            String[] arr = new String[3];
            int i = 0;
            while (line != null) {
                if (!line.contains("-")) {
                    arr[i++] = line;
                    if (i == 3) {
                        list.add(new Student(arr[0], Integer.parseInt(arr[1]), arr[2]));
                        i = 0;
                    }
                }
                line = br.readLine();
            }
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
