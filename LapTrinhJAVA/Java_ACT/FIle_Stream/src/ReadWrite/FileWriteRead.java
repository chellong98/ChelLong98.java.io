/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Long Nguyen Nhat
 */
public class FileWriteRead {
    public static void main(String[] args) {
        try {
            File file = new File ("tel.txt");
            FileReader fr = new FileReader(file);
            BufferedReader buf = new BufferedReader(fr);
            String line;
            int i=1;
            while ((line=buf.readLine())!=null) {
                System.out.println(i++ + " : " + line);
            }
            
            
            file = new File("tel2.txt");//đối tượng file
            FileWriter fw = new FileWriter(file);//đối tượng ghi file tham chiến đến file
            BufferedWriter bw = new BufferedWriter(fw);//đối tượng bộ đệm ghi tham chiếu đến đối tượng ghi file
            for (int j = 0; j < 3; j++) {
                String arg ="";
                if (j==0) {
                    arg = "phan quan";
                } else if (j==1) {
                    arg = "phan hai";
                } else if (j==2) {
                    arg = "the chot";
                }
                
                bw.write(arg );
                bw.write("              \n        ");
            }
            
            
            
//            file = new File ("tel.txt");
//            fr = new FileReader(file);
//            buf = new BufferedReader(fr);
//            file = new File("tel1.txt");
//            fw = new FileWriter(file);
//            bw = new BufferedWriter(fw);
//            
//            while ((line=buf.readLine())!=null) {
//                bw.write(line);
//                bw.write("\n");
//            }
//            
            bw.close(); //đóng file
        } catch (Exception e) {
          e.printStackTrace();
        }
        
    }
    
}
