package nes;

import java.io.PrintStream;
import java.util.Scanner;

public class Task10 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ps.print(boxSeq(num));
	}
	public static int boxSeq(int a) 
		throws java.io.UnsupportedEncodingException
	{
		int step = 0;
		if (a == 0)
			return step;
		for (int i = 1; i <= a; i++) {
			if (i%2 != 0) 
				step += 3;
			else
				step--;
		}
		return step;
	}
}
