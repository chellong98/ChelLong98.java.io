/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;
import java.io.File; //thư viện file
/**
 *
 * @author Long Nguyen Nhat
 */
public class methodInFile {
    public static void main(String[] args) {
        try {
            String fileName = "G:\\LapTrinhJAVA\\li_thuyet\\huong_doi_tuong\\src\\File\\text.txt"; //đường dẫn file
            File file = new File(fileName); //tạo 1 đối tượng file
            System.out.println("parent folder: " + file.getParent());//phương thức in ra thư mục chứa file
            System.out.println("can read? " + file.canRead());//kiểm tra xem có đọc đc file k?
            System.out.println("can write? " + file.canWrite());//kiểm tra file xem có ghi đc k?
            if (file.exists()) {//kiểm tra file có tồn tại k
                System.out.println("deleted File? " + file.delete());//method delete file
            } 
            if (!file.exists()){
                System.out.println("created File? " + file.createNewFile());
            }
            System.out.println("is File? " + file.isFile());//kiểm tra xem đây có phải 1 file k?
            System.out.println("is Directory? " + file.isDirectory());//kiểm tra đây có phải thư mục k?
            
            
            String directoryName = "G:\\LapTrinhJAVA\\li_thuyet\\huong_doi_tuong\\src\\File";
            File file1 = new File (directoryName);// đọc thư mục
            File fileList[] = file1.listFiles();//lấy ra các file và các thư mục con
            for (int i = 0; i < fileList.length; i++) {
                File fileObject = fileList[i];
                if (fileObject.isFile()) {//kiểm tra là file hay không
                    System.out.println("FILE: " + fileObject.getCanonicalPath());//lấy ra đường dẫn file
                } else { //nếu là thư mục
                    System.out.println("Directory: " + fileObject.getCanonicalPath());//in ra đường dẫm thư mục 
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
