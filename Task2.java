package nes;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Task1 {
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
			num.add(Integer.parseInt (pr));
		}
		ps.print(defferenceMinMax(num));
	}
	public static int defferenceMinMax(ArrayList<Integer> a) 
		throws java.io.UnsupportedEncodingException
	{
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		int min = a.get(0);
		int max = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i) < min)
				min = a.get(i);
			else if (a.get(i) > max)
				max = a.get(i);
		}
		return (max-min);
	}
}
