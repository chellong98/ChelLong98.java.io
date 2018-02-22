package Mypack;

import java.util.*;

public class DAO 
{
	public static List<Users> ExportUsers()
	{
		List<Users> list = new ArrayList<Users>();
		
		list.add(new Users("tùng lâm","lập trình viên"));
		list.add(new Users("Web devaloper","Java"));	
		
		return list;
		
	}
	
	public static List<Student> ExportStudent()
	{
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(1,"tùng lâm"));
		list.add(new Student(2,"steve job"));
		list.add(new Student(3,"bill gate"));
		list.add(new Student(4,"mark"));
		list.add(new Student(5,"nguyễn từ quảng"));
		list.add(new Student(6,"nguyễn hà đông"));
		
		return list;
		
	}
}
