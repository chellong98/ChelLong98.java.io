/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Long Nguyen Nhat
 */
public class NgatChuoiVoiSplit {
    public static void main (String[] args) {
        String s = "How are you? Thanks for your letter. I am so happy because you always miss and think of me. Now, I am working as a teacher in the milytary academy logistics . I start my working day at 7 pm every morning and finish it at 5 pm. You know I love this job, right? It has been my dream to become a good teacher for such a long time. I like my job because I can use my ability and knowledge to finish my work the best. Morever, I can study valuable experience from colleagues not only about work but also about life. Now every day is wonderful day with me. And you, your job is very interesting, isn't it? Let you tell me about it in the next letter";
        String tokens[] = s.split("[. ?]+"); //phương thức split() lưu các token vào 1 mảng, phương thức này cần xác định rõ delimiter, (ở đây là khoảng trắng)
        
        System.out.println("tổng số lượng token: " + tokens.length); //in ra độ dài của mảng chuỗi chính là số lượng token
        for (String token : tokens) { 
            System.out.print(token + " ");
        }
        
        String s1 = "Exerise 6: Could you give me some advice? I'm going to spend my next summer holiday in your country? Where should I go? What should I see?";
        String tokens2[] = s1.split("[ ]");
        System.out.println("\nsô lượng token: " + tokens2.length);
        for (String token : tokens2) {
            System.out.println(token);
        }
    }
}
