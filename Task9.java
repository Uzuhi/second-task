package nes;

import java.io.PrintStream;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		String word1 = s.nextLine();
		String word2 = s.nextLine();
		if (isStrange(word1, word2)) 
			ps.print("true");
		else 
			ps.print("false");
	}
	public static boolean isStrange(String a, String b) 
		throws java.io.UnsupportedEncodingException
	{
		if (a.charAt(0) != b.charAt(b.length()-1))
			return false;
		if (b.charAt(0) != a.charAt(a.length()-1))
			return false;
		return true;
	}
}
