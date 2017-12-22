/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//The Java S W Properties class is a great class for storing data for your application, 
//since it consists of a hashtable data structure of String keys with a String value for each key.
//Lớp WritePropertiesFile tạo một đối tượng Properties và đặt ba cặp khóa / giá trị trong đối tượng Properties. 
//Tiếp theo, nó sẽ mở ra một dòng đầu ra cho tệp test2.properties. 
//Cuối cùng, nó gọi phương thức lưu trữ của đối tượng Properties và bao gồm dòng nhận xét.
public class WritePropertiesFile {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();//tạo ra 1 đối tượng properties
			properties.setProperty("favoriteAnimal", "cat"); //
			properties.setProperty("favoriteObject", "information security");
			properties.setProperty("favoritePerson", "Hacker");

			File file = new File("test.properties"); //tạo file
			FileOutputStream fileOut = new FileOutputStream(file);//dòng vào file
			properties.store(fileOut, "Favorite Things");//phương thức store chưa các cặp khóa - giá trị và 1 dòng cmt
			fileOut.close();
		} catch (FileNotFoundException e) { //bắt lỗi file không tồn tại
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}