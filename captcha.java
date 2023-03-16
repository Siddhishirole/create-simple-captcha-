import java.util.*;
import java.io.*;

class siddhi
{
	
	
	static boolean checkCaptcha(String captcha, String user_captcha)
	{
		return captcha.equals(user_captcha);
	}
	
		static String generateCaptcha(int n)
	{
		
		Random rand = new Random(62);
		
		
		String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
		
		String captcha = "";
		while (n-->0){
			int index = (int)(Math.random()*62);
			captcha+=chrs.charAt(index);
		}
		
		return captcha;
	}
	
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		String captcha = generateCaptcha(9);
		System.out.println(captcha);
	
		System.out.println("Enter above CAPTCHA: ");
		String usr_captcha = reader.readLine();
	
		
		if (checkCaptcha(captcha, usr_captcha))
			System.out.println("CAPTCHA Matched");
		else
			System.out.println("CAPTCHA Not Matched");
	}
}



}
