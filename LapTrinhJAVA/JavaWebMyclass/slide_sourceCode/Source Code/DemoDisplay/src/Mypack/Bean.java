package Mypack;

import java.util.*;

public class Bean 
{
		public static List<Users> ExportUsers()
		{
			List<Users> list = new ArrayList<Users>();
			
			list.add(new Users("tùng lâm","giảng viên"));
			list.add(new Users("Java web","Myclass.vn"));
			
			return list;
		}
}
