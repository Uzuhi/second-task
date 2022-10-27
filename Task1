package nes;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int num = s.nextInt();
		repeat(word, num);
	}
	public static void repeat(String a, int b) 
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		for (int i = 0; i < a.length(); i++) 
			for (int j = 0; j < b; j++) 
				ps.print(a.charAt(i));
	}
}
