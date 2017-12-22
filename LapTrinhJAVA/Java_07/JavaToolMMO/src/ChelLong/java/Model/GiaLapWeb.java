/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChelLong.java.Model;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Long Nguyen Nhat
 */
public class GiaLapWeb {
    public void testGoogle() throws IOException {
        WebClient webClient = new WebClient();//giả lập trình duyệt
        HtmlPage currentPage = webClient.getPage("http://www.google.com/"); //đại diện cho 1 trang web mà trình duyệt giả lập tham chiếu tới trang đó
        
        if(currentPage.getTitleText().equals("Google")) {
//            String textSource = currentPage.asXml();//lấy về web dưới dạng html
////            String textSource = currentPage.asText();//lấy về web dưới dạng text
//            File file = new File("G:\\LapTrinhJAVA\\Java_07\\JavaToolMMO\\data.txt");
//            PrintWriter pw = new PrintWriter(file);
//            pw.println(textSource);
//            if (file!=null) {
//                System.out.println("ghi file thành công");
//            } else {
//                System.out.println("ghi file thất bại");
//            }
//            pw.close();
////            System.out.println(textSource);
//            HtmlDivision imgElement = (HtmlDivision) currentPage.getHtmlElementById("hplogo");//tham chiếu đến div có id là hp logo
//            System.out.println(imgElement.getAttribute("width")); //lấy ra thuộc tính src
            
            HtmlAnchor gmail = currentPage.getAnchorByText("Gmail"); //currentpage tham chiếu tới neo Gmail
            currentPage = gmail.click();//click vào neo
            if (currentPage.getTitleText().equals("Gmail")) {//nếu lấy ra đúng tên gmail
                System.out.println(gmail);//in ra toString của anchor gmail là thẻ <a>
            }
        }
    }
}
