package nes;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		String word = s.nextLine();
		ps.print(getDecimalPlaces(word));
	}
	public static int getDecimalPlaces(String a)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		String[] word2 = a.split(",");
		String a2 = word2[1];
		int coun = a2.length();
		return coun;
	}
}
