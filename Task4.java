package nes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args)
		throws java.io.UnsupportedEncodingException
	{
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		ArrayList<Integer> num = new ArrayList<Integer>();
		String pr = ")";
		while (true) {
			pr = s.nextLine();
			if (pr.equals(""))
				break;
			num.add(Integer.parseInt(pr));
		}
		ps.print(cumulativeSum(num));
	}
	public static ArrayList<Integer> cumulativeSum(ArrayList<Integer>a) {
		int sum = 0;
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(a.get(0));
		for (int i = 1; i < a.size(); i++) {
			sum += a.get(i-1);
			num2.add(a.get(i)+sum);
		}
		return num2;
	}
}
