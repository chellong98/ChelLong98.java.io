package ChelLong.javacoban.UI;

import java.util.StringTokenizer;

public class HocStringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BDD3G - XM7FB - BD2HM - YK63V - VQFDK";
		StringTokenizer tokens = new StringTokenizer(s,"- ");
		
		//in ra token, lấy khoảng trắng làm delimiter
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}

}
