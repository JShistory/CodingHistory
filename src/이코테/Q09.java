package ภฬฤฺลื;

import java.util.ArrayList;
import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String count1 = "";
		int answer = s.length();
		String compressed = "";
		for (int i = 1; i < (int)s.length() / 2 + 1; i++) {
			compressed = "";
			String prev = s.substring(0, i);
			int count = 1;
			for (int j = i; j < s.length()-1; j += i) {
				
				
				if (prev.equals(s.substring(j, j + i))) {
					count += 1;

				} else {
					
					if (count !=1) {
						compressed += count + prev;
						prev = s.substring(j, j + i);
						count = 1;
						
					} else {
						compressed += prev;
						count=1;
					}
				}
			}
			
			if (count !=1) {
				compressed += count + prev;
			} else {
				compressed = prev;
			}
		}
		System.out.println(compressed);
		System.out.println(Math.min(answer, compressed.length()));

	}

}
