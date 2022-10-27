package nes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ps.print(fib(num));
	}
	public static int fib(int a) 
		throws java.io.UnsupportedEncodingException
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		if(a == 1)
			return 1;
		else if (a == 2)
			return 2;
		int num = 2;
		while (num != a) {
			numbers.add(numbers.get(num-1) + numbers.get(num-2));
			num++;
		}
		return numbers.get(num-1);
	}
}
