package nes;

import java.io.PrintStream;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		String word = s.nextLine();
		if(isValid(word))
			ps.print("Почтовый индекс");
		else
			ps.print("Не почтовый индекс");
	}
	public static boolean isValid(String a) 
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		if (a.length() != 5) 
			return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ')
				return false;
			if ((a.charAt(i)!='0')&&(a.charAt(i)!='1')&&(a.charAt(i)!='2')&&(a.charAt(i)!='3')&&(a.charAt(i)!='4')&&(a.charAt(i)!='5')&&(a.charAt(i)!='6')&&(a.charAt(i)!='7')&&(a.charAt(i)!='8')&&(a.charAt(i)!='9'))
				return false;
		}
		return true;
	}
}
