/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.StringTokenizer;

/**
 *
 * @author Long Nguyen Nhat
 */
public class NgatChuoiVoiStringTokenier {
    public static void main (String [] args) {
        String s = "How are you? Thanks for your letter. I am so happy because you always miss and think of me. Now, I am working as a teacher in the milytary academy logistics . I start my working day at 7 pm every morning and finish it at 5 pm. You know I love this job, right? It has been my dream to become a good teacher for such a long time. I like my job because I can use my ability and knowledge to finish my work the best. Morever, I can study valuable experience from colleagues not only about work but also about life. Now every day is wonderful day with me. And you, your job is very interesting, isn't it? Let you tell me about it in the next letter";

        StringTokenizer stk = new StringTokenizer(s, ".?, "); // hàm StringTokenier không nhận regular expression, chỉ nhận vào chuỗi cần ngắt và delimiter
        
        while (stk.hasMoreTokens()) { //giống sc.hasNext() kiểm tra xem còn token trong chuỗi không
            String token = stk.nextToken(); //giống sc.next)() lấy ra các token đã đc ngắt
            System.out.println(token);
        }
//System.out.println(Math.rint((double)('k' / 9 * 95)));
    }      
}
