package nes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		String word1 = s.nextLine();
		String word2 = s.nextLine();
		if (word2.charAt(0) == '-') {
			if (isSuffix(word1, word2))
				ps.print("true");
			else
				ps.print("false");
		}
		else {
			if (isPrefix(word1, word2))
				ps.print("true");
			else
				ps.print("false");
		}
	}
	public static boolean isPrefix(String a, String b) 
		throws java.io.UnsupportedEncodingException
	{
		for (int i = 0; i < (b.length()-1); i++) 
			if (a.charAt(i) != b.charAt(i))
				return false;
		return true;
	}
	public static boolean isSuffix(String a, String b) 
		throws java.io.UnsupportedEncodingException
	{
		int ind = a.length()-1;
		for (int i = (b.length()-1); i > 0; i--) {
			if (a.charAt(ind) != b.charAt(i))
				return false;
			ind--;
		}
		return true;
	}
}
