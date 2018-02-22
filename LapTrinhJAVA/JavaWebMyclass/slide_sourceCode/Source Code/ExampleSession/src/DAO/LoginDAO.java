package DAO;

public class LoginDAO 
{
	public static boolean Validate (String pass)
	{
		boolean kt = false;
		
		if (pass.equals("123"))
		{
			kt = true;
		}
			
		return kt;
	}
}
